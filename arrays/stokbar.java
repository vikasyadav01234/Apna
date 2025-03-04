import java.util.*;
public class stokbar {
    public static void stok(int arr[]){
        int bp=Integer.MAX_VALUE;
        int mp=0;
        int pro;
        for(int i=0;i<arr.length;i++){
            if(bp<arr[i]){
                pro=arr[i]-bp;
                if(pro>mp){
                    mp=pro;
                }
            }else{
                bp=arr[i];
            }
        }
        System.out.println(mp);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        stok(arr);
    }

}
