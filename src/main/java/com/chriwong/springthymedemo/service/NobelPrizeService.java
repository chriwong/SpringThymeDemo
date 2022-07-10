package com.chriwong.springthymedemo.service;

import com.chriwong.springthymedemo.model.NobelPrize;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NobelPrizeService {

    public List<NobelPrize> getAllNobelPrizes();

//    public List<NobelPrize> getMostRecentNobelPrize();
//
//    public List<NobelPrize> getNobelPrizes(int year);
//
//    public List<NobelPrize> getNobelPrizes(String category);
//
//    public List<NobelPrize> getNobelPrize(int year, String category);
//
//    public List<NobelPrize> getNobelPrizesAfter(int year);
//
//    public List<NobelPrize> getNobelPrizesBefore(int year);

}
