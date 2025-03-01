import java.util.*;
public class div {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        for (int i=1;i>0;i++){
            int a= sc.nextInt();
            if(a%10==0){
                break;
            }
            System.out.println(a);
        }
    }
}
