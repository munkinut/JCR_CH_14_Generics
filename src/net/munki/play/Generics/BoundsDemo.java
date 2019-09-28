/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.munki.play.Generics;

/**
 *
 * @author Warren
 */
public class BoundsDemo {
    
    public static void main(String args[]) {
        
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<>(inums);
        Double v = iOb.average();
        System.out.println("iOb average = " + v);
        
        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        Double w = dOb.average();
        System.out.println("dOb average = " + w);

    }
    
}
