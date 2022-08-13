package org.example.base.service;

import org.example.base.entity.BaseEntity;

import java.util.List;

public interface BaseService<S extends BaseEntity<ID>, ID>  {

    S findById(ID id);

    S save(S s);

    void delete(ID id);

    List<S> findAll();

    S update(S r);

}
