import java.util.Scanner;


public class ushtrimi3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in .next();
        //pika a
        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            if (Character.isUpperCase(elem)) {
                System.out.print(elem);
            }
        }
        System.out.println();
        //pika b
        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            if (elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u' || elem == 'y') {
                elem = '_';
            }
            System.out.print(elem);
        }
        System.out.println();
        //pika c
        int sanr = 0;
        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            if (Character.isDigit(elem)) {
                sanr++;
            }
        }
        System.out.println(sanr); in .close();
    }
}