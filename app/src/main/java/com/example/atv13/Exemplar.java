package com.example.atv13;

//Otavio Gabriel Ribeiro Scabio - RA 1110482223043

public abstract class Exemplar {
    private int codigo;
    private String nome;
    private boolean emprestado;

    public Exemplar(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.emprestado = false;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public boolean isEmprestado() { return emprestado; }
    public void setEmprestado(boolean emprestado) { this.emprestado = emprestado; }

    @Override
    public String toString() {
        return "Exemplar [Codigo=" + codigo + ", Nome=" + nome + ", Emprestado=" + emprestado + "]";
    }
}
