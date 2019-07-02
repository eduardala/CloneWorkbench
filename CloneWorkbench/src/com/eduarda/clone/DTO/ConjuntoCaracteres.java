package com.eduarda.clone.DTO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author eduardadelima
 */

public class ConjuntoCaracteres {
    
    List<String> caracter = new ArrayList<String>();
    public static Set<String> SetandoCaracter(){
        
        Set<String> caracterSet = new HashSet<>();
        
        // SETANDO CARACTER
        caracterSet.add("BIG5");
        caracterSet.add("DEC8");
        caracterSet.add("CP850");
        caracterSet.add("HP8");
        caracterSet.add("KOI8R");
        caracterSet.add("LATIN1");
        caracterSet.add("LATIN2");
        caracterSet.add("SWE7");
        caracterSet.add("ASCII");
        caracterSet.add("UJIS");
        caracterSet.add("SJIS");
        caracterSet.add("HEBREW");
        caracterSet.add("TIS620");
        caracterSet.add("EUCKR");
        caracterSet.add("KOI8U");
        caracterSet.add("GB2312");
        caracterSet.add("GREEK");
        caracterSet.add("CP1250");
        caracterSet.add("GBK");
        caracterSet.add("LATIN5");
        caracterSet.add("ARMSCII8");
        caracterSet.add("UTF8");
        caracterSet.add("UCS2");
        caracterSet.add("CP866");
        caracterSet.add("KEYBCS2");
        caracterSet.add("MACCE");
        caracterSet.add("MACROMAN");
        caracterSet.add("CP852");
        caracterSet.add("LATIN7");
        caracterSet.add("UTF8MB4");
        caracterSet.add("CP1251");
        caracterSet.add("UTF16");
        caracterSet.add("CP1256");
        caracterSet.add("CP1257");
        caracterSet.add("UTF32");
        caracterSet.add("BINARY");
        caracterSet.add("GEOSTD8");
        caracterSet.add("CP932");
        caracterSet.add("EUCJPMS");
        
        return caracterSet;
    }
    
    //POPULANDO PARA UMA POSSÍVEL UTILIZAÇÃO EM UM FRAME
    public List<String> ListaCaracteres () {
        caracter.add("BIG5");
        caracter.add("DEC8");
        caracter.add("CP850");
        caracter.add("HP8");
        caracter.add("KOI8R");
        caracter.add("LATIN1");
        caracter.add("LATIN2");
        caracter.add("SWE7");
        caracter.add("ASCII");
        caracter.add("UJIS");
        caracter.add("SJIS");
        caracter.add("HEBREW");
        caracter.add("TIS620");
        caracter.add("EUCKR");
        caracter.add("KOI8U");
        caracter.add("GB2312");
        caracter.add("GREEK");
        caracter.add("CP1250");
        caracter.add("GBK");
        caracter.add("LATIN5");
        caracter.add("ARMSCII8");
        caracter.add("UTF8");
        caracter.add("UCS2");
        caracter.add("CP866");
        caracter.add("KEYBCS2");
        caracter.add("MACCE");
        caracter.add("MACROMAN");
        caracter.add("CP852");
        caracter.add("LATIN7");
        caracter.add("UTF8MB4");
        caracter.add("CP1251");
        caracter.add("UTF16");
        caracter.add("CP1256");
        caracter.add("CP1257");
        caracter.add("UTF32");
        caracter.add("BINARY");
        caracter.add("GEOSTD8");
        caracter.add("CP932");
        caracter.add("EUCJPMS");
        
        return caracter;
        
    }
}
