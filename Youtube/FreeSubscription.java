public class FreeSubscription implements Subscription {
	private String tipe;
	private int bill;

	public FreeSubscription(){
		tipe = "Free";
		bill = 0;
	}
	public String getType(){
		return tipe;
	}
    public int getBillAmount(){
    	return bill;
    }
}