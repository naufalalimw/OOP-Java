public class Shape {
  protected Point[] p;
  protected int size;

  // membuat sebuah shapes yang berisi n buah point (0,0)
  // prekondisi : n > 0
  public Shape(int n){
      Point[] po = new Point[n];
      for (int i = 0; i < po.length; i++) {
          po[i] = new Point();
      }
      this.size = n;
      this.p = po;
  }

  // mengeluarkan nilai point ke-n
  // prekondisi: n < size;
  public Point getPoint(int n){
      Point po = new Point(this.p[n].getAbsis(), this.p[n].getOrdinat());
      return po;
  }

  // set nilai point ke n dengan p2
  public void setPoint(int n, Point p2){
      p[n].setAbsis(p2.getAbsis());
      p[n].setOrdinat(p2.getOrdinat());
  }

  // set nilai point ke n dengan (x,y)
  public void setPoint(int n, int x, int y){
    p[n].setAbsis(x);
    p[n].setOrdinat(y);
  }

  // melakukan penggeseran bidang sebesar point p2
  public void translate(Point p2){
      for (int i = 0; i < p.length; i++) {
          p[i].translate(p2);
      }
  }

  // melakukan penggeseran bidang sebesar (x,y)
  public void translate(int x, int y){
      for (int i = 0; i < p.length; i++) {
          p[i].translate(x, y);
      }
  }

  // menghitung keliling bidang
  // jika p = [(3,0),(0,4),(0,0)], maka keliling bidang adalah
  // jarak (3,0) ke (0,4) + jarak (0,4) ke (0,0) + jarak (0,0) ke (3,0)
  // prekondisi : size > 1
  public double keliling(){
      return(this.p[0].distance(this.p[1])+this.p[1].distance(this.p[2])+this.p[0].distance(this.p[2]));
  }

  // melakukan pencetakan bidang.Jika p = [(3,0),(0,4),(0,0)] dan size = 3
  //maka yang akan dicetak adalah sbg berikut
  // (3,0)
  // (0,4)
  // (0,0)
  public void print(){
      for (int i = 0; i < p.length; i++) {
        System.out.println("(" + this.p[i].getAbsis() + "," + this.p[i].getOrdinat() + ")");
      }
  }
}