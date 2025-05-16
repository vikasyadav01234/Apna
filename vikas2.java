import java.util.Scanner;

public class vikas2 {
    public static int distence(int x,int y){
        int dis;
        dis =(int)Math.sqrt(((int)Math.pow(x, 2))+(int)(Math.pow(y, 2)));
        return dis;
    }
    public static void shortest(String n){
        int x=0;
        int y=0;
        for(int i=0;i<n.length();i++){
            switch (n.charAt(i)) {
                case 'S':y--;
                    break;
                case 'N': y++;
                    break;
                case 'E': x++;
                    break;
                case 'W':x--;
                    break;
            
                default:
                    break;
            }
        }
        // System.out.print(x+ " "+ y);
        System.out.print("Shortest Path between starting and end point =: "+distence(x, y));
        
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Diraction in form of S,N,W,E: = ");
        String dir = sc.nextLine();
        shortest(dir);
        
    }
}
