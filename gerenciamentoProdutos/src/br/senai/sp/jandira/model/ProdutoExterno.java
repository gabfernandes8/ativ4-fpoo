package br.senai.sp.jandira.model;

public class ProdutoExterno extends Produto{

    int tamanho;
    String cor;
    Boolean bluetooth;

    public ProdutoExterno(int id, int quantidade, double preco, String fornecedor, String nome){
        super(quantidade, preco, fornecedor, nome);
        this.tamanho = 0;
        this.bluetooth = true;
        this.cor = "Preto";
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
