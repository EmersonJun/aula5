import java.time.LocalDate;

import pacote.carro;
import pacote.contabancaria;
import pacote.reservas;

public class App {
    public static void main(String[] args){

        // carro carro = new carro();
        // carro.marca = "nissan";
        // //carro.modelo = "130";
        // carro.setModelo("130");
        // System.out.println(carro.getmodelo());

                //tentativa1 |  ex1
    //     contabancaria conta = new contabancaria();
    //     conta.setNumeroDaConta(12334);
    //     System.out.println("numero da conta: "+conta.getnumeroDaConta());
    //     conta.depositar(12.00);
    //     System.out.println("saldo depositado: "+conta.depositar());
    // }

            // Ex1
            //contabancaria conta = new contabancaria(12345, "João Silva", 1000.0);
            //conta.exibirSaldo();
            //conta.depositar(500.0);
            //conta.sacar(200.0);
            //conta.exibirSaldo();

            //Ex2
            reservas reservasDoDia = new reservas("joao paulo", 5, LocalDate.of(2006, 5, 23), 10000);
            reservasDoDia.dadosDaReserva("joao paulo", 5, "2006-05-23", 10000);
        
            double valorTotal = reservasDoDia.calcularValorDaReserva();
            System.out.println("Valor total da reserva: R$ " + valorTotal);
    }
    
}
