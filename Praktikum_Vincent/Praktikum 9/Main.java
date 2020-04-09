
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/**
 *
 * @author labdas
 */

public class Main
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        // Menginstansiasi kelas 'Printer'
        Printer obj = new Printer();
        Class cls = obj.getClass();
        ArrayList<String> l1=new ArrayList<>();
        ArrayList<String> l2=new ArrayList<>();
        ArrayList<String> l3=new ArrayList<>();
        
        switch (opt){
            case 0:{ // Mem-print interface yang terdapat pada kelas Printer (terurut menurut abjad)
                System.out.println("The public interfaces of the class are :");
                for(Class p:cls.getInterfaces()){
                    l1.add(p.getSimpleName());
                }
                Collections.sort(l1);
                for(String a:l1){
                    System.out.println(a);
                }
                break;
            }
            case 1:{// Mem-print metode yang terdapat pada kelas Printer (terurut menurut abjad)
                System.out.println("The public methods of the class are :");
                for(Method p:cls.getMethods()){
                    l2.add(p.getName());
                }
                Collections.sort(l2);
                for(String a:l2){
                    System.out.println(a);
                }
                break;
            }
            case 2 : {// Mengubah nilai s (menjadi variabel 'a')
                sc.nextLine();
                String a = sc.nextLine();
                Field f1=cls.getDeclaredField("s");
                f1.setAccessible(true);
                f1.set(obj, a);
            }
            case 3: { // Memanggil metode 'printVar'
                obj.printVar();
                break;
            }
            case 4:{// Memanggil metode 'printInt' (nilai yang di-pass adalah variabel 'b')
                int b = sc.nextInt();
                obj.printInt(b);
                break;
            }
            default:{ // Keluar tanpa melakukan apapun
                break;
            }
        }
    }
}
