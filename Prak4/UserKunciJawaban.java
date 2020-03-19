class UserKunciJawaban {
    private int balance;
    private Subscription subscription;
    private String username;
  
    public User(String username) {
        this.username = username;
        subscription = new FreeSubscription();
        balance = 0;   
    }

    public User(String username, int balance) {
        this.username = username;
        subscription = new FreeSubscription();
        this.balance = balance; 
    }

    public Subscription getSubscription(){
        return this.subscription;
    }
  
    public String getUsername() {
        return username;
    }
  
    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    // Mengeluarkan true jika User dapat menonton movie
    // Menuliskan "Kamu perlu Premium Subscription untuk menonton ini" jika 
    // User tidak memiliki tipe Subscription yang tepat
    public boolean watch(Movie movie) {
        if (movie.getType().equals("HD Movie")) {
            System.out.println("Selamat menonton");
            return true;
        }else if ((movie.getType().equals("Ultra HD Movie")) && subscription.getType().equals("Premium")) {
            System.out.println("Selamat menonton");
            return true;
        } else {
            System.out.println("Kamu perlu Premium Subscription untuk menonton ini");
            return false;
        }
    }
  
    // Menambahkan balance user
    public void addBalance(int balance) {
        this.balance += balance;
    }

    public int getBalance() {
        return balance;
    }
  
    // Mengurangi balance user sesuai dengan tipe subscription
    // Mengeluarkan false jika user tidak memiliki balance cukup
    public boolean bill() {
        if (subscription.getType().equals("Free")) {
            return true;
        } else {
            if (balance > 169900) {
                balance -= 169900;
                return true;
            } else {
                return false;
            }
        }
    }
  }
  
