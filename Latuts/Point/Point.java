public class Point {
    private int x, y; // absis dan ordinat

    // Constructor
    // Set titik mula-mula ke (0, 0)
    public Point(){
        x = 0; y= 0;
    }

    // Set titik mula-mula ke (x, y)
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Getter
    public int getAbsis(){
        return x;
    }
    public int getOrdinat(){
        return y;
    }

    // Setter
    public void setAbsis(int x){
        this.x = x;
    }
    public void setOrdinat(int y){
        this.y = y;
    }

    // Menghasilkan true jika titik (x, y) berada di (0, 0)
    public boolean isOrigin(){
        return ((x==0)&&(y==0));
    }

    // Menghasilkan true jika titik pada argumen sama dengan dirinya
    public boolean isEqual(Point p){
        return((x==p.getAbsis())&&(y== p.getOrdinat()));
    }

    // Mengubah titik dengan penambahan Point argumen
    public void translate(Point p){
        x = x+p.getAbsis();
        y = y+p.getOrdinat();
    }

    // Mentranslasikan titik sebesar (x, y)
    public void translate(int x, int y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

    // Menghasilkan nomor kuadran dari titik sekarang
    // Sebuah titik yang berada pada sumbu x atau y tidak akan dicoba
    public int kuadran(){
        if ((x>0)&&(y>0)) {
            return 1;
        } else if ((x>0)&&(y<0)) {
            return 4;
        }else if ((x<0)&&(y>0)) {
            return 2;
        }else if ((x>0)&&(y<0)) {
            return 3;
        }else{
            return -1;
        }
    }
        

    // Menghasilkan jarak antara titik sekarang dengan Point argumen
    public double distance(Point p){
        return Math.sqrt((this.x - p.getAbsis()) * (this.x - p.getAbsis()) + (this.y - p.getOrdinat()) * (this.y - p.getOrdinat()));
    }

    // Menuliskan titik ke layar dengan format "(x,y)"
    public void print(){
        System.out.println("("+x+","+y+")");
    }
}