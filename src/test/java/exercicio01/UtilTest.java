/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André
 */
public class UtilTest {
    
    @Test
    public void testaInicioMaiorQueFinal() {
        Util u = new Util();
        int res = u.gerarNumeroAleatorio(5, 2);
        assertEquals(-1, res);
    }
    
    @Test
    public void testaInicioMenorQueZero() {
        Util u = new Util();
        int res = u.gerarNumeroAleatorio(-20, 2);
        assertEquals(-1, res);
    }
    
    @Test
    public void testaNumeroAleatorioEntre1e10() {
        Util u = new Util();
        int res = u.gerarNumeroAleatorio(1, 10);
        assertTrue(res >= 1 && res <= 10);
    }    
}
