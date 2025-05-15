import java.io.PrintStream;
import java.util.*;
public class vikas1 {
    public static void printspiral(int mat[][]){
        int rs = 0;
        int cs = 0;
        int re = mat.length-1;
        int ce = mat[0].length-1;
        while (rs <=re && cs <= ce) {
         
            for(int i=cs;i<ce;i++){
               System.out.print(mat[rs][i]+" ");
            }
            for(int i=rs; i<re;i++){
                System.out.print(mat[i][ce]+" ");
            }
            for(int i = ce;i>=cs;i--){
                System.out.print(mat[re][i]+" ");
            }
            for(int i = re-1;i>=rs+1;i--){
                System.out.print(mat[i][cs]+" ");
            }
        rs++;
        cs++;
        re--;
        ce--;
        }
        
        
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of rows your matrix:");
        int r = sc.nextInt();

        System.out.println("Enter The Number of Columns your matrix: ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for (int i=0;i<a.length;i++){
            for (int j = 0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        printspiral(a);
    }
}
