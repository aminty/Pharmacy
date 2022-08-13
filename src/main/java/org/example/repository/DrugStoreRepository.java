package org.example.repository;

import org.example.entity.Drug;

import java.util.List;

public interface DrugStoreRepository {

    List<Drug> findAll();

    void save(Drug drug);

    void delete(Drug drug);


}
