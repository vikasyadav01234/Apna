import java.util.*;
public class trapwater {
    public static int water(int a[]){
        int lb[]=new int[a.length];
        int rb[]=new int[a.length];
        int tw=0;
        int twr=0;
        int water;
        lb[0]=a[0];
        rb[0]=a[a.length-1];
        //find the left boundary;
        for(int i=0;i<a.length;i++){
            lb[i]=i==0?a[i]:Math.max(a[i], lb[i-1]);
        }
        //find the right boundary for wather;
        for(int i=a.length-1;i>0;i--){
            rb[i]=i==a.length-1?a[i]:Math.max(a[i], rb[i+1]);
        }
        //find the trap water
        
        for(int i=0;i<a.length;i++){
            water=Math.min(lb[i],rb[i]);
            tw=water-a[i];
            if(tw<0){
                tw=0;
            }
            twr=twr+tw;
        }
        return twr;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[12];
        for(int i=0;i<12;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(water(a));
    }
}
