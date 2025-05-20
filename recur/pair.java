import java.util.Scanner;

public class pair {
    public static int pairs(int n){
        int ways =0;
        if(n==1||n==2){
            ways = n;
            return n;
        }
        ways = pairs(n-1)+ ((n-1)*pairs(n-2));
        return ways;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.print(pairs(n));
    }
}
