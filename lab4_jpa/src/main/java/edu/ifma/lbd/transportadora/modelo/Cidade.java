package edu.ifma.lbd.transportadora.modelo;

import javax.persistence.*;
import java.util.List;

public class Cidade implements EntidadeBase{
    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String uf;
    @Column
    private Float taxa;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidade")
    private List<Frete> fretes;

    @Override
    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Float getTaxa() {
        return taxa;
    }

    public void setTaxa(Float taxa) {
        this.taxa = taxa;
    }

    public List<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(List<Frete> fretes) {
        this.fretes = fretes;
    }
}
