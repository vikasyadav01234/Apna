import java.util.Scanner;

public class power {
    public static void powerof2(int n){
        if ((n & (n-1))==0) {
            System.out.print("Number is "+n +" Power of 2");
        }else{
            System.out.print("Not a power of 2");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        powerof2(n);
    }
}
