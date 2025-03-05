import java.util.*;

public class buyprice {
    public static int maxprofit(int arr1[]){
        int arr[]=new int[arr1.length];
        arr=arr1;
        int buyprice=Integer.MAX_VALUE;
        int maxprofite=0;
        for(int i=0;i<arr.length;i++){
            if(buyprice>arr[i]){
                buyprice=arr[i];
            }
            for(int j=i+1;j<arr.length;j++){
                if(buyprice<arr[j]){
                    maxprofite=Math.max(maxprofite, (arr[j]-buyprice));
                }
            }
        }
        return maxprofite;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxprofit(arr));

    }
}
