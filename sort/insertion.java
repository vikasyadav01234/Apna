import java.util.*;
public class insertion {
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int pre=i-1;
            while (pre>=0&& arr[pre]>curr) {
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        print(arr);

    }
}
