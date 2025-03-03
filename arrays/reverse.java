import java.util.*;

public class reverse {
    public static void reve(int arr[]){
        int start = 0;
        int end=arr.length-1;
        int temp = 0;
        while (start<end) {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]);
        }
        reve(arr);
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }    
}
