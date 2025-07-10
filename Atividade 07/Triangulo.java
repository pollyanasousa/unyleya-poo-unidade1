public class Triangulo {
    // Atributos 
    private double base;
    private double altura;

    // Construtor 
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área do triângulo
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método principal para testar a classe Triangulo
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(6, 4);
        System.out.println("Base: " + triangulo.base);
        System.out.println("Altura: " + triangulo.altura);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
    }
}
