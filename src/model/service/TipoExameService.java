package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.TipoExameDao;
import model.entities.TipoExame;

public class TipoExameService implements TipoExameDao {
    
    TipoExameDao tipoExameDao = DaoFactory.createTipoExameDao();

    @Override
    public void insert(TipoExame obj) {
        tipoExameDao.insert(obj);

    }

    @Override
    public void update(TipoExame obj) {
        tipoExameDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        tipoExameDao.deleteById(id);
        
    }

    @Override
    public TipoExame findById(Integer id) {
        return tipoExameDao.findById(id);
    }

    @Override
    public List<TipoExame> findAll() {
        return tipoExameDao.findAll();
    }

}
