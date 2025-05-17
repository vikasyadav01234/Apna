import java.util.Scanner;
public class odd {
    public static void oddeven(int n){
        int bit = 1;
        if((bit&n)==0){
            System.out.print("Number is Even "+n);
        }else{
            System.out.print("Number is Odd "+n);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        oddeven(n);

    }
}
