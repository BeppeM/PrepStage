package com.esempio.stage.controller;

import com.esempio.stage.repository.PointsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    PointsRepository pointsRepository;

    @RequestMapping("/")
    public String index(){
        return pointsRepository.getNumbers();
    }

    @RequestMapping("/{numero}")
    public void addNumber(@PathVariable(value="numero") int numero){
        pointsRepository.addNumber(numero);
    }
}
