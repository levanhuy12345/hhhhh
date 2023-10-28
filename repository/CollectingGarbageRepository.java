/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import Model.GarbageTruck;
import dataAccess.CollectingGarbageDao;

/**
 *
 * @author PC
 */
public class CollectingGarbageRepository implements ICollectingGarbageRepository{

    @Override
    public void getInput(GarbageTruck g) {
        CollectingGarbageDao.Instance().getInput(g);
    }

    @Override
    public void printTheCost(GarbageTruck g) {
        CollectingGarbageDao.Instance().printTheCost(g);
    }
    
}