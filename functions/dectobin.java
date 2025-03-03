import java.util.Scanner;

public class dectobin {

    public static void dectobi(int d){
        int bin = 0;
        int rem;
        int i=0;
        while (d>0) {
            rem = d%2;
            bin= bin + rem*(int)Math.pow(10, i);
            i++;
            d=d/2;
        }
        System.out.println("Binary Number is :="+bin);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a Decimal Number:=");
        int d = sc.nextInt();
        dectobi(d);
    }
}