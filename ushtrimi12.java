import java.util.Scanner;


public class ushtrimi12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in .nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = num - i; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for(int j=i;j>=0;j--){
                System.out.print(" ");
            }
            for (int j = (num - i) * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        } in .close();
    }
}