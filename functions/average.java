import java.util.*;
public class average {
    public static float aver(int a,int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        float avrg=aver(a, b, c);
        System.out.print("Average:="+avrg);
        
    }
}
