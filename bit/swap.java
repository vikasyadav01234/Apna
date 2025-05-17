import java.util.Scanner;

public class swap {
    public static void swap(int a, int b){
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.print(a+" "+b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
}
