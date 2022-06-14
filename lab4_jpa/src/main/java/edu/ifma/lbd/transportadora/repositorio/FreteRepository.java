package edu.ifma.lbd.transportadora.repositorio;

import edu.ifma.lbd.transportadora.modelo.Cidade;
import edu.ifma.lbd.transportadora.modelo.Cliente;
import edu.ifma.lbd.transportadora.modelo.Frete;
import javax.persistence.EntityManager;
import java.util.List;

public class FreteRepository {
    private final EntityManager manager;
    private DAOGenerico<Frete> daoGenerico;

    public FreteRepository(EntityManager manager) {
        this.manager = manager;
        daoGenerico = new DAOGenerico<Frete>(manager);
    }

    public Frete buscaPor(Integer id) {
        return daoGenerico.buscaPorId(Frete.class, id);
    }

    public Frete salvaOuAtualiza(Frete frete) {
        return daoGenerico.salvaOuAtualiza(frete);
    }

}
