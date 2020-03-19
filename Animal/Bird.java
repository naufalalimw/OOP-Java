public class Bird extends Animal {
    // Melakukan assign numberOfLegs = 2 dan posisi pada x = 0, y = 0
    public Bird(){
        super(2,0,0);
        // super.numberOfLegs = 2;
        // super.position = new Point(0,0);
    }

    // Melakukan assign numberOfLegs = 2 dan posisi pada x, y
    // Jika posisi tidak valid, nilai y posisi dipindahkan ke nilai y terdekat yang valid.
    public Bird(int x, int y){         
        super(2,x,y);

        if (y<0) {
            super.setPosition(x,0);
        }
    }

    // Mencetak suara burung, "tweet..tweet.."
    public void makeSound(){
        System.out.println("tweet..tweet..");
    }

    // Terbang sejauh nilai x dan y
    // Jika y tidak valid, nilai y dirubah ke nilai y terdekat yang valid.
    public void move(int x, int y){
        if ((this.position.getY()+y)<0) {
            super.setPosition(this.position.getX()+x, 0);
        } else{
            super.movePosition(x,y);
        }
    }

    // Melakukan pencetakan dengan format 
    // "Hewan ini berkaki 2 dan Hewan ini adalah burung"
    // "Posisi: x, y"
    public void print(){
        System.out.println("Hewan ini berkaki "+numberOfLegs+" dan Hewan ini adalah burung");
        System.out.println("Posisi: "+position.getX()+", "+position.getY());
    }
}

