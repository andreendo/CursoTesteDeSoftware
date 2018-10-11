package exercicio04;

/**
 *
 * @author andreendo
 */
public class Pessoa {
    int codigo, idade;
    String nome;
    
    public Pessoa(int pCodigo, int pIdade, String pNome) {
        codigo = pCodigo;
        idade = pIdade;
        nome = pNome;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}