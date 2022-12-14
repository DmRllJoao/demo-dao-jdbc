package model.dao;

import java.util.List;

import model.entities.Composicao;

public interface ComposicaoDao {
    
    void insert(Composicao obj);

    void update(Composicao obj);

    void deleteById(Integer id);

    Composicao findById(Integer id);

    List<Composicao> findAll();

}