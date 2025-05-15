import java.util.*;
public class create {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
