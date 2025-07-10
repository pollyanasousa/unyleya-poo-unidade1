public class Retangulo {
    // Atributos privados
    private double comprimento;
    private double largura;

    // Construtor 
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Método para calcular a área do retângulo
    public double calcularArea() {
        return comprimento * largura;
    }

    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    // Getters e Setters 
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    // Método principal para testar 
    public static void main(String[] args) {
        Retangulo terreno = new Retangulo(10.0, 5.0);

        System.out.println("Comprimento: " + terreno.getComprimento());
        System.out.println("Largura: " + terreno.getLargura());
        System.out.println("Área: " + terreno.calcularArea());
        System.out.println("Perímetro: " + terreno.calcularPerimetro());
    }
}
