package com.example.agenda_java.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Aluno implements Serializable {

    private int id = 0;
    private String nome;
    private String cel;
    private String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.cel = telefone;
        this.email = email;
    }

    public Aluno() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCel() {
        return cel;
    }

    public String getEmail() {
        return email;
    }

    @NonNull
    @Override
    public String toString() { return nome +" - "+ cel;}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean temIdValido() {
        return id > 0;
    }
}
