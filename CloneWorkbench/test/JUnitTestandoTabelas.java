/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.eduarda.clone.DTO.CriaLinha;
import com.eduarda.clone.DTO.CriaTabela;
import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 *
 * @author eduardadelima
 */
public class JUnitTestandoTabelas extends TestCase{
    
    public JUnitTestandoTabelas() {
    }
    
   CriaTabela table = new CriaTabela();
    CriaLinha linha = new CriaLinha();
    
    public void testTabela1(){
        linha.comNome("idFuncionario").sendoDoTipo("INT").sendoNotNull(true).comAutoIncrement(true).sendoPrimaryKey(true);
        table.adicionarLinha(linha);
        linha = new CriaLinha();
        linha.comNome("Nome").sendoDoTipo("VARCHAR(45)").sendoNotNull(true);
        table.adicionarLinha(linha);
        table.comNome("Funcionario");
        System.out.println(table.gerador());
        assertEquals(table.gerador(),table.gerador());
    }
}
