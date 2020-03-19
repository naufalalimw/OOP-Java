public class Circle extends Shape {
  
    private int radius;
  
    // Point yang diisi adalah titik pusat dari lingkaran tersebut
    // Lingkaran hanya memiliki 1 point pusat
    public Circle(int r, Point p){
        this.radius = r;
        size = 1 ;
        this.p = new Point[1];
		this.p[0] = p; 
    }
  
    // Melakukan implementasi fungsi keliling
    // Keliling lingkaran = 2 * pi * radius. Gunakan pi = 3.14
    public double keliling(){
        return 2*3.14*this.radius;
    }
  
    // Mencetak lingkaran ke layar
    // Jika titik pusat lingkaran adalah (0,0) dan radius nya 5, maka hasilnya adalah sbg berikut
    // (0,0)
    // r = 5
    // lingkaran
    public void print(){
        System.out.println("(" + this.p[0].getAbsis() + "," + this.p[0].getOrdinat() + ")");
		System.out.println("r = " + radius);
		System.out.println("lingkaran");
    }
}

