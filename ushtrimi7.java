
import java.util.Scanner;


public class ushtrimi7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next(); 
  
        StringBuilder input1 = new StringBuilder(); 
        input1.append(input); 

        String reverString = input1.reverse().toString();
        if(input.compareTo(reverString)==0){
            System.out.println("Eshte polidrom.");
        }
        else System.out.println("S'eshte polidrom.");
        in.close();
    }
}

