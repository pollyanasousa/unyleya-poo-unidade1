public class Funcionario {
    // Atributos 
    private String nome;
    private String cargo;
    private double salario;

    // Construtor 
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método para calcular o novo salário 
    public double calcularAumento(double percentual) {
        return salario + (salario * percentual / 100);
    }

    // Método para exibir os dados do funcionário
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário atual: R$ " + salario);
    }

    // Método principal para testar a classe Funcionario
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pollyana", "Analista", 3500.00);
        funcionario.mostrarDados();
        double novoSalario = funcionario.calcularAumento(10);
        System.out.println("Salário com aumento de 10%: R$ " + novoSalario);
    }
}
