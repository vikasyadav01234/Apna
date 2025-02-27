import java.util.*;
public class cost {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Price of pencil=");
        float a=sc.nextFloat();
        System.out.print("Enter The Price of pen=");
        float b=sc.nextFloat();
        System.out.print("Enter The Price of eraser=");
        float c=sc.nextFloat();
        float cost = a+b+c;
        System.out.print("Cost "+cost);
        float tc = cost +(cost*0.18f);
        System.out.println("Total Cost "+tc);
    }
}
