package org.example.base.repository;

import org.example.base.entity.BaseEntity;

import java.util.List;

public interface BaseRepository<R extends BaseEntity<ID> , ID> {

    void createTable();

    R findById(ID id);

    R save(R r);

    void delete(ID id);

    List<R> findAll();

    R update(R r);




}
