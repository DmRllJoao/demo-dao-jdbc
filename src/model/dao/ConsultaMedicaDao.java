package model.dao;

import java.util.List;

import model.entities.ConsultaMedica;

public interface ConsultaMedicaDao {
    
    void insert(ConsultaMedica obj);

    void update(ConsultaMedica obj);

    void deleteById(Integer id);

    ConsultaMedica findById(Integer id);

    List<ConsultaMedica> findAll();

}
