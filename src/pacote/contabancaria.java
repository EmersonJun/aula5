package pacote;

// public class contabancaria {
//     public int numeroDaConta;
//     private String nomeDoTitular;
//     private double saldo = 0;

//     public int getnumeroDaConta(){
//         return numeroDaConta;
//     }
//     public String getnomeDoTitular(){
//         return nomeDoTitular;
//     }
//     public double getsaldo(){
//         return saldo;
//     }
//     public void setNumeroDaConta(int numeroDaConta){
//         this.numeroDaConta = numeroDaConta;
//     }
//     public void setNomeDoTitular(String nomeDoTitular){
//         this.nomeDoTitular = nomeDoTitular;
//     }
//     public void setSaldo(double saldo){
//         this.saldo = saldo;
//     }
//     public double depositar(double valor){
//         return saldo = depositar(valor);
//     }
//}
public class contabancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public contabancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
    
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

