public class ContaBancaria {
    // Atributos 
    private String numeroConta;
    private double saldo;

    // Construtor 
    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Método para exibir informações da conta
    public void mostrarInformacoes() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Método principal para testar 
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("001122-3", 1000.0);
        conta.depositar(250.0);
        conta.sacar(400.0);
        conta.mostrarInformacoes();
    }
}
