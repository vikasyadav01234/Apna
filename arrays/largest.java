import java.util.*;

public class largest {
    public static int large(int arr[]){
        int a =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(a<arr[i]){
                a=arr[i];
            }
        }
        return a;
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter THe 5 numbers:=");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int a= large(arr);
        System.out.print("Largest Number in This Array is :="+a);

    }
}
