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
public class Select implements IGerador {
    
    //ATRIBUTOS
    private String nomeTabela;
    private String coluna;
    private String coluna2;
    private String atributo;

    //CONSTRUTOR
    public Select () {
        
    }
    
    //GERANDO CONSULTAS SELECT
    /**
     * 
     * @return String Builder com o script para realizar as consultas com base nos parâmetros.
     */
    @Override
    public String gerador() {
        StringBuilder select = new StringBuilder();
        select.append("SELECT");
        select.append(" ");
        
        //SELECT SIMPLES
        if ((nomeTabela != null) && (coluna == null) && (coluna2 == null) && (atributo == null)) {
                select.append("*");
                select.append(" ");
                select.append("FROM");
                select.append(" ");
                select.append(nomeTabela);
                select.append(";");
        }
        
        // SELECT COLUNA
        if ((nomeTabela != null) && (coluna != null) && (coluna2 == null) && (atributo == null)) {
            select.append(coluna);
            select.append(" ");
            select.append("FROM");
            select.append(" ");
            select.append(nomeTabela);
            select.append(";");
        }
        
        //SELECT ORDENANDO 1 COLUNA
        if ((nomeTabela != null) && (coluna != null) && (coluna2 == null) && (atributo != null)) {
            select.append(coluna);
            select.append(" ");
            select.append("FROM");
            select.append(" ");
            select.append(nomeTabela);
            select.append(" ");
            select.append("ORDER");
            select.append(" ");
            select.append("BY");
            select.append(" ");
            select.append(atributo);
            select.append(";");
        }
        
        //SELECT ORDENANDO 2 COLUNAS
        if ((nomeTabela != null) && (coluna != null) && (coluna2 != null) && (atributo != null)) {

            select.append(coluna);
            select.append(",");
            select.append(" ");
            select.append(coluna2);
            select.append(" ");
            select.append("FROM");
            select.append(" ");
            select.append(nomeTabela);
            select.append(" ");
            select.append("ORDER");
            select.append(" ");
            select.append("BY");
            select.append(" ");
            select.append(atributo);
            select.append(";");
            
    }
        return select.toString();
    }
    
    //UTILIZANDO FLUENT INTERFACE
    
    /**
     * Método para retornar a consulta com o Select Simples.
     * @param nomeTabela - Nome da tabela que deseja realizar a consulta.
     * @return Script com a consulta select.
     */
    public Select selectSimples (String nomeTabela) {
        this.nomeTabela = nomeTabela;
        return this;
    }
    
    /**
     * Método para retornar a consulta com Select utilizando tabela.
     * @param nomeTabela - Nome da tabela a ser consultada;
     * @param coluna - Nome da coluna a ser consultada;
     * @return Script com a consulta referente a tabela.
     */
    public Select comColuna (String nomeTabela, String coluna) {
        this.nomeTabela = nomeTabela;
        this.coluna = coluna;
        return this;
    }
    
    /**
     * Método para retornar a consulta com Select utilizando atributo desejado.
     * @param nomeTabela - Nome da tabela a ser consultada;
     * @param coluna - Nome da coluna a ser consultada;
     * @param atributo - Nome do atributo;
     * @return Script com a consulta referente ao atributo.
     */
    public Select ordenando1Coluna (String nomeTabela, String coluna, String atributo) {
        this.nomeTabela = nomeTabela;
        this.coluna = coluna;
        this.atributo = atributo;
        return this;
    }
    
    /**
     * Método para realizar a ordenação em duas colunas.
     * @param nomeTabela - Nome da tabela a ser consultada;
     * @param coluna - Nome da coluna 1 a ser agrupada;
     * @param coluna2 - Nome da coluna 2 a ser agrupada;
     * @param atributo - Nome do atributo agrupador;
     * @return 
     */
    public Select ordenando2Colunas (String nomeTabela, String coluna, String coluna2, String atributo) {
        this.nomeTabela = nomeTabela;
        this.coluna = coluna;
        this.coluna2 = coluna2;
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

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
    
    
}
