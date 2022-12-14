package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.LaudoDao;
import model.entities.Laudo;

public class LaudoService implements LaudoDao {
    
    LaudoDao laudoDao = DaoFactory.createLaudoDao();

    @Override
    public void insert(Laudo obj) {
        laudoDao.insert(obj);

    }

    @Override
    public void update(Laudo obj) {
        laudoDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        laudoDao.deleteById(id);
        
    }

    @Override
    public Laudo findById(Integer id) {
        return laudoDao.findById(id);
    }

    @Override
    public List<Laudo> findAll() {
        return laudoDao.findAll();
    }

}
