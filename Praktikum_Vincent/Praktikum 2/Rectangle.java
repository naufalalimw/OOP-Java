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
public class Rectangle extends Shape {
  
  // memanggil konstruktor Shape dengan nilai n = 4
  public Rectangle(){
      super(4);
  }

  // menghasilkan true jika segiempat yang dibentuk adalah bujur sangkar
  public boolean isBujurSangkar(){
      return (p[0].distance(p[1])==p[1].distance(p[2]))&&(p[1].distance(p[2])==p[2].distance(p[3]))&&(p[2].distance(p[3])==p[3].distance(p[0]));
  }

  // mencetak segiempat ke layar
  // jika koordinat segiempat adalah (3,0), (3,4), (0,4), dan (0,0), maka hasilnya adalah sebagai berikut
  // (3,0)
  // (3,4)
  // (0,4)
  // (0,0)
  // segiempat
  @Override
  public void print(){
      super.print();
      System.out.println("segiempat");
  }
}
