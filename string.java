import java.util.Scanner;

public class string {
    public static void printstring(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name Please: = ");
        String name = sc.nextLine();
        System.out.print(name);
        System.out.println(name.length());
        //concataion 
        printstring(name);
    }
}
