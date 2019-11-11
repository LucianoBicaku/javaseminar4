import java.util.Scanner;


public class ushtrimi5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            if (elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u' || elem == 'y') {
                counter++;
            }
        }
        System.out.println("Nr i zanoreve: "+ counter);

        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            System.out.println(elem);
        }
        in.close();
    }
}