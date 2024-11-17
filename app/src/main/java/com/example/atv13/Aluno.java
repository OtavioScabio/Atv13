package com.example.atv13;

//Otavio Gabriel Ribeiro Scabio - RA 1110482223043

public class Aluno {
    private String ra;
    private String nome;
    private String email;

    public Aluno(String ra, String nome, String email) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
    }

    public String getRa() { return ra; }
    public void setRa(String ra) { this.ra = ra; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Aluno [RA=" + ra + ", Nome=" + nome + ", Email=" + email + "]";
    }
}
