public class SingingChicken extends SingingAnimal{
		
	public SingingChicken(String name,String voice){
		super(2,name,voice);
	}
	public void sing(){
		System.out.println("Cock-a-doodle-doo");
	}
	public void dance(){
		super.dance();
		System.out.println("I am also flying");
	}
}
	
