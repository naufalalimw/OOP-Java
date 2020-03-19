public class Rectangle extends Shape {
  
  // Memiliki 4 point
  // Pre-kondisi semua point tidak berda pada titik yang sama dan tidak segaris
  public Rectangle(Point[] p){
    size = 4;
    this.p = p;
  }

  // Melakukan implementasi fungsi keliling
  // Keliling lingkaran = 2 * pi * radius. Gunakan pi = 3.14
  public double keliling(){
	  return (p[0].distance(p[1]) + p[0].distance(p[2]) + p[2].distance(p[3]) + p[3].distance(p[1]));
  }

  // Mencetak segiempat ke layar
  // Jika koordinat segitiga adalah (3,0), (0,4), (2,3), dan (0,0), maka hasilnya adalah sebagai berikut
  // (3,0)
  // (0,4)
  // (2,3)
  // (0,0)
  // segiempat
  public void print() {
    System.out.println("(" + p[0].getAbsis() + "," + p[0].getOrdinat() + ")");
    System.out.println("(" + p[1].getAbsis() + "," + p[1].getOrdinat() + ")");
    System.out.println("(" + p[2].getAbsis() + "," + p[2].getOrdinat() + ")");
    System.out.println("(" + p[3].getAbsis() + "," + p[3].getOrdinat() + ")");
    
    System.out.println("segiempat"); 
  }
}

