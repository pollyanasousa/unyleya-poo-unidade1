public class Carro {
    // Atributos 
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    // Construtor 
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // carro começa desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar() {
        if (ligado) {
            System.out.println("Acelerando o carro...");
        } else {
            System.out.println("Não é possível acelerar com o carro desligado.");
        }
    }

    // Método para mostrar as informações do carro 
    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Método principal para testar 
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022);
        carro.mostrarInformacoes();
        carro.ligar();
        carro.acelerar();
        carro.desligar();
    }
}
