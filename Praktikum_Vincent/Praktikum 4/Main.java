import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String command;
		String type;
		String name,voice,breed;
		int legs,idx;
		
		List<SingingAnimal> animals = new ArrayList<SingingAnimal>(); 
		
		command=input.next();
		while(!command.equals("End")){
			if(command.equals("Add")){
				type=input.next();
				if(type.equals("NormalCat")){
					name=input.next();
					voice=input.next();
					animals.add(new SingingCat(name,voice));
				}
				else if(type.equals("Cat")){
					name=input.next();
					voice=input.next();
					breed=input.next();
					animals.add(new SingingCat(name,voice,breed));
				}
				else if(type.equals("Chicken")){
					name=input.next();
					voice=input.next();
					animals.add(new SingingChicken(name,voice));
				}
				else if(type.equals("Other")){
					legs=input.nextInt();
					name=input.next();
					voice=input.next();
					animals.add(new SingingAnimal(legs,name,voice));
				}
			}
			if(command.equals("Del")){
				idx=input.nextInt();
				if(idx<animals.size()){
					animals.remove(idx);
				}
				else{
					System.out.println("Invalid index");
				}
			}
			if(command.equals("Sing")){
				for(int i=0;i<animals.size();i++){
					animals.get(i).sing();
				}
			}
			if(command.equals("Dance")){
				for(int i=0;i<animals.size();i++){
					animals.get(i).dance();
				}
			}
			command=input.next();
		}
	}
}
