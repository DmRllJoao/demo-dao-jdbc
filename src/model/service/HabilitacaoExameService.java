package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.HabilitacaoExameDao;
import model.entities.HabilitacaoExame;

public class HabilitacaoExameService implements HabilitacaoExameDao {
    
    HabilitacaoExameDao habilitacaoExameDao = DaoFactory.createHabilitacaoExameDao();

    @Override
    public void insert(HabilitacaoExame obj) {
        habilitacaoExameDao.insert(obj);

    }

    @Override
    public void update(HabilitacaoExame obj) {
        habilitacaoExameDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        habilitacaoExameDao.deleteById(id);
        
    }

    @Override
    public HabilitacaoExame findById(Integer id) {
        return habilitacaoExameDao.findById(id);
    }

    @Override
    public List<HabilitacaoExame> findAll() {
        return habilitacaoExameDao.findAll();
    }

}
