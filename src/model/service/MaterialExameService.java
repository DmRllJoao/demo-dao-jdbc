package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.MaterialExameDao;
import model.entities.MaterialExame;

public class MaterialExameService implements MaterialExameDao {
    
    MaterialExameDao materialExameDao = DaoFactory.createMaterialExameDao();

    @Override
    public void insert(MaterialExame obj) {
        materialExameDao.insert(obj);

    }

    @Override
    public void update(MaterialExame obj) {
        materialExameDao.update(obj);
        
    }

    @Override
    public void deleteById(Integer id) {
        materialExameDao.deleteById(id);
        
    }

    @Override
    public MaterialExame findById(Integer id) {
        return materialExameDao.findById(id);
    }

    @Override
    public List<MaterialExame> findAll() {
        return materialExameDao.findAll();
    }

}
