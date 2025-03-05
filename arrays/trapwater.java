import java.util.*;

public class trapwater {
    public static void water(int arr[]){
        int n = arr.length;
        int rb[] =new int[n];
        int lb[] =new int [n];
        //find left max boundary
        lb[0]=arr[0];
        rb[0]=arr[n-1];
        for(int i=0;i<n;i++){
            lb[i]=i==0?arr[i]:Math.max(arr[i],lb[i-1]);
        }
        //find
        for (int i=n-1;i>0;i--){
            rb[i] = i==n-1?arr[i]:Math.max(arr[i], rb[i+1]);
        }
        int tpw= 0;
        //loop
        for(int i=0;i<n;i++){
            int water = Math.min(lb[i], rb[i]);
            tpw+=water-arr[i];
        }
        System.out.print(tpw);

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[13];
        for(int i=0;i<13;i++){
            arr[i]=sc.nextInt();
        }
        water(arr);
    }
}
