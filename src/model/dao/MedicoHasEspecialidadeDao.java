package model.dao;

import java.util.List;

import model.entities.MedicoHasEspecialidade;

public interface MedicoHasEspecialidadeDao {
    
    void insert(MedicoHasEspecialidade obj);

    void update(MedicoHasEspecialidade obj);

    void deleteById(Integer id);

    MedicoHasEspecialidade findById(Integer id);

    List<MedicoHasEspecialidade> findAll();

}
