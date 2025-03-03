import java.util.*;
public class binery {
    public static int biner(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            if(arr[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter The NUmber find in Array=>");
        int a=sc.nextInt();
        int ans;
        ans = biner(arr,a);
        System.out.print("Index of the "+a+" is "+ans);

    }
}
