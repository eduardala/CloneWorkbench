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
public class Count implements IGerador {
    
    //ATRIBUTO
    private String nomeTabela;
    private String coluna;

    //GERANDO OPERAÇÕES COUNT
    
    /**
     * 
     * @return String Builder com o script para realizar as operações com count.
     */
    @Override
    public String gerador() {
        StringBuilder count = new StringBuilder();
        count.append("SELECT");
        count.append(" (");
        
        //COUNT SIMPLES
        if ((nomeTabela != null) && (coluna == null)) {
            count.append("*");
            count.append(")");
            count.append(" ");
            count.append("FROM");
            count.append(" ");
            count.append(nomeTabela);
            count.append(";");
        }
        //COUNT COM COLUNA
        if ((nomeTabela != null) && (coluna != null)) {
            count.append(coluna);
            count.append(")");
            count.append(" ");
            count.append("FROM");
            count.append(" ");
            count.append(nomeTabela);
            count.append(";");
        }
        
        return count.toString();    
    }
    
    //UTILIZANDO FLUENT INTERFACE
    
    /**
     * Método para retornar consulta contando as informações do atributo.
     * @param nomeTabela - Nome da tabela que será realizada a contagem.
     * @return Script com a operação.
     */
    public Count countSimples(String nomeTabela) {
        this.nomeTabela = nomeTabela;
        return this;
    }
    
    /**
     * Método para realizar a contagem com base em colunas.
     * @param nomeTabela - Nome da tabela a ser realizada a contagem;
     * @param coluna - Nome da coluna a ser contada.
     * @return Script com a operação.
     */
    public Count countColuna (String nomeTabela, String coluna) {
        this.nomeTabela = nomeTabela;
        this.coluna = coluna;
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

    //GETTER E SETTER
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
    
    
}
