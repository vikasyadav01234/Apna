import java.util.Scanner;

public class palidromstring {
    public static boolean Palidrome(String str){
        int s = str.length()-1;
        boolean p = true;
        for(int i = 0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(s-i)){
                
                p = false;
            }
        }
        return p;
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name Please: = ");
        String name = sc.nextLine();
        boolean a=Palidrome(name);
        if (a==true) {
            System.out.print("String is palidrome ");
        }else{
            System.out.print(" String is not palidrome ");
        }
    }
}
