public class Animal {
    // Atributos principais do animal
    private String nome;
    private String tipoAlimentacao;

    // Construtor 
    public Animal(String nome, String tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    // Método que simula o som emitido pelo animal
    public void emitirSom() {
        System.out.println(nome + " está emitindo seu som característico!");
    }

    // Método principal para testar 
    public static void main(String[] args) {
        Animal leao = new Animal("Leão", "Carnívoro");

        System.out.println("Animal: " + leao.nome);
        System.out.println("Alimentação: " + leao.tipoAlimentacao);
        leao.emitirSom();
    }
}

