import java.util.*;
public class pass {
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
        String res = (marks>=33)?"Pass":"Fail";
        System.out.println(res);
    }
}
