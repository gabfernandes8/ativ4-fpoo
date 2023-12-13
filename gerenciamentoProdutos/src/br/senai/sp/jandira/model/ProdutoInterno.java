package br.senai.sp.jandira.model;

public class ProdutoInterno extends Produto {

    int ram, memoria, nucleo;

    public ProdutoInterno() {
        this.ram = 0;
        this.memoria = 0;
        this.nucleo = 0;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getNucleo() {
        return nucleo;
    }

    public void setNucleo(int nucleo) {
        this.nucleo = nucleo;
    }
}

