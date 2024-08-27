package com.example.controledeestoque.model;

import android.icu.text.StringSearch;

public class empreendimento {
    private String nomeFantasia;
    private String razaoSocial;
    private Float cnpj;
    private Float incricaoEstadual;
    private String bairro;
    private String rua;
    private int num;
    private String estado;
    private String cidade;

    public void empreendimento(){

    }

    public void empreendimento(String razaoSocial, Float cnpj, Float incricaoEstadual, String bairro, String rua, int num, String estado, String cidade){
        this.razaoSocial=razaoSocial;
        this.cnpj=cnpj;
        this.incricaoEstadual=incricaoEstadual;
        this.bairro=bairro;
        this.rua=rua;
        this.num=num;
        this.estado=estado;
        this.cidade=cidade;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Float getCnpj() {
        return cnpj;
    }

    public void setCnpj(Float cnpj) {
        this.cnpj = cnpj;
    }

    public Float getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(Float incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
