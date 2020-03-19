import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int pusling1 = input.nextInt();int pusling2 = input.nextInt();
		int t11 = input.nextInt();int t12 = input.nextInt();
		int t21 = input.nextInt();int t22 = input.nextInt();
		int t31 = input.nextInt();int t32 = input.nextInt();
		int r11 = input.nextInt();int r12 = input.nextInt();
		int r21 = input.nextInt();int r22 = input.nextInt();
		int r31 = input.nextInt();int r32 = input.nextInt();
		int r41 = input.nextInt();int r42 = input.nextInt();

		Point pusling = new Point(pusling1,pusling2);
		Point t1 = new Point(t11,t12);
		Point t2 = new Point(t21,t22);
		Point t3 = new Point(t31,t32);

		Point r1 = new Point(r11,r12);
		Point r2 = new Point(r21,r22);
		Point r3 = new Point(r31,r32);
		Point r4 = new Point(r41,r42);


		Point[] segitiga = {t1,t2,t3};
		Point[] segiempat = {r1,r2,r3,r4};

		Circle c = new Circle(5,pusling);
		Triangle t = new Triangle(segitiga);
		Rectangle r = new Rectangle(segiempat);

		c.print();
		t.print();
		r.print();

		Shape s = t;
		// s.print();
		// if (s.isSamaSisi()) {
		// 	System.out.println("segitiga merupakan segitiga sama sisi");
		// }else{
		// 	System.out.println("segitiga tidak sama sisi");
		// }
		
		// if (s.isSamaKaki()) {
		// 	System.out.println("segitiga merupakan segitiga sama kaki");
		// }else{
		// 	System.out.println("segitiga tidak sama kaki");
		// }
		


		
	}
}
