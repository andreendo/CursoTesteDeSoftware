package exercicio04;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;

/**
 *
 * @author andreendo
 */
public class PessoaDAOTest {
    RHService rhServiceMock; 
    PessoaDAO dao; 
    
    @Before
    public void before() {
        rhServiceMock = mock(RHService.class);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, 33, "Chuck Norris"));
        pessoas.add(new Pessoa(2, 44, "Bruce Lee"));
        pessoas.add(new Pessoa(3, 55, "Luke Skywalker"));
        when(rhServiceMock.getAllPessoas())
                .thenReturn(pessoas);
        dao = new PessoaDAO(rhServiceMock);  
    }
    
    @Test
    public void testePessoaExiste() {
        assertTrue( dao.existePessoa("Bruce Lee") );
    }
    
    @Test
    public void testePessoaNaoExiste() {
        assertFalse( dao.existePessoa("Andre Endo") );
    }    
}
