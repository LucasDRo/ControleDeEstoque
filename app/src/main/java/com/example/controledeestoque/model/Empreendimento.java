package com.example.controledeestoque.model;

import android.content.ContentValues;
import android.content.Context;

public class Empreendimento {
    private int id;
    private String nomeFantasia;
    private String razaoSocial;
    private double cnpj;
    private double inscEstadual;
    private String bairro;
    private String rua;
    private int num;
    private String estado;
    private String cidade;

    public void empreendimento(){

    }

    public void empreendimento(String razaoSocial, double cnpj, double inscEstadual, String bairro, String rua, int num, String estado, String cidade){
        this.razaoSocial=razaoSocial;
        this.cnpj=cnpj;
        this.inscEstadual=inscEstadual;
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

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public double getinscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(double inscEstadual) {
        this.inscEstadual = inscEstadual;
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

    public ContentValues getContentValues(){
        ContentValues values = new ContentValues();
        if(id > 0)
            values.put("id", id);
        values.put("nomeFantasia", nomeFantasia);
        values.put("cnpj", cnpj);
        values.put("razaoSocial", razaoSocial);
        values.put("inscEstadual", inscEstadual);
        values.put("bairro", bairro);
        values.put("rua", rua);
        values.put("num", num);
        values.put("estado", estado);
        values.put("cidade", cidade);
        return values;
    }
}
