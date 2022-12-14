package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.MedicoHasEspecialidadeDao;
import model.entities.MedicoHasEspecialidade;

public class MedicoHasEspecialidadeService implements MedicoHasEspecialidadeDao {
    
    MedicoHasEspecialidadeDao medicoHasEspecialidadeDao = DaoFactory.createMedicoHasEspecialidadeDao();

    @Override
    public void insert(MedicoHasEspecialidade obj) {
        medicoHasEspecialidadeDao.insert(obj);

    }

    @Override
    public void update(MedicoHasEspecialidade obj) {
        medicoHasEspecialidadeDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        medicoHasEspecialidadeDao.deleteById(id);
        
    }

    @Override
    public MedicoHasEspecialidade findById(Integer id) {
        return medicoHasEspecialidadeDao.findById(id);
    }

    @Override
    public List<MedicoHasEspecialidade> findAll() {
        return medicoHasEspecialidadeDao.findAll();
    }

}
