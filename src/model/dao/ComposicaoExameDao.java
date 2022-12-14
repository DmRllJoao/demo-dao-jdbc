package model.dao;

import java.util.List;

import model.entities.ComposicaoExame;

public interface ComposicaoExameDao {
    
    void insert(ComposicaoExame obj);

	void update(ComposicaoExame obj);

	void deleteById(Integer id);

	ComposicaoExame findById(Integer id);

	List<ComposicaoExame> findAll();

}
