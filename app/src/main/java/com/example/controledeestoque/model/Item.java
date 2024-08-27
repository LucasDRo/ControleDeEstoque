package com.example.controledeestoque.model;

public class Item {

    private String nome;
    private int qtde;
    private float codigo;
    private String categoria;

    public Item() {
    }

    public Item(String nome, int qtde, float codigo, String categoria){
        this.categoria=categoria;
        this.codigo=codigo;
        this.nome=nome;
        this.qtde=qtde;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
