/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author labdas
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        Point P1=new Point();
        Point P2=new Point();
        Point Origin=new Point();
        int x,y;
        
        x=s.nextInt();
        y=s.nextInt();
        P1.setAbsis(x);
        P1.setOrdinat(y);
        x=s.nextInt();
        y=s.nextInt();
        P2.setAbsis(x);
        P2.setOrdinat(y);
        P1.print();
        P2.print();
        System.out.println(P1.isOrigin());
        System.out.println(P1.isEqual(P2));
        System.out.println(P1.kuadran());
        System.out.println(P1.distance(Origin));
        P1.translate(P2);
        P1.print();
        x=s.nextInt();
        y=s.nextInt();
        P1.translate(x, y);
        P1.print();
    }
    
}
