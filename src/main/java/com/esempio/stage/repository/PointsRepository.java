package com.esempio.stage.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class PointsRepository {
    private ArrayList<Integer> numeri= new ArrayList<Integer>();

    public PointsRepository(){
        numeri.add(0);
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
    }

    public void addNumber(int n){
        numeri.add(n);
    }

    public String getNumbers(){
        String s="";
        for(int i=0; i< numeri.size(); i++){
            s+=numeri.get(i);
            s+=" ";
        }
        return s;
    }
}
