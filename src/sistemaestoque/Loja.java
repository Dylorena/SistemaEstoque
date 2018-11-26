package sistemaestoque;

import java.util.ArrayList;

/**
 * @author Diana
 * @author Carla
 */
public class Loja {
    private String CNPJ;
    private String nome;
    private Endereco endereco;
    ArrayList <Produto> lista = new ArrayList<>();

    public Loja(String CNPJ, String nome, Endereco endereco) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void insereProduto(Produto p){
        lista.add(p);
    }
    
    public void removeProduto(Produto p){
        lista.remove(p);
    }
    
    
    
   
}
