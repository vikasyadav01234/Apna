import java.util.*;
public class isEven {
    public static boolean isEven1(int a){
        boolean num= false;
        if(a%2==0){
            return num=true;
        }
        else{
            return num;
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print(isEven1(a));
    }
}
