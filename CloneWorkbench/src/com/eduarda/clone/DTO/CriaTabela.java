package com.eduarda.clone.DTO;

import com.eduarda.clone.Interface.IGerador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardadelima
 */

public class CriaTabela implements IGerador{
    
    
    // ATRIBUTOS
    private String nomeTabela;
    private List<CriaLinha> linhas = new ArrayList<>();
    
    
    // CONSTRUTOR
    public CriaTabela(){
        
    }
    // GERADOR DE TABELAS
    /**
     * 
     * @return String Builder com o script para criar uma nova tabela;
     */
    @Override
    public String gerador(){      
        StringBuilder tabela = new StringBuilder();
        
        tabela.append("CREATE TABLE IF NOT EXISTS");
        tabela.append(" ");
        tabela.append(nomeTabela);
        tabela.append(" ");
        tabela.append("(");
        
        for (int i = 0; i < linhas.size(); i++) {
            tabela.append("\n");
            if(i==linhas.size()-1){
                tabela.append(linhas.get(i).gerador());
                tabela.append("\n");
            }else{
                tabela.append(linhas.get(i).gerador());
                tabela.append(",");
            }
        }
        
        tabela.append(")");
        tabela.append(";");
        
        return tabela.toString();
    }
    
    // ADICIONAR LINHAS
    /**
     * 
     * @param linha = Objeto linha a ser adiconada na tabela;
     * @return Flag para verificar se foi adicionado ou não;
     */
    public boolean adicionarLinha(CriaLinha linha){
        if(linha!=null){
            linhas.add(linha);
            return true;
        }
        return false;
    }
    
    // FLUENT INTERFACE
    /**
     * 
     * @param nome = Nome da nova tabela;
     * @return Objeto tabela com o nome atualizado;
     */
    public CriaTabela comNome(String nome){
        this.nomeTabela = nome;
        return this;
    }

    
    // GETTERS E SETTERS
    public String getNomeTabela() {
        return nomeTabela;
    }

    public void setNomeTabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }

    public List<CriaLinha> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<CriaLinha> linhas) {
        this.linhas = linhas;
    }
}
