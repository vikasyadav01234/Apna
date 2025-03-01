import java.util.*;

public class fact {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double fac=1;
        for(int i=1;i<=n;i++){

            fac=fac*i;
        }
        System.out.println(fac);
    }
}
