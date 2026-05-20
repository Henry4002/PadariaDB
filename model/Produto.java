package model;

import java.util.Date;

public class Produto {
    private int id;
    private String nome;
    private int qtd_estoque;
    private int qtd_minima;
    private Date data_validade;
    private String categoria;

    public Produto(int id, String nome, int qtd_estoque, int qtd_minima, Date data_validade, String categoria) {
        this.id = id;
        this.nome = nome;
        this.qtd_estoque = qtd_estoque;
        this.qtd_minima = qtd_minima;
        this.data_validade = data_validade;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public int getQtd_minima() {
        return qtd_minima;
    }

    public void setQtd_minima(int qtd_minima) {
        this.qtd_minima = qtd_minima;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
