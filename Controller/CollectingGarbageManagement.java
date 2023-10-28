/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GarbageTruck;
import repository.CollectingGarbageRepository;
import repository.ICollectingGarbageRepository;
import View.Menu;
/**
 *
 * @author PC
 */
public class CollectingGarbageManagement extends Menu<String>{
    private ICollectingGarbageRepository garbageRepository;
    static String[] options = {"Input", "Print", "Exit"};
    GarbageTruck g;
    public CollectingGarbageManagement() {
        super("===== COLLECTING GARBAGE MANAGEMENT =====", options);
        garbageRepository = new CollectingGarbageRepository();
        g = new GarbageTruck();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 : garbageRepository.getInput(g);
                     break;
            case 2 :garbageRepository.printTheCost(g);
                     break;
            case 3 :System.exit(0);
        }
    }
  
}