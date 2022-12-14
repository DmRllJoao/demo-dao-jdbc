package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ExameDao;
import model.entities.Exame;

public class ExameService implements ExameDao {
    
    ExameDao exameDao = DaoFactory.createExameDao();

    @Override
    public void insert(Exame obj) {
        exameDao.insert(obj);

    }

    @Override
    public void update(Exame obj) {
        exameDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        exameDao.deleteById(id);
        
    }

    @Override
    public Exame findById(Integer id) {
        return exameDao.findById(id);
    }

    @Override
    public List<Exame> findAll() {
        return exameDao.findAll();
    }

}
