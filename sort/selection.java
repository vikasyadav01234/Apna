import java.util.*;

public class selection {
    public static void sort(int arr[]){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    min=arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        print(arr);
    }
}
