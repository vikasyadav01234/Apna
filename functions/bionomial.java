import java.util.*;
public class bionomial {
    public static double fact(int a){
        double ans=1;
        for (int i=1;i<=a;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter th value of n:=");
        int n = sc.nextInt();
        System.out.print("Enter the Value of r:=");
        int r = sc.nextInt();
        double fn = fact(n);
        double fr = fact(r);
        double fnr = fact((n-r));
        double bin = fn/(fr*fnr);
        System.out.print("The Binomiol of "+n+" and "+r+" is "+bin);
    }
}
