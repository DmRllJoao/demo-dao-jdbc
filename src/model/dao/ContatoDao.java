package model.dao;

import java.util.List;

import model.entities.Contato;
import model.entities.Laboratorio;

public interface ContatoDao {
    
    void insert(Contato obj);

	void update(Contato obj);

	void deleteById(Integer id);

	Contato findById(Integer id);

	List<Contato> findAll();

	List<Contato> findByLaboratorio(Laboratorio laboratorio);
}
