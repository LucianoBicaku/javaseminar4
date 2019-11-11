import java.util.Scanner;


public class ushtrimi8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in .next();
        int gjatStr = str.length();

        for(int j=1; j< gjatStr;j++){
            for (int i = 0; i < gjatStr; i ++) {
                if(i+j==gjatStr){
                    break;
                }
                System.out.println(str.substring(i, i+j));
            }
        }
        System.out.println(str);


        in .close();
    }
}