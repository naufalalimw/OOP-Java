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
public class Circle extends Shape {
  
  private int radius;

  // memanggil konstruktor Shape dengan nilai n = 1, lalu mengisi nilai radius
  // point yang diisi adalah titik pusat dari lingkaran tersebut
  public Circle(int r){
      super(1);
      this.radius=r;
  }

  // melakukan override fungsi keliling
  // keliling lingkaran = 2 * pi * radius. Gunakan pi = 3.14
  @Override
  public double keliling(){
      return Math.PI*2*radius;
  }

  // mencetak lingkaran ke layar
  // jika titik pusat lingkaran adalah (0,0) dan radiusnya 5, maka hasilnya adalah sbg berikut
  // (0,0)
  // r = 5
  // lingkaran
  @Override
  public void print(){
      super.print();
      System.out.println("r = "+radius);
      System.out.println("lingkaran");
  }
}
