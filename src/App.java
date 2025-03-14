import pacote.carro;

public class App {
    public static void main(String[] args){

        carro carro = new carro();
        carro.marca = "nissan";
        //carro.modelo = "130";
        carro.setModelo("130");
        System.out.println(carro.getmodelo());
    }
}
