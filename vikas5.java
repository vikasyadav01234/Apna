import java.util.Scanner;

public class vikas5 {
    public static StringBuilder shoort(String s){
        StringBuilder sc = new StringBuilder("");
        for (int i=0;i<s.length();i++){
            Integer count = 1;
            while (i<s.length()-1 && s.charAt(i)== s.charAt(i+1)) {
                count++;
                i++;
            }
            if(count>1){
                sc.append(s.charAt(i));
                sc.append(count);
            }else{
                sc.append(s.charAt(i));
            }
        }
        return sc;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(shoort(s));

    }
}
