package com.example.atv13;

//Otavio Gabriel Ribeiro Scabio - RA 1110482223043

public class Livro extends Exemplar {
    private String isbn;
    private int edicao;

    public Livro(int codigo, String nome, String isbn, int edicao) {
        super(codigo, nome);
        this.isbn = isbn;
        this.edicao = edicao;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getEdicao() { return edicao; }
    public void setEdicao(int edicao) { this.edicao = edicao; }

    @Override
    public String toString() {
        return super.toString() + " [Livro: ISBN=" + isbn + ", Edicao=" + edicao + "]";
    }
}
