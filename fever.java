import java.util.*;
public class fever {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        String res = temp>100?"You Have a fever":"You donot Have a fever";
        System.out.println(res);
    }
}
