package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplArraylist implements CricketerService {
private List<Cricketer> cricketerList;

    public CricketerServiceImplArraylist() {
          this.cricketerList=new ArrayList<Cricketer>();
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        return cricketerList;
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
       cricketerList.add(cricketer);
        return cricketerList.size();
    } 

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
       cricketerList.sort(Comparator.comparing(Cricketer::getExperience));
    return cricketerList;
}
@Override
public void emptyArrayList()
{
    cricketerList = new ArrayList<>();
}
}
