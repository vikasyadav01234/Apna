import java.util.*;
public class subarrays {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
               for(int k=i;k<=j;k++){
                System.out.print(arr[k]+",");
               }
               System.err.println();
            }
            System.out.println();
        }
    }
}
