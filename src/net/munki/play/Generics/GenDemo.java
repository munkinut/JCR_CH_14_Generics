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
public class GenDemo {
    
    public static void main(String args[]) {
        
        Gen<Integer> iOb;
        // iOb = new Gen<Integer>(88);
        iOb = new Gen<>(88);
        iOb.showType();
        
        int v = iOb.getOb();
        System.out.println("value = " + v);
        System.out.println();
        
        Gen<String> strOb;
        // strOb = new Gen<String>("Generics Test");
        strOb = new Gen<>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value = " + str);
         
    }
    
}
