/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author labdas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        String fuel;
        int amount,gear,acPower;
        String command;
        Scanner input=new Scanner(System.in);
        
        fuel=input.next();
        Car car=new Car(fuel);
        
        command=input.next();
        try{
            while((!command.equals("Selesai"))&&(!command.equals("End"))){
                switch(command){
                    case "Fill":
                        fuel=input.next();
                        amount=input.nextInt();
                        try{
                            car.fillingFuel(fuel,amount);
                        }catch(FuelException f){
                            System.out.println("[FuelException] "+f.getMessage());
                        }
                        finally{
                            break;
                        }
                    case "ChangeGear":
                        gear=input.nextInt();
                        try{
                            car.changeGear(gear);
                        }catch(InvalidInputCarException f){
                            System.out.println("[InvalidInputCarException] "+f.getMessage());
                        }
                        finally{
                            break;
                        }
                    case "ChangeAcPower":
                        acPower=input.nextInt();
                        try{
                            car.changeAcPower(acPower);
                        }catch(InvalidInputCarException f){
                            System.out.println("[InvalidInputCarException] "+f.getMessage());
                        }
                        finally{
                            break;
                        }
                    case "Start":
                        try{
                            car.start();
                        }catch(TheCarIsOnException f){
                            System.out.println("[TheCarIsOnException] "+f.getMessage());
                        }
                        finally{
                            break;
                        }
                    case "Service":
                        fuel=input.next();
                        amount=input.nextInt();
                        gear=input.nextInt();
                        acPower=input.nextInt();
                        car.service(fuel, amount, gear, acPower);
                        break;
                    default:
                        throw new Exception("Masukan tidak valid");
                }
                command=input.next();
            }
        }
        finally{
            System.out.println("Program selesai");
            if(command.equals("End")){
                System.out.println("Tidak ada unhandled exception");
            }
        }
    }
    
}
