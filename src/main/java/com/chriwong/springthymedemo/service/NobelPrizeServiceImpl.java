package com.chriwong.springthymedemo.service;

import com.chriwong.springthymedemo.model.NobelPrize;
import com.chriwong.springthymedemo.repository.NobelPrizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NobelPrizeServiceImpl implements NobelPrizeService {

    @Autowired
    private NobelPrizeRepository repository;

    @Override
    public List<NobelPrize> getAllNobelPrizes() {
        List<NobelPrize> list = new ArrayList<>();

        Iterable<NobelPrize> prizes = this.repository.findAll();


        return null;
    }
}
