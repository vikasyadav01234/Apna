import java.util.*;

public class liner {

    public static void search(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("Index of key is "+i);
                break;
            }
            
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter The Number you want to search Here:=");
        int key = sc.nextInt();
        search(arr, key);

    }
}
