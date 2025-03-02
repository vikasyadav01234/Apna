import java.util.*;

public class sum {
    public static void sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The a :=");
        int a = sc.nextInt();
        System.out.print("Enter The b:=");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of a and b ="+sum);
    }
    public static void main(String arg[]){
        sum1();
    }
}
