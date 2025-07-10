public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor 
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para cumprimentar o convidado
    public void cumprimentar() {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao evento.");
    }

    // Getters e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método principal para testar 
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pollyana", 39);
        pessoa.cumprimentar();
    }
}


