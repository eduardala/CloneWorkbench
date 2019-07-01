/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.eduarda.clone.Uteis.Count;
import java.io.FileNotFoundException;
import junit.framework.TestCase;

/**
 *
 * @author eduardadelima
 */
public class JUnitTestandoCount extends TestCase {
    
    public JUnitTestandoCount() {
    
    }
    
    Count c = new Count();
    
    public void testCountSimples () throws FileNotFoundException {
        c.countSimples("Funcionarios");
        System.out.println(c.gerador());
        assertEquals("SELECT (*) FROM Funcionarios;", c.gerador());
        c.geraSQL("src/Arquivos/scriptCount.sql");
    }
    
    public void testCountColuna () {
        c.countColuna("Funcionarios", "idCargo");
        System.out.println(c.gerador());
        assertEquals("SELECT (idCargo) FROM Funcionarios;", c.gerador());
    }
}
