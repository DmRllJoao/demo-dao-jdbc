package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ValorReferenciaComposicaoExameDao;
import model.entities.ValorReferenciaComposicaoExame;

public class ValorReferenciaComposicaoExameService implements ValorReferenciaComposicaoExameDao {
    
    ValorReferenciaComposicaoExameDao valorReferencia = DaoFactory.createValorReferenciaComposicaoExameDao();

    @Override
    public void insert(ValorReferenciaComposicaoExame obj) {
        valorReferencia.insert(obj);

    }

    @Override
    public void update(ValorReferenciaComposicaoExame obj) {
        valorReferencia.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        valorReferencia.deleteById(id);
        
    }

    @Override
    public ValorReferenciaComposicaoExame findById(Integer id) {
        return valorReferencia.findById(id);
    }

    @Override
    public List<ValorReferenciaComposicaoExame> findAll() {
        return valorReferencia.findAll();
    }

}
