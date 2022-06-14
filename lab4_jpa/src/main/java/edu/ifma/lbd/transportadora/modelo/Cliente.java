package edu.ifma.lbd.transportadora.modelo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class Cliente implements EntidadeBase{
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column (nullable = false)
    private String endereco;
    @Column (nullable = false)
    private String telefone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Frete> fretes;


    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(List<Frete> fretes) {
        this.fretes = fretes;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}
