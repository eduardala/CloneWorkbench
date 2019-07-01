/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduarda.clone.Uteis;

import com.eduarda.clone.Interface.IGerador;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author eduardadelima
 */
public class GroupBy implements IGerador {
    
    //ATRIBUTOS
    private String nomeTabela;
    private String coluna;
    private String atributo;
    
    //CONSTRUTOR
    public GroupBy () {
        
    }
    //GERANDO OPERAÇÕES GROUP BY
    /**
     * 
     * @return String Builder com o scrip para realizar a operação com a tabela.
     */
    @Override
    public String gerador() {
        StringBuilder gb = new StringBuilder();
        gb.append("SELECT");
        gb.append(" ");
        
        if ((nomeTabela != null) && (coluna != null) && (atributo != null)) {
            gb.append(atributo);
            gb.append(",");
            gb.append(" ");
            gb.append("MAX");
            gb.append("(");
            gb.append(atributo);
            gb.append(")");
            gb.append(" ");
            gb.append("FROM");
            gb.append(" ");
            gb.append(nomeTabela);
            gb.append("GROUP");
            gb.append(" ");
            gb.append("BY");
            gb.append(" ");
            gb.append(atributo);
            gb.append(";");
        }
        if ((nomeTabela != null) && (coluna == null) && (atributo != null)) {
            gb.append(atributo);
            gb.append(",");
            gb.append(" ");
            gb.append("COUNT");
            gb.append("(*)");
            gb.append(" ");
            gb.append("FROM");
            gb.append(" ");
            gb.append(nomeTabela);
            gb.append(" ");
            gb.append("GROUP");
            gb.append(" ");
            gb.append("BY");
            gb.append(" ");
            gb.append(atributo);
            gb.append(";");
        }
        
        return gb.toString();
    }
    //UTILIZANDO FLUENT INTERFACE
    
    /**
     * Método para retornar e agrupar por número máximo
     * @param nomeTabela = Nome da tabela que está o atributo
     * @param coluna = Nome da coluna;
     * @param atributo = Nome do atributo;
     * @return Objeto para a consulta;
     */
    public GroupBy comMax(String nomeTabela, String coluna, String atributo) {
        this.nomeTabela = nomeTabela;
        this.coluna = coluna;
        this.atributo = atributo;
        return this;
    }
    /**
     * Agrupando por quantidade
     * @param nomeTabela = Nome da tabela que possui a coluna;
     * @param atributo = Nome do coluna a ser contado;
     * @return Objeto para realizar a consulta
     */
    public GroupBy Count (String nomeTabela, String atributo) {
        this.nomeTabela = nomeTabela;
        this.atributo = atributo;
        return this;
    }

     // GERADOR DE ARQUIVO DE TEXTO COM SCRIPT
    /**
     * 
     * @param filepath = Caminho onde o arquivo deve ser gerado;
     * @throws FileNotFoundException = Caso o caminho encontrado não seja válido;
     */
    public void geraSQL(String filepath) throws FileNotFoundException{
        
        try (PrintStream out = new PrintStream(new FileOutputStream(filepath))) {
            out.print(gerador());
        }
    }
    // GETTERS E SETTERS
    public String getNomeTabela() {
        return nomeTabela;
    }

    public void setNomeTabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }

    public String getColuna() {
        return coluna;
    }

    public void setColuna(String coluna) {
        this.coluna = coluna;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}
