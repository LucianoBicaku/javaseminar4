import java.util.Scanner;


public class ushtrimi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in .next();
        int srtLength = str.length();
        int arr[], arr2[];
        //pika a
        arr = new int[srtLength];
        arr2 = new int[srtLength];

        for (int i = 0; i < srtLength; i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        arr2[0] = arr[0];
        for (int i = 1; i < srtLength; i++) {
            arr2[i] = arr2[i - 1] + arr[i];
        }
        for (int i = 0; i < srtLength; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        //pika b
        for (int i = 0; i < srtLength; i++) {
            Boolean ndodhet = false; 
            for (int j = i+1; j < srtLength; j++) {
                if(arr[i]==arr[j]){
                    ndodhet=true;
                    break;
                }
            }
            if(ndodhet){
                System.out.print(arr[i]+" ");
            }
        } 
        in .close();
    }
}