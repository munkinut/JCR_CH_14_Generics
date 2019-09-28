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
public class BoundedWildcardDemo {

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y);
        }
        System.out.println();
    }
    
    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z);
        }
        System.out.println();
    }
    
    static void showXYZT(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z + " " +
                               c.coords[i].t);
        }
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TwoD td[] = {
            new TwoD(0, 0),
            new TwoD(10, 5),
            new TwoD(15, 20),
            new TwoD(20, 25)
        };
        
        Coords<TwoD> tdlocs = new Coords<>(td);
        
        System.out.println("Contents of tdlocs:");
        showXY(tdlocs);
        
        FourD fd[] = {
            new FourD(0, 0, 0, 0),
            new FourD(10, 5, 15, 20),
            new FourD(15, 20, 25, 30),
            new FourD(20, 25, 30, 35)
        };
        
        Coords<FourD> fdlocs = new Coords<>(fd);
        
        System.out.println("Contents of fdlocs:");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showXYZT(fdlocs);
        
    }
    
}
