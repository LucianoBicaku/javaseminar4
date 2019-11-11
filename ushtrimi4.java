import java.util.Scanner;


public class ushtrimi4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double num,shuma=0;
        int counter =0;
        while(in.hasNextDouble()){
            num = in.nextDouble();
            counter++;
            shuma += num;
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }

        System.out.println("mesatarja: "+ (shuma/counter));
        System.out.println("vlera me e madhe: "+ max);
        System.out.println("Vlera me e vogel: "+ min);

        in.close();
    }
}