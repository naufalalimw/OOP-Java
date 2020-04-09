/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author labdas
 */
public class Triangle {
    private Point a, b, c; // titik sudut
    // Constructor
    // Membentuk segitiga dengan titik sudut a, b, c
    // a, b, c dijamin membentuk segitiga yang valid
    public Triangle(Point a, Point b, Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    // Getter
    public Point getA(){
        return a;
    }
    public Point getB(){
        return b;
    }
    public Point getC(){
        return c;
    }
    // Setter
    public void setA(Point a){
        this.a=a;
    }
    public void setB(Point b){
        this.b=b;
    }
    public void setC(Point c){
        this.c=c;
    }
    // Menghasilkan true jika segitiga pada argumen sama dengan dirinya
    public boolean isEqual(Triangle t){
        return((a==t.a)&&(b==t.b)&&(c==t.c));
    }
    // Mengubah segitiga dengan penambahan Point argumen
    public void translate(Point p){
        a.translate(p);
        b.translate(p);
        c.translate(p);
    }
    // Mentranslasikan segitiga sebesar (x, y)
    public void translate(int x, int y){
        a.translate(x, y);
        b.translate(x, y);
        c.translate(x, y);
    }
    // Menghasilkan keliling segitiga
    public double perimeter(){
        return(a.distance(b)+b.distance(c)+c.distance(a));
    }
    // Menuliskan segitiga ke layar dengan format
    // "(x_a,y_a)"
    // "(x_b, y_b)"
    // "(x_c, y_c)"
    public void print(){
        System.out.println("("+a.getAbsis()+"_a,"+a.getOrdinat()+"_a)");
        System.out.println("("+b.getAbsis()+"_b,"+b.getOrdinat()+"_b)");
        System.out.println("("+c.getAbsis()+"_b,"+c.getOrdinat()+"_c)");
    }
}
