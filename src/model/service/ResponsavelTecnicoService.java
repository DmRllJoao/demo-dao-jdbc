package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ResponsavelTecnicoDao;
import model.entities.ResponsavelTecnico;

public class ResponsavelTecnicoService implements ResponsavelTecnicoDao {
    
    ResponsavelTecnicoDao responsavelTecnicoDao = DaoFactory.createResponsavelTecnicoDao();

    @Override
    public void insert(ResponsavelTecnico obj) {
        responsavelTecnicoDao.insert(obj);

    }

    @Override
    public void update(ResponsavelTecnico obj) {
        responsavelTecnicoDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        responsavelTecnicoDao.deleteById(id);
        
    }

    @Override
    public ResponsavelTecnico findById(Integer id) {
        return responsavelTecnicoDao.findById(id);
    }

    @Override
    public List<ResponsavelTecnico> findAll() {
        return responsavelTecnicoDao.findAll();
    }

}
