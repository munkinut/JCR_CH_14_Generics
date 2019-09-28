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
class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) 
            if (x.equals(y[i])) return true;
        
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer nums[] = {1,2,3,4,5};
        
        if(isIn(2,nums))
            System.out.println("2 is in nums");
        
        if(!isIn(7, nums))
            System.out.println("7 is not in nums");
        
        String str[] = {"one", "two", "three", "four", "five"};
        
        if(isIn("two", str))
            System.out.println("two is in str");
        
        if(!isIn("seven", str))
            System.out.println("seven is not in str");
        
        // wont compile, types must be compatible
        //if(isIn("two", nums))
        //    System.out.println("two is in nums");
    }
    
}
