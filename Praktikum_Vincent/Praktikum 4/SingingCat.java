public class SingingCat extends SingingAnimal{
	private String breed;
	
	public SingingCat(String name,String voice){
		super(4,name,voice);
		this.breed="normal";
	}
	public SingingCat(String name, String voice, String breed){
		super(4,name,voice);
		this.breed=breed;
	}
	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed){
		this.breed=breed;
	}
	public void sing(){
		System.out.println("Meow");
		System.out.println(super.getVoice());
	}
	public void introduce(){
		System.out.println("My name is "+super.getName());
		System.out.println("My breed is "+this.breed);
	}
}
