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
public class WildcardDemo {
    
    public static void main(String args[]) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<>(inums);
        Double v = iOb.average();
        System.out.println("iOb average = " + v);
        
        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        Double w = dOb.average();
        System.out.println("dOb average = " + w);
        
        Float fnums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats<Float> fOb = new Stats<>(fnums);
        Double x = fOb.average();
        System.out.println("fOb average = " + w);
        
        System.out.print("Averages of iOb and dOB ");
        if(iOb.sameAvg(dOb))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
        
        System.out.print("Averages of iOb and fOB ");
        if(iOb.sameAvg(fOb))
            System.out.println("are the same.");
        else
            System.out.println("differ.");   }
    
}
