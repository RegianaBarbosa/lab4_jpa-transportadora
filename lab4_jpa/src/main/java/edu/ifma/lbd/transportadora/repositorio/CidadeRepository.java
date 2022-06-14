package edu.ifma.lbd.transportadora.repositorio;

import edu.ifma.lbd.transportadora.modelo.Cidade;

import javax.persistence.EntityManager;
import java.util.List;

public class CidadeRepository {
    private final EntityManager manager;
    private DAOGenerico<Cidade> daoGenerico;

    public CidadeRepository(EntityManager manager) {
        this.manager = manager;
        daoGenerico = new DAOGenerico<Cidade>(manager);
    }
    public Cidade buscaPor(Integer id) {
        return daoGenerico.buscaPorId(Cidade.class, id);
    }

    public List<Cidade> buscaPorNome(String nome) {
        return this.manager.createQuery("from Cidade " +
                        "where upper(nome) like :nome", Cidade.class)
                .setParameter("nome", nome.toUpperCase() + "%")
                .getResultList();
    }

    public List<Cidade> buscaPorUF(String uf) {
        return this.manager.createQuery("from Cidade " +
                        "where upper(uf) like :uf", Cidade.class)
                .setParameter("uf", uf.toUpperCase() + "%")
                .getResultList();
    }

    public Cidade salvaOuAtualiza(Cidade cidade) {
        return daoGenerico.salvaOuAtualiza(cidade);
    }

    public void remove(Cidade cidade) {
        daoGenerico.remove(cidade);
    }
}
