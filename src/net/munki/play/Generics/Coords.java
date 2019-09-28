/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.munki.play.Generics;

class TwoD {
    
    int x,y;
    
    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD {
    
    int z;
    
    ThreeD(int a, int b, int c) {
        super(a,b);
        z = c;
    }
}

class FourD extends ThreeD {
    
    int t;
    
    FourD(int a, int b, int c, int d) {
        super(a,b,c);
        t = d;
    }
}

/**
 *
 * @author Warren
 */
class Coords<T extends TwoD> {
    
    T[] coords;
    
    Coords(T[] c) {
        coords = c;
    }
}
