package com.chriwong.springthymedemo.repository;

import com.chriwong.springthymedemo.model.NobelPrize;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RepositoryPopulatorTest {

    @Autowired
    private NobelPrizeRepository nobelPrizeRepository;

    @Test
    public void testRepositoryPopulatorWorks() {
        List<NobelPrize> prizes = (List<NobelPrize>) nobelPrizeRepository.findAll();
        assertTrue(prizes.size() > 50);
    }

}
