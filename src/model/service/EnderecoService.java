package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.EnderecoDao;
import model.entities.Endereco;

public class EnderecoService implements EnderecoDao {
    
    EnderecoDao EnderecoDao = DaoFactory.createEnderecoDao();

    @Override
    public void insert(Endereco obj) {
        EnderecoDao.insert(obj);

    }

    @Override
    public void update(Endereco obj) {
        EnderecoDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        EnderecoDao.deleteById(id);
        
    }

    @Override
    public Endereco findById(Integer id) {
        return EnderecoDao.findById(id);
    }

    @Override
    public List<Endereco> findAll() {
        return EnderecoDao.findAll();
    }

}
