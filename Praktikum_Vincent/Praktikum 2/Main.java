/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author Vincent
 * NIM 18217042
 * Topik: Inheritance
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         Triangle t=new Triangle();
//         Rectangle r=new Rectangle();
//         Circle c=new Circle(8);
         Scanner s=new Scanner(System.in);
         int i1,i2,radius;
         
         Triangle t=new Triangle();
         for(int i=0;i<3;i++){
            i1=s.nextInt();
            i2=s.nextInt();
            t.setPoint(i, i1, i2);
         }
         Rectangle r=new Rectangle();
         for(int i=0;i<4;i++){
            i1=s.nextInt();
            i2=s.nextInt();
            r.setPoint(i, i1, i2);
         }
         i1=s.nextInt();
         i2=s.nextInt();
         radius=s.nextInt();
         Circle c=new Circle(radius);
         c.setPoint(0, i1, i2);
         
         i1=s.nextInt();
         i2=s.nextInt();
         Point p=new Point();
         p.setAbsis(i1);
         p.setOrdinat(i2);
         t.translate(p);
         r.translate(p);
         c.translate(p);
         t.print();
         r.print();
         c.print();
    }
    
}
