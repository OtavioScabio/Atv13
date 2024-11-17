package com.example.atv13;

//Otavio Gabriel Ribeiro Scabio - RA 1110482223043

public class Revista extends Exemplar {
    private String issn;
    private int numeroEdicao;

    public Revista(int codigo, String nome, String issn, int numeroEdicao) {
        super(codigo, nome);
        this.issn = issn;
        this.numeroEdicao = numeroEdicao;
    }

    public String getIssn() { return issn; }
    public void setIssn(String issn) { this.issn = issn; }

    public int getNumeroEdicao() { return numeroEdicao; }
    public void setNumeroEdicao(int numeroEdicao) { this.numeroEdicao = numeroEdicao; }

    @Override
    public String toString() {
        return super.toString() + " [Revista: ISSN=" + issn + ", Numero de Edicao=" + numeroEdicao + "]";
    }
}