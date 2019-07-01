/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.eduarda.clone.DTO.CriaDataBase;
import com.eduarda.clone.DTO.CriaLinha;
import com.eduarda.clone.DTO.CriaTabela;

import java.io.FileNotFoundException;
import junit.framework.TestCase;

/**
 *
 * @author eduardadelima
 */
public class JUnitTestandoDataBase extends TestCase {
    
    public JUnitTestandoDataBase() {
    }
    
    CriaDataBase data = new CriaDataBase();
    CriaTabela table = new CriaTabela();
    CriaLinha linha = new CriaLinha();

    public void testDataBase() throws FileNotFoundException{
        linha.comNome("idFuncionario").sendoDoTipo("INT").sendoNotNull(true).comAutoIncrement(true).sendoPrimaryKey(true);
        table.adicionarLinha(linha);
        linha = new CriaLinha();
        linha.comNome("nomeFuncionario").sendoDoTipo("VARCHAR(45)").sendoNotNull(true);
        table.adicionarLinha(linha);
        table.comNome("Funcionario");
        data.adicionarTabela(table);
        table = new CriaTabela();
        linha = new CriaLinha();
        linha.comNome("idCargo").sendoDoTipo("INT").sendoNotNull(true).comAutoIncrement(true).sendoPrimaryKey(true);
        table.adicionarLinha(linha);
        linha = new CriaLinha();
        linha.comNome("NomeCargo").sendoDoTipo("VARCHAR(45)").sendoNotNull(true);
        table.adicionarLinha(linha);
        table.comNome("Cargo");
        data.adicionarTabela(table);
        data.comNome("Loja").comCaracterSet("UTF8");
        System.out.println(data.gerador());
        data.geraSQL("src/Arquivos/scriptTeste.sql");
        assertEquals(data.gerador(),data.gerador());  
    }
}
