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
			( ( p[0].distance(p[1]) ) == ( p[1].distance(p[2]) ) ) &&
			( ( p[1].distance(p[2]) ) == ( p[2].distance(p[0]) ) )
		);
	}

    // Menghasilkan true jika segitiga yang dibentuk adalah segitiga sama kaki
    public boolean isSamaKaki(){
		if (!(isSamaSisi())) {
			return (
				( ( p[0].distance(p[1]) ) == ( p[1].distance(p[2]) ) ) ||
				( ( p[1].distance(p[2]) ) == ( p[2].distance(p[0]) ) ) ||
				( ( p[2].distance(p[0]) ) == ( p[0].distance(p[1]) ) )
			);
		} else {
			return false;
		}
		
	}

    // Melakukan implementasi fungsi keliling
    public double keliling(){
		return ((p[0].distance(p[1])) + (p[1].distance(p[2])) + (p[2].distance(p[0])));
	}
  
    // Mencetak segitiga ke layar
    // Jika koordinat segitiga adalah (3,0), (0,4), dan (0,0), maka hasilnya adalah sebagai berikut
    // (3,0)
    // (0,4)
    // (0,0)
    // segitiga
    public void print(){
		System.out.println("(" + p[0].getAbsis() + "," + p[0].getOrdinat() + ")");
		System.out.println("(" + p[1].getAbsis() + "," + p[1].getOrdinat() + ")");
		System.out.println("(" + p[2].getAbsis() + "," + p[2].getOrdinat() + ")");
		System.out.println("segitiga");
	}
}

