import java.util.*;
public class calcu {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        String o = sc.next();
        double b = sc.nextDouble();
        switch (o) {
            case "+":
                System.out.println(a+b);                    
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            default:
                System.out.print("Wrong Input");
                break;
        }

    }
}
