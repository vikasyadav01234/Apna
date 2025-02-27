import java.util.*;
public class area {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Radius of circle:=");
        double r=sc.nextDouble();
        double pi=3.14;
        double area = pi*r*r;
        System.out.println("Area of Circle:="+area);
    }
}
