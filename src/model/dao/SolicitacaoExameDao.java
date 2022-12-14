package model.dao;

import java.util.List;

import model.entities.SolicitacaoExame;

public interface SolicitacaoExameDao {
    
    void insert(SolicitacaoExame obj);

    void update(SolicitacaoExame obj);

    void deleteById(Integer id);

    SolicitacaoExame findById(Integer id);

    List<SolicitacaoExame> findAll();

}
