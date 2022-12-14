package model.service;

import java.util.List;

import model.dao.ComposicaoExameDao;
import model.dao.DaoFactory;
import model.entities.ComposicaoExame;

public class ComposicaoExameService implements ComposicaoExameDao {
    
    ComposicaoExameDao composicaoExameDao = DaoFactory.createComposicaoExameDao();

    @Override
    public void insert(ComposicaoExame obj) {
        composicaoExameDao.insert(obj);

    }

    @Override
    public void update(ComposicaoExame obj) {
        composicaoExameDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        composicaoExameDao.deleteById(id);
        
    }

    @Override
    public ComposicaoExame findById(Integer id) {
        return composicaoExameDao.findById(id);
    }

    @Override
    public List<ComposicaoExame> findAll() {
        return composicaoExameDao.findAll();
    }

}
