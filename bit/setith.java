import java.util.Scanner;

public class setith {
    public static int setbit(int a,int b){
        int bit = 1<<b;
        return a|bit;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print(setbit(n, i));
        
    }
}
