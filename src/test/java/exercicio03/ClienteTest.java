/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author André
 */
public class ClienteTest {
    
    @Test(expected = SemFundosException.class)
    public void testeSemFundos() throws Exception {
        GerenteDeContas gerenteMock = mock(GerenteDeContas.class);
        when(gerenteMock.acharConta(any()))
                .thenReturn( new Conta() );
        
        when(gerenteMock.recuperarSaldo(any()))
                .thenReturn( 500l );
        
        Cliente c = new Cliente();
        c.setGerenteDeContas(gerenteMock);
        c.efetuarSaque(1000);
    }
    
    @Test
    public void testeComFundos() throws Exception {
        GerenteDeContas gerenteMock = mock(GerenteDeContas.class);
        when(gerenteMock.acharConta(any()))
                .thenReturn( new Conta() );
        
        when(gerenteMock.recuperarSaldo(any()))
                .thenReturn( 2000l, 1000l );
        
        Cliente c = new Cliente();
        c.setGerenteDeContas(gerenteMock);
        long res = c.efetuarSaque(1000);
        assertEquals(1000, res);
    }    
}
