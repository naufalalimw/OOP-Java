//Naufal Alim Wahib
// 18218005

class User {
  private int balance;
  private Subscription subscription;
  private String username;

  public User(String username){
    balance = 0;
    subscription = new FreeSubscription();
    this.username = username;
  }
  public User(String username, int balance){
    this.balance = balance;
    subscription = new PremiumSubscription();
    this.username = username;

  }

  public String getUsername(){
    return username;
  }
  public Subscription getSubscription(){
    return subscription;
  }

  public void setSubscription(Subscription subscription){
    this.subscription = subscription;
  }


  public boolean watch(Movie movie){
    if (subscription.getType().equals("Premium")) {
			System.out.println("Selamat menonton");
			return true;
	  } else {
			if (movie.getType().equals("UltraHDMovie")) {
				System.out.println("Kamu perlu Premium Subscription untuk menonton ini");
				return false;
			} else {
				System.out.println("Selamat menonton");
				return true;
			}
	  }
  }


  public void addBalance(int balance){
    this.balance = this.balance + balance;
  }
  public int getBalance(){
    return balance;
  }


  public boolean bill(){
    if (balance >= subscription.getBillAmount()) {
		  balance -= subscription.getBillAmount();
		  return true;
	  } else {
		  return false;
	  }
  }
}
