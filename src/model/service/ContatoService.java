package model.service;

import java.util.List;

import model.dao.ContatoDao;
import model.dao.DaoFactory;
import model.entities.Contato;
import model.entities.Laboratorio;

public class ContatoService implements ContatoDao {
    
    ContatoDao contatoDao = DaoFactory.createContatoDao();

    @Override
    public void insert(Contato obj) {
        contatoDao.insert(obj);

    }

    @Override
    public void update(Contato obj) {
        contatoDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        contatoDao.deleteById(id);
        
    }

    @Override
    public Contato findById(Integer id) {
        return contatoDao.findById(id);
    }

    @Override
    public List<Contato> findAll() {
        return contatoDao.findAll();
    }

    @Override
    public List<Contato> findByLaboratorio(Laboratorio laboratorio) {
        return contatoDao.findByLaboratorio(laboratorio);
    }

}
