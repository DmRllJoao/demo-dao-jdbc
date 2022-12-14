package model.dao;

import java.util.List;

import model.entities.ResultadoExame;

public interface ResultadoExameDao {
    
    void insert(ResultadoExame obj);

	void update(ResultadoExame obj);

	void deleteById(Integer id);

	ResultadoExame findById(Integer id);

	List<ResultadoExame> findAll();

}
