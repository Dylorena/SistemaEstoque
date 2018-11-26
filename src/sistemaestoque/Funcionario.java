package sistemaestoque;

/**
 *
 * @author Diana
 * @author Carla
 */
public class Funcionario {
    private String cpf;
    private final int matricula;
    private static int contador = 0;
    private String nome;

    public Funcionario(String cpf, String nome) {
        contador++;
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = contador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public static int getContador() {
        return contador;
    }
    
    
}
