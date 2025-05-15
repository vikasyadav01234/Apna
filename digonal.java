import java.util.Scanner;

public class digonal {

    public static int digonalsum(int mat[][]){
        int sum = 0;
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //         if(i==j){
        //             sum+=mat[i][j];
        //         }
        //     }
        // }
        // int digonal = mat[0].length;
        // for(int i = 0;i<mat.length;i++){
        //     sum+=mat[i][digonal-1];
        //     digonal--;
        // }
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=mat.length-1-i){
                sum+=mat[i][mat.length-1-i];
            }
        }
        // if (mat.length%2==1) {
        //     sum =sum-mat[(mat.length/2)][(mat.length/2)];
        // }
        return sum;
    }
    public static void main(String arg[]){
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
        System.out.print(digonalsum(a));
    }
}
