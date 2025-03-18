package pacote;

import java.time.LocalDate;

public class evento {
    private String nome;
    private LocalDate data;
    private float valorDoIngresso;
    private int quantidadeDeIngresso;
    private int quantidadeDeIngressoVendido;

    public evento(String nome, LocalDate data, float valorDoIngresso, int quantidadeDeIngresso, int quantidadeDeIngressoVendido){
        this.nome = nome;
        this.data = data;
        this.valorDoIngresso = valorDoIngresso;
        this.quantidadeDeIngresso = quantidadeDeIngresso;
        this.quantidadeDeIngressoVendido = quantidadeDeIngressoVendido;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public float getValorDoIngresso() {
        return valorDoIngresso;
    }
    public void setValorDoIngresso(float valorDoIngresso) {
        this.valorDoIngresso = valorDoIngresso;
    }
    public int getQuantidadeDeIngresso() {
        return quantidadeDeIngresso;
    }
    public void setQuantidadeDeIngresso(int quantidadeDeIngresso) {
        this.quantidadeDeIngresso = quantidadeDeIngresso;
    }
    public int getQuantidadeDeIngressoVendido() {
        return quantidadeDeIngressoVendido;
    }
    public void setQuantidadeDeIngressoVendidos(int quantidadeDeIngressoVendido) {
        this.quantidadeDeIngressoVendido = quantidadeDeIngressoVendido;
    }

    public void venderIngresso(int quantidade) {
        if (quantidade <= quantidadeDeIngresso - quantidadeDeIngressoVendido) {
            quantidadeDeIngressoVendido += quantidade;
            System.out.println("Venda realizada com sucesso! Ingressos vendidos: " + quantidade);
        } else {
            System.out.println("Ingressos insuficientes para a venda.");
        }
    }

    public void verArrecadacao() {
        float arrecadacao = quantidadeDeIngressoVendido * valorDoIngresso;
        System.out.println("Arrecadação: R$ " + arrecadacao);
    }
}
