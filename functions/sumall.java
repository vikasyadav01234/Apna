import java.util.*;

public class sumall {
    public static int sum(int a){
        int sum =0;
        for (int i=a;i!=0;i/=10){
            sum=sum+(a%10);
            a=a/10;
        }
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int sum = sum(a);
        System.out.print("Sum "+sum);
    }    
}
