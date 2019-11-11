import java.util.Scanner;


public class ushtrimi11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=1;i<=n;i++){
            boolean prim=true;
            for(int j = 2; j <= i/2 ; j++){
                if(i % j == 0){
                    prim = false;
                    break;
                }
            }
            if (prim) System.out.println(i);
        }
        in.close();
    }
}