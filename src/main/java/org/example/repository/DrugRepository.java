package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Drug;

public interface DrugRepository extends BaseRepository<Drug,Long>{

    boolean isDrugExists(Drug drug);




}
