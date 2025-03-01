import java.util.*;

public class prime {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime=true;
        for (int i=2;i<=(n-1);i++){
            if (n%i==0){
                isPrime=false;
                break;
            }
            
            

        }    
        if (isPrime==false){
            System.out.println("Number is not Prime");
        }else{
            System.out.println("Number is Prime");
        }


    }    
}
