package com.eduarda.clone.DTO;

import com.eduarda.clone.Interface.IGerador;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author eduardadelima
 */

public class CriaLinha implements IGerador{
    
    private Set<String> tipos = new HashSet<>(); // PARA REALIZAR AS VALIDAÇÕES
    
    // ATRIBUTOS
    private String nomeAtributo;
    private String tipo;
    private boolean not_null;
    private boolean auto_increment;
    private boolean primary_key;
    
    // CONSTRUTOR PARA CARREGAR A LISTA DE TIPOS
    public CriaLinha(){
        tipos = TipoAtributo.getTipos();
    }
    
    // GERADOR DE LINHAS
    
    /**
     * 
     * @return String Builder com o script para gerar uma linha;
     */
    @Override
    public String gerador(){
        
        if(!tipos.contains(tipo)){
            return "***O tipo informado não existe!***";
        }
        
        StringBuilder linha = new StringBuilder();
        linha.append("  ");
        linha.append(nomeAtributo);
        linha.append(" ");
        linha.append(tipo);
        linha.append(" ");
        
        if(not_null){
            linha.append("NOT NULL");
            linha.append(" ");
        }
        
        if(auto_increment){
            linha.append("AUTO_INCREMENT");
            linha.append(" ");
        }
        
        if(primary_key){
            linha.append("PRIMARY KEY");
        }
        
        return linha.toString();
    }
    
    // UTILIZANDO FLUENT INTERFACE
    
    /**
     * 
     * @param nome = Nome que será dado ao novo atributo;
     * @return Objeto Linha com o nome atualizado;
     */
    public CriaLinha comNome(String nome){
        this.nomeAtributo = nome;
        return this;
    }
    
    /**
     * 
     * @param tipo = Tipo do atributo no MySQL;
     * @return Objeto Linha com o tipo atualizado;
     */
    public CriaLinha sendoDoTipo(String tipo){
        
        if(tipo.length()>7){
            if(tipo.substring(0,8).equals("VARCHAR(")){
                if(tipo.endsWith(")")){
                    tipos.add(tipo);
                }
            }
        }
        
        if(tipos.contains(tipo)){
            this.tipo = tipo;
            return this;
        }
        return this;
    }
    
    /**
     * 
     * @param not_null = Flag para verificar se o atributo será nulo ou não;
     * @return Objeto Linha com o flag atualizado;
     */
    public CriaLinha sendoNotNull(boolean not_null){
        this.not_null = not_null;
        return this;
    }
    
    /**
     * 
     * @param auto_increment = Flag para verificar se o atributo será auto_increment ou não;
     * @return Objeto Linha com o flag atualizado;
     */
    public CriaLinha comAutoIncrement(boolean auto_increment){
        this.auto_increment = auto_increment;
        return this;
    }
    
    /**
     * 
     * @param primary_key = Flag para saber se o atributo será primary key ou não;
     * @return Objeto Linha com o flag atualizado;
     */
    public CriaLinha sendoPrimaryKey(boolean primary_key){
        this.primary_key = primary_key;
        return this;
    }
    
    
    // GETTERS E SETTERS
    public Set<String> getTipos() {
        return tipos;
    }

    public void setTipos(Set<String> tipos) {
        this.tipos = tipos;
    }

    public String getNomeAtributo() {
        return nomeAtributo;
    }

    public void setNomeAtributo(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        
        if(tipo.length()>7){
            if(tipo.substring(0,8).equals("VARCHAR(")){
                if(tipo.endsWith(")")){
                    tipos.add(tipo);
                }
            }
        }
                
        if(tipos.contains(tipo)){
            this.tipo = tipo;
        }
    }

    public boolean isNot_null() {
        return not_null;
    }

    public void setNot_null(boolean not_null) {
        this.not_null = not_null;
    }

    public boolean isAuto_increment() {
        return auto_increment;
    }

    public void setAuto_increment(boolean auto_increment) {
        this.auto_increment = auto_increment;
    }

    public boolean isPrimary_key() {
        return primary_key;
    }

    public void setPrimary_key(boolean primary_key) {
        this.primary_key = primary_key;
    }
}
