package com.eduarda.clone.DTO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.eduarda.clone.Interface.IGerador;

/**
 *
 * @author eduardadelima
 */
public class CriaDataBase implements IGerador {
    private Set<String> caracter = new HashSet<>(); // PARA REALIZAR AS VALIDAÇÕES
    
    // ATRIBUTOS
    private String nomeDoBanco;
    private String caracterSet;
    private List<CriaTabela> tabelas = new ArrayList<>();
    
    // CONSTRUTOR PARA CARREGAR A LISTA
    public CriaDataBase(){
        caracter = ConjuntoCaracteres.SetandoCaracter();
    }
    
    // GERADOR DE DATABASE
    /**
     * 
     * @return String Builder com o script para criação do database;
     */
    
    public String gerador(){
        
        if(!caracter.contains(caracterSet)){
            return "/*O caracter setado não existe!*/";
        }
        
        StringBuilder database = new StringBuilder();
        
        database.append("CREATE DATABASE IF NOT EXISTS");
        database.append(" ");
        database.append(nomeDoBanco);
        database.append(" ");
        database.append("DEFAULT CHARACTER SET");
        database.append(" ");
        database.append(caracterSet);
        database.append(";");
        database.append("\n");
        database.append("USE");
        database.append(" ");
        database.append(nomeDoBanco);
        database.append(";");
        database.append("\n");
        
        for (int i = 0; i < tabelas.size(); i++) {
            database.append("\n");
            database.append(tabelas.get(i).gerador());
            database.append("\n");
        }
        
        return database.toString();
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
    
    // ADICIONAR TABELAS
    /**
     * 
     * @param tabela = Tabela para ser adicionada ao database;
     * @return Flag para saber se foi adicionada ou não;
     */
    public boolean adicionarTabela(CriaTabela tabela){
        if(tabela!=null){
            tabelas.add(tabela);
            return true;
        }
        return false;
    }
    
    // UTILIZANDO FLUENT INTERFACE
    /**
     * 
     * @param nome = Nome que deseja dar ao banco;
     * @return Objeto Database com o nome atualizado;
     */
    public CriaDataBase comNome(String nome){
        this.nomeDoBanco = nome;
        return this;
    }
    
    /**
     * 
     * @param set = Setando o caracter que o novo database irá utilizar;
     * @return Objeto Database com o Caracter Set atualizado;
     */
    public CriaDataBase comCaracterSet(String set){
        if(caracter.contains(set)){
            this.caracterSet = set;
            return this;
        }
        return this;
    }

    public Set<String> SetandoCaracters() {
        return caracter;
    }

    public void setCaracterSets(Set<String> caracter) {
        this.caracter = caracter;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public String SetandoCaracter() {
        return caracterSet;
    }

    public void setCaracterSet(String caracterSet) {
        if(caracter.contains(caracterSet)){
            this.caracterSet = caracterSet;
        }
    }

    public List<CriaTabela> getTabelas() {
        return tabelas;
    }

    public void setTabelas(List<CriaTabela> tabelas) {
        this.tabelas = tabelas;
    }  
}