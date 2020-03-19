import java.util.Scanner;  // Import the Scanner class

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer x1,x2,y1,y2;
        x1 = input.nextInt(); y1= input.nextInt();
        x2 = input.nextInt(); y2 = input.nextInt();

        Point p1,p2;
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        p1.print();
        p2.print();
        if (p1.isOrigin()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if (p1.isEqual(p2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        

        if (p1.isOrigin()) {
            System.out.println(-1);
        }else{
            System.out.println(p1.kuadran());
        }

        Point p0 = new Point();
        Double a;
        a = p1.distance(p0);
        System.out.println(a);

        p1.translate(p2);
        p1.print();

        Integer xt,yt;
        xt = input.nextInt();
        yt = input.nextInt();

        p1.translate(xt,yt);
        p1.print();

    }
}