import java.util.*;
public class prifix {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        int prifix[]=new int[arr.length];
        prifix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prifix[i]=prifix[i-1]+arr[i];
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
            //    for(int k=i;k<=j;k++){
            //     System.out.print(arr[k]+",");
            //    }
            int cs= i==0?prifix[j]:prifix[j]-prifix[i-1];
                if(cs>maxsum){
                    maxsum=cs;
                }
               System.err.println();
            }
            System.out.println(maxsum);
        }
    }
}
