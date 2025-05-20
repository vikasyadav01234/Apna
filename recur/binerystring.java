import java.util.Scanner;

public class binerystring {
    public static void last(int n, int lp, String bs){
        if (n==0) {
            System.out.println(bs);
            return;
        }

        last(n-1,0,bs+"0");
        if (lp == 0) {
            last(n-1,1,bs+"1");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        last(n, 0,"");
    }
}
