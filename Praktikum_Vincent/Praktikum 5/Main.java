import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String user;
		String type;
		String command=input.next();
		List<User> userList= new ArrayList<User>();
		while(!command.equals("End")){
			if(command.equals("Add")){
				type=input.next();
				user=input.next();
				if(type.equals("RegularUser")){
					
					userList.add(new RegularUser(user));
				}
				else if(type.equals("PremiumUser")){
					userList.add(new PremiumUser(user));
				}
			}
			else if(command.equals("PrintAll")){
				for(int i=0;i<userList.size();i++){
					userList.get(i).print();
				}
			}
			else if(command.equals("Print")){
				user=input.next();
				for(int i=0;i<userList.size();i++){
					if(userList.get(i).getName().contains(user)){
						userList.get(i).print();
					}	
				}
			}
			else if(command.equals("CalculateAll")){
				int hasil=0;
				for(int i=0;i<userList.size();i++){
					hasil+=userList.get(i).getPrice();
				}
				System.out.println(hasil);
			}
			else if(command.equals("Calculate")){
				int hasil=0;
				user=input.next();
				for(int i=0;i<userList.size();i++){
					if(userList.get(i).getName().contains(user)){
						hasil = hasil+userList.get(i).getPrice();
					}	
				}
				System.out.println(hasil);
			}
			else{
				String command2=input.next();
				if(command2.equals("listen")){
					String song=input.next();
					for(int i=0;i<userList.size();i++){
						if(userList.get(i).getName().contains(command)){
							userList.get(i).listen(song);
						}	
					}
				}
				else if(command2.equals("download")){
					String song=input.next();
					for(int i=0;i<userList.size();i++){
						if(userList.get(i).getName().contains(command)){
							userList.get(i).download(song);
						}	
					}
				}
			}
			command=input.next();
		}
	}
}
