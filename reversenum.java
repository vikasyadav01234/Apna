import java.util.*;

public class reversenum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for(int tm = number;tm!=0;tm/=10){
            count++;
        }
        System.out.println(count);
        for (int i =1;i<=count;i++){
            int rev=number%10;
            number = number/10;
            System.out.print(rev);
        }
    }    
}
