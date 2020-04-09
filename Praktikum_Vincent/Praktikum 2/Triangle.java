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
public class Triangle extends Shape {
  
  // memanggil konstruktor Shape dengan nilai n = 3
  public Triangle(){
      super(3);
  }

  // menghasilkan true jika segitiga yang dibentuk adalah segitiga sama sisi
  public boolean isSamaSisi(){
      return (p[0].distance(p[1])==p[1].distance(p[2]))&&(p[1].distance(p[2])==p[2].distance(p[0]));
  }

  // mencetak segitiga ke layar
  // jika koordinat segitiga adalah (3,0), (0,4), dan (0,0), maka hasilnya adalah sebagai berikut
  // (3,0)
  // (0,4)
  // (0,0)
  // segitiga
  @Override
  public void print(){
      super.print();
      System.out.println("segitiga");
  }
}
