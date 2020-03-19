public class PremiumSubscription implements Subscription {
	private String tipe;
	private int bill;

	public PremiumSubscription(){
		tipe = "Premium";
		bill = 169900;
	}
	public String getType(){
		return tipe;
	}
    public int getBillAmount(){
    	return bill;
    }
}