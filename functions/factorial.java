import java.util.*;
public class factorial {
    public static double fact(int a){
        double fact =1;
        for(int i=1;i<=a;i++){
            fact = i*fact;
        }
        return fact;
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number :=");
        int a=sc.nextInt();
        double ans=fact(a);
        System.out.println("Factorial of "+a+ " is ="+ans);
    }
}
