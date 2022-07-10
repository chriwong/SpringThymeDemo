package com.chriwong.springthymedemo.controller;

import com.chriwong.springthymedemo.service.NobelPrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/nobel/prizes")
public class NobelPrizeController {

    @Autowired
    private NobelPrizeService service;

    @GetMapping("/")
    public Object getAllNobelPrizes(HttpServletRequest request) {
        System.out.println(request.toString());

        return this.service.getAllNobelPrizes();
    }
}
