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
	  return ((this.p[0].distance(this.p[1])) + (this.p[1].distance(super.p[2])) + (this.p[2].distance(this.p[3])) + 
	  (this.p[3].distance(this.p[0])));
  }

  // Mencetak segiempat ke layar
  // Jika koordinat segitiga adalah (3,0), (0,4), (2,3), dan (0,0), maka hasilnya adalah sebagai berikut
  // (3,0)
  // (0,4)
  // (2,3)
  // (0,0)
  // segiempat
  public void print() {
	System.out.println("(" + super.p[0].getAbsis() + "," + super.p[0].getOrdinat() + ")");
	System.out.println("(" + super.p[1].getAbsis() + "," + super.p[1].getOrdinat() + ")");
	System.out.println("(" + super.p[2].getAbsis() + "," + super.p[2].getOrdinat() + ")");
	System.out.println("(" + super.p[3].getAbsis() + "," + super.p[3].getOrdinat() + ")");
	
	System.out.println("segiempat"); 
  }
}

