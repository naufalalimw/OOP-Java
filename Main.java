import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int tpusatx = inp.nextInt();
		int tpusaty = inp.nextInt();
		Point circlepnt = new Point(tpusatx, tpusaty); 
		
		int tsegitiga0x = inp.nextInt();
		int tsegitiga0y = inp.nextInt();
		Point tripnt0 = new Point(tsegitiga0x, tsegitiga0y); 
		
		int tsegitiga1x = inp.nextInt();
		int tsegitiga1y = inp.nextInt();
		Point tripnt1 = new Point(tsegitiga1x, tsegitiga1y); 
		
		int tsegitiga2x = inp.nextInt();
		int tsegitiga2y = inp.nextInt();
		Point tripnt2 = new Point(tsegitiga2x, tsegitiga2y); 
		
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
		
		
		Circle c = new Circle(5, circlepnt);
		c.print();
		
		Point[] triarr = {tripnt0, tripnt1, tripnt2};
		
		Triangle t = new Triangle(triarr);
		t.print();
		
		Point[] recarr = {recpnt0, recpnt1, recpnt2, recpnt3};
		Rectangle r = new Rectangle(recarr);
		r.print();
		
		Shape shape = t;
		
		shape.print();
		
		if (t.isSamaSisi()) {
			t.print();
			System.out.println("segitiga merupakan segitiga sama sisi");
		} else {
			System.out.println("segitiga tidak sama sisi");
		}
		
		if (t.isSamaKaki()) {
			t.print();
			System.out.println("segitiga merupakan segitiga sama kaki");
		} else {
			System.out.println("segitiga tidak sama kaki");
		}
		
		System.out.println("keliling lingkaran: " + c.keliling());
		System.out.println("keliling segitiga: " + t.keliling());
		
		System.out.println("keliling segi empat: " + r.keliling());
		
		int tx = inp.nextInt();
		int ty = inp.nextInt();
		Point point = new Point(tx, ty); 
		
		Shape shape2 = r;
		
		shape2.translate(point);
		
		shape2.print();
	}
}
