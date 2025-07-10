// Classe Circulo representa um círculo com raio, área e perímetro
public class Circulo {
    // Const com valor aproximado de PI
    private static final double PI = 3.14;

    // Atributo do raio
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo - Fórmula da área: π * r²
    public double calcularArea() {
        return PI * raio * raio;
    }

    // Método para calcular o perímetro do círculo - Fórmula do perímetro: 2 * π * r
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    // Getter
    public double getRaio() {
        return raio;
    }

    // Setter
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método principal de teste
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);

        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}

