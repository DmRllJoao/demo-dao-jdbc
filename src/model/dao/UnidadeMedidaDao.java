package model.dao;

import java.util.List;

import model.entities.UnidadeMedida;

public interface UnidadeMedidaDao {
    
    void insert(UnidadeMedida obj);

    void update(UnidadeMedida obj);

    void deleteById(Integer id);

    UnidadeMedida findById(Integer id);

    List<UnidadeMedida> findAll();
}
