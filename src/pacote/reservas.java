package pacote;

import java.time.LocalDate;

public class reservas {
    private String nomeDoCliente;
    private int numeroDePessoas;
    private LocalDate dataDaReseva;
    private double valorDaReserva;

    public reservas(String nomeDoCliente, int numeroDePessoas, LocalDate dataDaReserva, double valorDaReserva){
        this.nomeDoCliente = nomeDoCliente;
        this.numeroDePessoas = numeroDePessoas;
        this.dataDaReseva = dataDaReserva;
        this.valorDaReserva = valorDaReserva;
    }

        public reservas(String nomeDoCliente2, int numeroDePessoas2, String dataDaReserva, int valorDaReserva2) {
        //TODO Auto-generated constructor stub
    }

        public String getNomeDoCliente(){
            return nomeDoCliente;
        }
        public void setNomeDoCliente(String nomeDoCliente){
            this.nomeDoCliente = nomeDoCliente;
        }
        public int getNumeroDePessoas(){
            return numeroDePessoas;
        }
        public void setNumeroDePessoas(int numeroDePessoas){
            this.numeroDePessoas = numeroDePessoas;
        }
        public LocalDate getDataDaReserva(){
            return dataDaReseva;
        }
        public void setDataDaReserva(LocalDate getDataDaReserva){
            this.dataDaReseva = dataDaReseva;
        }
        public double getValorDaReserva(){
            return valorDaReserva;
        }
        public void setValorDaReserva(double valorDaReserva){
            this.valorDaReserva = valorDaReserva;
        }
        public double calcularValorDaReserva() {
            return valorDaReserva * numeroDePessoas;
        }        
        public void dadosDaReserva(String nomeDoCliente, int numeroDePessoas, String dataDaReserva, double valorDaReserva){
        System.out.println("nome: "+ nomeDoCliente+ "\npessoas: "+ numeroDePessoas + "\ndata: "+ dataDaReserva+ "\nvalor: "+ valorDaReserva);
        }
}
