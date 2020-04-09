/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Vincent
 * NIM 18217042
 * Topik: Inheritance
 */
public class Shape {
  protected Point[] p;
  protected int size;

  // membuat sebuah shapes yang berisi n buah point (0,0)
  // prekondisi : n > 0
  public Shape(int n){
      this.p=new Point[n];
      for(int i=0;i<n;i++){
          this.p[i]= new Point();
      }
      size=n;
  }

  // mengeluarkan nilai point ke-n
  // prekondisi: n < size;
  public Point getPoint(int n){
      return p[n];
  }

  // set nilai point ke n dengan p2
  public void setPoint(int n, Point p2){
      p[n]=p2;
  }

  // set nilai point ke n dengan (x,y)
  public void setPoint(int n, int x, int y){
      p[n].setAbsis(x);
      p[n].setOrdinat(y);
  }

  // melakukan penggeseran bidang sebesar point p2
  public void translate(Point p2){
      for(int i=0;i<size;i++){
          p[i].translate(p2);
      }
  }

  // melakukan penggeseran bidang sebesar (x,y)
  public void translate(int x, int y){
      for(int i=0;i<size;i++){
          p[i].translate(x, y);
      }
  }

  // menghitung keliling bidang
  // jika p = [(3,0),(0,4),(0,0)], maka keliling bidang adalah
  // jarak (3,0) ke (0,4) + jarak (0,4) ke (0,0) + jarak (0,0) ke (3,0)
  // prekondisi : size > 1
  public double keliling(){
      double total=0;
      for(int i=0;i<size-1;i++){
          total+=p[i].distance(p[i+1]);
      }
      return total;
  }

  // melakukan pencetakan bidang.Jika p = [(3,0),(0,4),(0,0)] dan size = 3
  //maka yang akan dicetak adalah sbg berikut
  // (3,0)
  // (0,4)
  // (0,0)
  public void print(){
      for(int i=0;i<size;i++){
          p[i].print();
      }
  }
}