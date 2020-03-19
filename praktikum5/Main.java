import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListMap<String,String> maplist = new ListMap();
        String key,value;
        int ulang = input.nextInt();
        for (int i = 0; i < ulang; i++) {
            key = input.next();
            value = input.next();
            maplist.add(key,value);
        }

        String kunci = input.next();
        System.out.println(maplist.get(kunci));
    }
}