import java.util.Scanner;

public class fact {
    public static int facta(int n){
        if (n == 0) {
            return 1;
        }else{
            return n*facta(n-1);
        }
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(facta(n));;
    }
}
