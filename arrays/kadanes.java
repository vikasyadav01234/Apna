import java.util.*;

public class kadanes {
    public static void kadane(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs =0 ;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
        }
        System.out.print(Math.max(cs, ms));
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        kadane(arr);


    }
}
