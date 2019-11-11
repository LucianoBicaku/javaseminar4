import java.util.Scanner;


public class ushtrimi6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num, shuma=0;
        int counter =0;
        while(in.hasNextFloat()){
            num=in.nextFloat();
            shuma += num;
            counter++;
        }
        System.out.println("Mesatarja : "+ shuma/counter);
        float shumakat = (float)Math.pow(shuma,2);
        float devijimi = (float) Math.sqrt((shumakat - shumakat/counter)/(counter-1));
        System.out.println("Devijimi Standart: "+devijimi);
        in.close();
    }
}