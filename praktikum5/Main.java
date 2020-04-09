import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ulang = input.nextInt();
        
        ListMap<String,String> maplist = new ListMap<String,String>();

        for (int i = 0; i < ulang; i++) {
            maplist.add(input.next(),input.next());
        }
        System.out.println(maplist.get(input.next()));
    }
}