public class Produto {
    // Atributos 
    private String nome;
    private double preco;

    // Construtor 
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para calcular o preço com desconto 
    public double calcularPrecoComDesconto(double percentualDesconto) {
        double desconto = preco * percentualDesconto / 100;
        return preco - desconto;
    }

    // Método principal para testar 
    public static void main(String[] args) {
        Produto preco = new Produto("Smartphone", 1500.00);
        System.out.println("Produto: " + preco.nome);
        System.out.println("Preço original: R$ " + preco.preco);
        System.out.println("Preço com 10% de desconto: R$ " + preco.calcularPrecoComDesconto(10));
    }
}
