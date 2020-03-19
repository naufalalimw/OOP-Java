public class Triangle extends Shape {
  
    // Memiliki 3 point
    // Pre-kondisi semua point tidak berada pada titik yang sama dan tidak segaris
    public Triangle(Point[] p){
		size = 3;
		this.p = p;
	}
  
    // Menghasilkan true jika segitiga yang dibentuk adalah segitiga sama sisi
    public boolean isSamaSisi(){
		return (
			( ( this.p[0].distance(this.p[1]) ) == ( this.p[1].distance(this.p[2]) ) ) &&
			( ( this.p[1].distance(this.p[2]) ) == ( this.p[2].distance(this.p[0]) ) ) &&
			( ( this.p[2].distance(this.p[0]) ) == ( this.p[0].distance(this.p[1]) ) )
		);
	}

    // Menghasilkan true jika segitiga yang dibentuk adalah segitiga sama kaki
    public boolean isSamaKaki(){
		if (!(isSamaSisi())) {
			return (
				( ( this.p[0].distance(this.p[1]) ) == ( this.p[1].distance(this.p[2]) ) ) ||
				( ( this.p[1].distance(this.p[2]) ) == ( this.p[2].distance(this.p[0]) ) ) ||
				( ( this.p[2].distance(this.p[0]) ) == ( this.p[0].distance(this.p[1]) ) )
			);
		} else {
			return false;
		}
		
	}

    // Melakukan implementasi fungsi keliling
    public double keliling(){
		return ((this.p[0].distance(this.p[1])) + (this.p[1].distance(this.p[2])) + (this.p[2].distance(this.p[0])));
	}
  
    // Mencetak segitiga ke layar
    // Jika koordinat segitiga adalah (3,0), (0,4), dan (0,0), maka hasilnya adalah sebagai berikut
    // (3,0)
    // (0,4)
    // (0,0)
    // segitiga
    public void print(){
		System.out.println("(" + this.p[0].getAbsis() + "," + this.p[0].getOrdinat() + ")");
		System.out.println("(" + this.p[1].getAbsis() + "," + this.p[1].getOrdinat() + ")");
		System.out.println("(" + this.p[2].getAbsis() + "," + this.p[2].getOrdinat() + ")");
		System.out.println("segitiga");
	}
}

