package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.EspecialidadeDao;
import model.entities.Especialidade;

public class EspecialidadeService implements EspecialidadeDao {
    
    EspecialidadeDao especialidadeDao = DaoFactory.createEspecialidadeDao();

    @Override
    public void insert(Especialidade obj) {
        especialidadeDao.insert(obj);

    }

    @Override
    public void update(Especialidade obj) {
        especialidadeDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        especialidadeDao.deleteById(id);
        
    }

    @Override
    public Especialidade findById(Integer id) {
        return especialidadeDao.findById(id);
    }

    @Override
    public List<Especialidade> findAll() {
        return especialidadeDao.findAll();
    }

}
