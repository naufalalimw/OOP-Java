import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int i;
        Map<String,String> map = new ListMap<String,String>();
        for(i= 0;i<n;i++){
            map.add(obj.next(), obj.next());
        }
        System.out.println(map.get(obj.next()));
    }
}