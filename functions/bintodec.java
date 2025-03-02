import java.util.*;

public class bintodec {
    public static int lastd(int a){
            int tm=a%10;
            return tm;
        
    }

    public static int length(int a){
        int len=0;
        for(int i=a;i!=0;i/=10){
            len++;
        }
        return len;
    }
    public static int bintodec1(int a){
        int len= length(a);
        int rn=0;
        for(double i=0;i<=len;i++){
            int ld = lastd(a);
            a=a/10;
            rn= rn+(int) (ld*Math.pow(2.0, i));
        }
        return rn;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a binary Number:=");
        int b=sc.nextInt();
        int rn = bintodec1(b);
        System.out.println(rn);
    }    
}
