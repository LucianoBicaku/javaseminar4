import java.util.Scanner;

public class ushtrimi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //pika a
        int a = in .nextInt();
        int b = in .nextInt();
        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }
        System.out.println(a + " " + b);
        int sum = 0;
        for (int i = 0; i < b; i++) {
            if (i%2==0 && i > a && i < b){
                sum+=i;
            }
        }
        System.out.println("Shume e nr cift: "+ sum);

        //pika b
        int num;
        sum=0;
        while(in.hasNextInt()){
            num = in.nextInt();
            if(num%2==1){
                sum+=num;
            }
        }
        System.out.println("Shume e nr tek: "+ sum);
        in .close();
    }
}
