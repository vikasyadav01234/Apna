import java.util.Scanner;

public class vikas3 {
    public static String substring(String s ,int x,int y){
        String sub = s.substring(x,y);
        return sub;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The a String: = ");
        String s = sc.nextLine();
        System.out.print("Enter A Starting index for your sub string: =");
        int st = sc.nextInt();
        System.out.print("Enter the Ending index for your substring:= ");
        int ed = sc.nextInt();
        System.out.print("Sub String is Here:= "+substring(s, st, ed));
    }
}
