/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.eduarda.clone.Uteis.GroupBy;
import java.io.FileNotFoundException;
import junit.framework.TestCase;

/**
 *
 * @author eduardadelima
 */
public class JUnitTestandoGroupBy extends TestCase {
    
    public JUnitTestandoGroupBy() {
    
    }
    
    GroupBy gb = new GroupBy();
    
    public void testGroupMax() throws FileNotFoundException {
        gb.comMax("Funcionarios", "5", "idCargo");
        System.out.println(gb.gerador());
        assertEquals("SELECT idCargo, MAX(5) FROM Funcionarios GROUP BY idCargo;", this);
        gb.geraSQL("src/Arquivos/scriptGroupBy.sql");
    }
    
    public void testGroupCount() {
        gb.Count("Funcionarios", "idCargo");
        System.out.println(gb.gerador());
        assertEquals("SELECT idCargo, COUNT(*) FROM Funcionarios GROUP BY idCargo;", this);
    }
       /*public void testConsultaseOperacoes() {
        
        
        gp.GroupByMax("idCargo", "5", "Funcionario");
        gp.GroupByCountSimples("idCargo", "Funcionario");
    }*/
}
