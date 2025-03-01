import java.util.*;
public class sumnum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;
        for (double i= 1;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
