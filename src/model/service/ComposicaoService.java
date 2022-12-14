package model.service;

import java.util.List;

import model.dao.ComposicaoDao;
import model.dao.DaoFactory;
import model.entities.Composicao;

public class ComposicaoService implements ComposicaoDao {
    
    ComposicaoDao composicaoDao = DaoFactory.createComposicaoDao();

    @Override
    public void insert(Composicao obj) {
        composicaoDao.insert(obj);

    }

    @Override
    public void update(Composicao obj) {
        composicaoDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        composicaoDao.deleteById(id);
        
    }

    @Override
    public Composicao findById(Integer id) {
        return composicaoDao.findById(id);
    }

    @Override
    public List<Composicao> findAll() {
        return composicaoDao.findAll();
    }

}
