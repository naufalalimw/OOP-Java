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
public class Point {
    private int x; // absis dan ordinat
    private int y; // absis dan ordinat
// Constructor
// Set titik mula-mula ke (0, 0)
    public Point(){
        this(0,0);
    }
// Set titik mula-mula ke (x, y)
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
// Getter
    public int getAbsis(){
        return x;
    }
    public int getOrdinat(){
        return y;
    }
// Setter
    public void setAbsis(int x){
        this.x=x;
    }
    public void setOrdinat(int y){
        this.y=y;
    }
    // Menghasilkan true jika titik (x, y) berada di (0, 0)
    public boolean isOrigin(){
        return((x==0)&&(y==0));
    }
    // Menghasilkan true jika titik pada argumen sama dengan dirinya
    public boolean isEqual(Point p){
        return((x==p.x)&&(y==p.y));
    }
    // Mengubah titik dengan penambahan Point argumen
    public void translate(Point p){
        x+=p.x;
        y+=p.y;
    }
    // Mentranslasikan titik sebesar (x, y)
    public void translate(int x, int y){
        this.x+=x;
        this.y+=y;
    }
    // Menghasilkan nomor kuadran dari titik sekarang
    // Sebuah titik yang berada pada sumbu x atau y tidak akan dicoba
    public int kuadran(){
        int hasil;
        
        if((x>0)&&(y>0)){
            hasil=1;
        }
        else if((x<0)&&(y>0)){
            hasil=2;
        }
        else if((x<0)&&(y<0)){
            hasil=3;
        }
        else if((x>0)&&(y<0)){
            hasil=4;
        }
        return hasil;
    }
    // Menghasilkan jarak antara titik sekarang dengan Point argumen
    public double distance(Point p){
        return (Math.sqrt(((this.x-p.x)*(this.x-p.x))+((this.y-p.y)*(this.y-p.y))));
    }
    // Menuliskan titik ke layar dengan format "(x,y)"
    public void print(){
        System.out.println("("+x+","+y+")");
    }
}
