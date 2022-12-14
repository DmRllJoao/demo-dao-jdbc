package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ResponsavelTecnicoHasLaboratorioDao;
import model.entities.ResponsavelTecnicoHasLaboratorio;

public class ResponsavelTecnicoHasLaboratorioService implements ResponsavelTecnicoHasLaboratorioDao {
    
    ResponsavelTecnicoHasLaboratorioDao responsavelTecnicoDao = DaoFactory.createResponsavelTecnicoHasLaboratorioDao();

    @Override
    public void insert(ResponsavelTecnicoHasLaboratorio obj) {
        responsavelTecnicoDao.insert(obj);

    }

    @Override
    public void update(ResponsavelTecnicoHasLaboratorio obj) {
        responsavelTecnicoDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        responsavelTecnicoDao.deleteById(id);
        
    }

    @Override
    public ResponsavelTecnicoHasLaboratorio findById(Integer id) {
        return responsavelTecnicoDao.findById(id);
    }

    @Override
    public List<ResponsavelTecnicoHasLaboratorio> findAll() {
        return responsavelTecnicoDao.findAll();
    }

}
