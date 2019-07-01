/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.eduarda.clone.Uteis.Select;
import java.io.FileNotFoundException;
import junit.framework.TestCase;

/**
 *
 * @author eduardadelima
 */
public class JUnitTestandoConsultas extends TestCase {
    
    public JUnitTestandoConsultas() {
    
    }
    
    Select select = new Select();
    
    public void testSelectOrdenandoColuna () throws FileNotFoundException {
        select.ordenando1Coluna("Funcionario", "idCargo", "idCargo");
        System.out.println(select.gerador());
        assertEquals("SELECT idCargo FROM Funcionario ORDER BY idCargo;", select.gerador());
        select.geraSQL("src/Arquivos/scritpSelect.sql");
    }
    
    public void testSelectOrdenandoColunas() {
        select.ordenando2Colunas("Funcionario", "idCargo", "NomeCargo", "NomeCargo");
        System.out.println(select.gerador());
        assertEquals("SELECT idCargo, NomeCargo FROM Funcionario ORDER BY NomeCargo;", select.gerador());
    }
    public void testSelectColuna() {
        select.comColuna("Funcionario", "idCargo");
        System.out.println(select.gerador());
        assertEquals("SELECT idCargo FROM Funcionario;", select.gerador());
    }
    
    public void testSelect() {
        select.selectSimples("Funcionario");
        System.out.println(select.gerador());
        assertEquals("SELECT * FROM Funcionario;", select.gerador());
    }
}
