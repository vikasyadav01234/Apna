import java.util.*;
public class palindrome {
    public static int length(int a){
        int count=0;
        for(int i=a;i!=0;i/=10){
            count++;
        }
        return count;
    }
    public static int reverse(int a){
        int num =0;
        int len = length(a);
        for(int i=len-1;i>=0;i--){
            int v= a%10;
            num=num+(v*(int)Math.pow(10, i));
            a=a/10;
        }
        return num;
    }
    public static boolean palindrome1(int a){
        int reva = reverse(a);
        boolean pal=false;
        if(reva==a){
            return pal = true;
        }
        else{
            return pal;
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        boolean ans =palindrome1(a);
        if(ans==true){
            System.out.print("Number "+a+" is a Palindrome Number");
        }
        else{
            System.out.print("Number is not a Palindrome number");
        }

    }
}
