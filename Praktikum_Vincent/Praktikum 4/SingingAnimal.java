public class SingingAnimal{
	private int legs;
	private String name;
	private String voice;
	
	public SingingAnimal(int legs,String name, String voice){
		this.legs=legs;
		this.name=name;
		this.voice=voice;
	}
	
	public int getLegs(){
		return legs;
	}
	public String getName(){
		return name;
	}
	public String getVoice(){
		return voice;
	}
	public void setLegs(int legs){
		this.legs=legs;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setVoice(String voice){
		this.voice=voice;
	}
	public void sing(){
		System.out.println(this.voice);
	}
	public void dance(){
		System.out.println("I am dancing using my "+legs+" legs");
	}
}
