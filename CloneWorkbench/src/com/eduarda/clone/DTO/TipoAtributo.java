package com.eduarda.clone.DTO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author eduardadelima
 */

public class TipoAtributo {    
    String tipos = "iniciando";
    List<String> tipo = new ArrayList<String>();
    public static Set<String> getTipos(){
        
        Set<String> tipos = new HashSet<>();
        
        // NUMÉRICOS
        tipos.add("TINYINT");
        tipos.add("SMALLINT");
        tipos.add("MEDIUMINT");
        tipos.add("INT");
        tipos.add("BIGINT");
        tipos.add("DECIMAL");
        tipos.add("FLOAT");
        tipos.add("DOUBLE");
        tipos.add("BIT");
        
        // STRING
        tipos.add("CHAR");
        tipos.add("VARCHAR(100)");
        tipos.add("BINARY");
        tipos.add("VARBINARY");
        tipos.add("BLOB");
        tipos.add("TINYBLOB");
        tipos.add("MEDIUMBLOB");
        tipos.add("LONGBLOB");
        tipos.add("TINYTEXT");
        tipos.add("TEXT");
        tipos.add("MEDIUMTEXT");
        tipos.add("LONGTEXT");
        tipos.add("ENUM");
        tipos.add("SET");
        
        // ESPACIAIS
        tipos.add("GEOMETRY");
        tipos.add("POINT");
        tipos.add("LINESTRING");
        tipos.add("POLYGON");
        tipos.add("GEOMETRYCOLLECTION");
        tipos.add("MULTILINESTRING");
        tipos.add("MULTIPOINT");
        tipos.add("MULTIPOLYGON");
        
        // DATAS
        tipos.add("DATE");
        tipos.add("TIME");
        tipos.add("TIMESTAMP");
        tipos.add("YEAR");
        tipos.add("DATETIME");
        
        return tipos;
    }
    
    //POPULANDO PARA UMA POSSÍVEL UTILIZAÇÃO EM UM FRAME    
    public List<String> ListaTipos () {
        // NUMÉRICOS
        tipo.add("TINYINT");
        tipo.add("SMALLINT");
        tipo.add("MEDIUMINT");
        tipo.add("INT");
        tipo.add("BIGINT");
        tipo.add("DECIMAL");
        tipo.add("FLOAT");
        tipo.add("DOUBLE");
        tipo.add("BIT");
        
        // STRING
        tipo.add("CHAR");
        tipo.add("VARCHAR(100)");
        tipo.add("BINARY");
        tipo.add("VARBINARY");
        tipo.add("BLOB");
        tipo.add("TINYBLOB");
        tipo.add("MEDIUMBLOB");
        tipo.add("LONGBLOB");
        tipo.add("TINYTEXT");
        tipo.add("TEXT");
        tipo.add("MEDIUMTEXT");
        tipo.add("LONGTEXT");
        tipo.add("ENUM");
        tipo.add("SET");
        
        // ESPACIAIS
        tipo.add("GEOMETRY");
        tipo.add("POINT");
        tipo.add("LINESTRING");
        tipo.add("POLYGON");
        tipo.add("GEOMETRYCOLLECTION");
        tipo.add("MULTILINESTRING");
        tipo.add("MULTIPOINT");
        tipo.add("MULTIPOLYGON");
        
        // DATAS
        tipo.add("DATE");
        tipo.add("TIME");
        tipo.add("TIMESTAMP");
        tipo.add("YEAR");
        tipo.add("DATETIME");
        
        return tipo;
    }
}
