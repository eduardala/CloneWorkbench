package com.eduarda.clone.DTO;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author eduardadelima
 */

public class TipoAtributo {    
    String tipos = "iniciando";
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
    
}
