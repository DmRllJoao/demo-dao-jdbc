package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.LaboratorioDao;
import model.entities.Laboratorio;

public class LaboratorioService implements LaboratorioDao {
    
    LaboratorioDao laboratorioDao = DaoFactory.createLaboratorioDao();

    @Override
    public void insert(Laboratorio obj) {
        laboratorioDao.insert(obj);

    }

    @Override
    public void update(Laboratorio obj) {
        laboratorioDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        laboratorioDao.deleteById(id);
        
    }

    @Override
    public Laboratorio findById(Integer id) {
        return laboratorioDao.findById(id);
    }

    @Override
    public List<Laboratorio> findAll() {
        return laboratorioDao.findAll();
    }

}
