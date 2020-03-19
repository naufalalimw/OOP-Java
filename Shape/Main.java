import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		//~ Membaca sebuah titik untuk lingkaran
		int tpusatx = inp.nextInt();
		int tpusaty = inp.nextInt();
		Point circlepnt = new Point(tpusatx, tpusaty); 
		
		//~ Membaca 3 buah titik untuk segitiga
		int tsegitiga0x = inp.nextInt();
		int tsegitiga0y = inp.nextInt();
		Point tripnt0 = new Point(tsegitiga0x, tsegitiga0y); 
		
		int tsegitiga1x = inp.nextInt();
		int tsegitiga1y = inp.nextInt();
		Point tripnt1 = new Point(tsegitiga1x, tsegitiga1y); 
		
		int tsegitiga2x = inp.nextInt();
		int tsegitiga2y = inp.nextInt();
		Point tripnt2 = new Point(tsegitiga2x, tsegitiga2y); 
		
		//~ Membaca 4 buah titik untuk segiempat
		int tsegiempat0x = inp.nextInt();
		int tsegiempat0y = inp.nextInt();
		Point recpnt0 = new Point(tsegiempat0x, tsegiempat0y); 
		
		int tsegiempat1x = inp.nextInt();
		int tsegiempat1y = inp.nextInt();
		Point recpnt1 = new Point(tsegiempat1x, tsegiempat1y); 
		
		int tsegiempat2x = inp.nextInt();
		int tsegiempat2y = inp.nextInt();
		Point recpnt2 = new Point(tsegiempat2x, tsegiempat2y); 
		
		int tsegiempat3x = inp.nextInt();
		int tsegiempat3y = inp.nextInt();
		Point recpnt3 = new Point(tsegiempat3x, tsegiempat3y); 
		
		
		//~ Mencetak info dari lingkaran (dengan radius 5), segitiga, dan segiempat
		Circle c = new Circle(5, circlepnt);
		c.print();
		
		Point[] triarr = {tripnt0, tripnt1, tripnt2};
		
		Triangle t = new Triangle(triarr);
		t.print();
		
		Point[] recarr = {recpnt0, recpnt1, recpnt2, recpnt3};
		Rectangle r = new Rectangle(recarr);
		r.print();
		
		//~ Deklarasi sebuah variabel “shape” dengan tipe Shape lalu assign objek segitiga yang sudah dibuat ke variabel ini
		Shape shape = c;
		
		//~ Cetak informasi variabel shape *perhatikan outputnya
		shape.print();
		
		//~ Melakukan pengecekan apakah segitiga tersebut sama sisi, apabila benar, 
		//~ mencetak informasi segitiga dan “segitiga merupakan segitiga sama sisi”, apabila bukan, akan mencetak tulisan “segitiga tidak sama sisi” 
		if (t.isSamaSisi()) {
			t.print();
			System.out.println("segitiga merupakan segitiga sama sisi");
		} else {
			System.out.println("segitiga tidak sama sisi");
		}
		
		//~ Melakukan pengecekan apakah segitiga tersebut sama kaki, apabila benar, 
		//~ mencetak informasi segitiga dan “segitiga merupakan segitiga sama sisi”, apabila bukan, akan mencetak tulisan “segitiga tidak sama kaki” 
		if (t.isSamaKaki()) {
			t.print();
			System.out.println("segitiga merupakan segitiga sama kaki");
		} else {
			System.out.println("segitiga tidak sama kaki");
		}
		
		//~ Menghitung luas lingkaran, dengan output : “keliling lingkaran: ()“ Menghitung luas segitiga, dengan output : “keliling segitiga: ()“ 
		System.out.println("keliling lingkaran: " + c.keliling());
		System.out.println("keliling segitiga: " + t.keliling());
		
		//~ Menghitung luas segiempat, dengan output : “keliling segi empat: ()“ 
		System.out.println("keliling segi empat: " + r.keliling());
		
		//~ Membaca sebuah titik baru
		int tx = inp.nextInt();
		int ty = inp.nextInt();
		Point point = new Point(tx, ty); 
		
		//~ shape2 refer ke objek segiempat yang di atas 
		Shape shape2 = r;
		
		//~ Melakukan pergeseran segiempat dengan titik baru.
		 shape2.translate(point);
		
		//~ Cetak informasi variabel shape *perhatikan outputnya
		shape2.print();
	}
}
