package edu.ifma.lbd.transportadora.modelo;

import javax.persistence.*;

public class Frete implements EntidadeBase {
    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)

    private String descricao;
    @Column(nullable = false)
    private Float peso;
    @Column(nullable = false)
    private Float valor;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idCidade", nullable = false)
    private Cidade cidade;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) { this.id = id; }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = 10 + this.cidade.getTaxa();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
