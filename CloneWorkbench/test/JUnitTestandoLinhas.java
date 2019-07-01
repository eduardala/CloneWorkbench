/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.eduarda.clone.DTO.CriaLinha;
import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 *
 * @author eduardadelima
 */
public class JUnitTestandoLinhas extends TestCase  {

    public JUnitTestandoLinhas() {
    }

    CriaLinha linha = new CriaLinha();

    public void testandoLinha1() {
        linha.comNome("idFuncionario").sendoDoTipo("INT").sendoNotNull(true).comAutoIncrement(true).sendoPrimaryKey(true);
        System.out.println(linha.gerador());
        assertEquals("  idFuncionario INT NOT NULL AUTO_INCREMENT PRIMARY KEY", linha.gerador());
    }
    
        public void testandoLinha2() {
        linha.comNome("endereco").sendoDoTipo("VARCHAR(100)").sendoNotNull(true).comAutoIncrement(false)
                .sendoPrimaryKey(false);
        System.out.println(linha.gerador());
        assertEquals("  endereco VARCHAR(100) NOT NULL ", linha.gerador());
    }

    public void testandoLinha3() {
        linha.comNome("dtNasc").sendoDoTipo("DATE").sendoNotNull(true).comAutoIncrement(false)
                .sendoPrimaryKey(false);
        System.out.println(linha.gerador());
        assertEquals("  dtNasc DATE NOT NULL ", linha.gerador());
    }

    public void testandoLinha4() {
        linha.comNome("alvo").sendoDoTipo("TINYINT").sendoNotNull(false).comAutoIncrement(false)
                .sendoPrimaryKey(false);
        System.out.println(linha.gerador());
        assertEquals("  alvo TINYINT ", linha.gerador());
    }

    public void testandoLinha5() {
        linha.comNome("idade").sendoDoTipo("BLABLABLA").sendoNotNull(false).comAutoIncrement(false)
                .sendoPrimaryKey(false);
        System.out.println(linha.gerador());
        assertEquals("***O tipo informado não existe!***", linha.gerador());
}
}
