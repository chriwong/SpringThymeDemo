package com.chriwong.springthymedemo.repository;

import com.chriwong.springthymedemo.model.NobelLaureate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NobelLaureatesRepository extends CrudRepository<NobelLaureate, Long> {

    public List<NobelLaureate> findByFirstname(String firstname);

    public List<NobelLaureate> findBySurname(String surname);

    public List<NobelLaureate> findByPrizesCategory(String prizes_category);


}
