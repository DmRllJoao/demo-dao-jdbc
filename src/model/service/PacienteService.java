package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.PacienteDao;
import model.entities.Paciente;

public class PacienteService implements PacienteDao {
    
    PacienteDao pacienteDao = DaoFactory.createPacienteDao();

    @Override
    public void insert(Paciente obj) {
        pacienteDao.insert(obj);

    }

    @Override
    public void update(Paciente obj) {
        pacienteDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        pacienteDao.deleteById(id);
        
    }

    @Override
    public Paciente findById(Integer id) {
        return pacienteDao.findById(id);
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteDao.findAll();
    }

}
