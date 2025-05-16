import java.util.Scanner;

public class upper {
    public static StringBuilder uppe(String s){
        StringBuilder sc = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        sc.append(ch);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '&& i<s.length()-1){
                sc.append(s.charAt(i));
                i++;
                sc.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sc.append(s.charAt(i));
            }
        }
        return sc;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name Please: = ");
        String name = sc.nextLine();
        System.out.print(uppe(name));
        
    }
}
