import java.util.Scanner;

public class ithbit {
    public static int ithbi(int a, int b){
        if((a&(1<<b))==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print(ithbi(n, i));

    }
}
