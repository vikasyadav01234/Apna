import java.util.Scanner;

public class vikas {
    public static void recur(int n){
        System.out.print(n+ " ");
        if(n!=0){
            recur(n-1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        recur(n);
    }    
}
