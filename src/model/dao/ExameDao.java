package model.dao;

import java.util.List;

import model.entities.Exame;

public interface ExameDao {
    
    void insert(Exame obj);

	void update(Exame obj);

	void deleteById(Integer id);

	Exame findById(Integer id);

	List<Exame> findAll();

}
