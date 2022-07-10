package com.chriwong.springthymedemo.repository;

import com.chriwong.springthymedemo.model.NobelPrize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Using JpaRepository instead of CrudRepository because the former returns List and the latter returns Iterable
@Repository
public interface NobelPrizeRepository extends JpaRepository<NobelPrize, Long> {

    List<NobelPrize> findByYear(int year);

    List<NobelPrize> findByCategory(String category);

    List<NobelPrize> findByLaureatesFirstnameLike(String firstname);

    List<NobelPrize> findByLaureatesSurnameLike(String surname);
}
