import java.util.Scanner;

public class largest {
    public static String compair(String a[]){
        String largest = a[0];
        for(int i=1;i<a.length;i++){
            if(largest.compareToIgnoreCase(a[i])<1){
                largest = a[i];
            }
        }
        return largest;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s[] = new String[3];
        for(int i=0;i<3;i++){
            s[i]=sc.nextLine();
        }
        System.out.print(compair(s));

    }
}
