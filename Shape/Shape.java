public abstract class Shape {
    protected Point[] p;
    protected int size;
  
    // Mengeluarkan nilai point ke-n
    // Pre kondisi: n < size;
    public Point getPoint(int n){
        Point p0 = new Point(p[n].getAbsis(), p[n].getOrdinat()); 
        return p0;
    }
  
    // Set nilai point ke n dengan p2
    public void setPoint(int n, Point p2){
        p[n].setAbsis(p2.getAbsis());
		p[n].setOrdinat(p2.getOrdinat());
    }
  
    // Set nilai point ke n dengan (x,y)
    public void setPoint(int n, int x, int y){
        p[n].setAbsis(x);
		p[n].setOrdinat(y);
    }
  
    // Melakukan pergeseran bidang sebesar point p2
    public void translate(Point p2){
        for (int n=0; n<= size; n++) {
			p[n].setAbsis(p[n].getAbsis() + p2.getAbsis());
			p[n].setOrdinat(p[n].getOrdinat() + p2.getOrdinat());
		}

    }
  
    // Melakukan pergeseran bidang sebesar (x,y)
    public void translate(int x, int y){
        for (int n=0; n<= size; n++) {
			p[n].setAbsis(p[n].getAbsis() + x);
			p[n].setOrdinat(p[n].getOrdinat() + y);
		}
    }
  
    // Menghitung keliling bidang
    public abstract double keliling();
  
    // melakukan pencetakan bidang.
    public abstract void print();

}