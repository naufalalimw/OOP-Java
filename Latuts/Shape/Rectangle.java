public class Rectangle extends Shape {
  
    // memanggil konstruktor Shape dengan nilai n = 3
    public Rectangle(){
        super(4);
    }
  
    // menghasilkan true jika segitiga yang dibentuk adalah segitiga sama sisi
    public double keliling(){
        return(p[0].distance(p[1]) + p[0].distance(p[2]) + p[2].distance(p[3]) + p[3].distance(p[1]));
    }
  
    public boolean isBujurSangkar(){
        return((p[0].distance(p[1]) == p[1].distance(p[2])) &&
        (p[2].distance(p[3]) == p[3].distance(p[0])) &&
        (p[0].distance(p[1]) == p[2].distance(p[3])));
    }
    // mencetak segitiga ke layar
    // jika koordinat segitiga adalah (3,0), (0,4), dan (0,0), maka hasilnya adalah sebagai berikut
    // (3,0)
    // (0,4)
    // (0,0)
    // segitiga
    public void print(){
        super.print();
        System.out.println("segiempat");
    }
  }