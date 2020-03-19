public class Circle extends Shape {
  
  private int radius;

  // memanggil konstruktor Shape dengan nilai n = 1, lalu mengisi nilai radius
  // point yang diisi adalah titik pusat dari lingkaran tersebut
  public Circle(int r){
      super(1);
      this.radius = r;
  }

  // melakukan override fungsi keliling
  // keliling lingkaran = 2 * pi * radius. Gunakan pi = 3.14
  public double keliling(){
      return (2*3.14*this.radius);
  }

  // mencetak lingkaran ke layar
  // jika titik pusat lingkaran adalah (0,0) dan radiusnya 5, maka hasilnya adalah sbg berikut
  // (0,0)
  // r = 5
  // lingkaran
  public void print(){
      super.print();
      System.out.println("r = "+ this.radius);
      System.out.println("lingkaran");
  }
}