import java.util.*;
public class pair {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                System.out.print("("+arr[i]+","+arr[j]+"),");
            }
            System.out.println();
        }
    }
}
