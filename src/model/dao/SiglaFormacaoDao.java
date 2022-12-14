package model.dao;

import java.util.List;

import model.entities.SiglaFormacao;

public interface SiglaFormacaoDao {
    
    void insert(SiglaFormacao obj);

    void update(SiglaFormacao obj);

    void deleteById(Integer id);

    SiglaFormacao findById(Integer id);

    List<SiglaFormacao> findAll();
}
