/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import Model.GarbageTruck;

/**
 *
 * @author PC
 */
public interface ICollectingGarbageRepository {
    void getInput(GarbageTruck g);
    void printTheCost(GarbageTruck g);
}