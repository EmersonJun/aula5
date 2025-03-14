package pacote;

public class carro {
    public String marca;
    protected String modelo;
    private boolean andando;
    private boolean ligado;

    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public boolean isAndando(){
        return andando;
    }
    public boolean isLigado(){
        return ligado;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAndando(boolean andando){
        this.andando = andando;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
}
