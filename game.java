import java.util.*;
public class game {
    public static int randam(){
        return (int)(Math.random()*100);
    }
    public static void main(String arg[]){
        int Rand = randam();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the a 2 Digit number between 0 to 100:");
            int n = sc.nextInt();
        
            if(n== Rand){
                System.out.println("I think you are correct! The number is " + n);
                break;
            }
            else if(n>Rand){
                System.out.println("I think it can be less than " + n);
            }
            else{
                System.out.println("I think it can be greater than " + n);
            }
        }
    }
}
