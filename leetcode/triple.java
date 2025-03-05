import java.util.*;
public class triple {


    public static void triple1(int arr[]){
        for(int j=0;j<arr.length;j++){
            for(int i=j;i<arr.length-3;i++){
                if(arr[i]+arr[i+1]+arr[i+2]==0){
                    System.out.print(arr[i]+""+arr[i+1]+""+arr[i+2]);
                    
                }
            }
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a[]= new int[6];
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        triple1(a);
    }
}
