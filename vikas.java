import java.util.Scanner;   

public class vikas {
    public static int maximum(int mat[][]){
        int maximum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]>maximum){
                    maximum = mat[i][j];
                }
            }
        }
        return maximum;
    }
    public static void search(int mat[][] ,int k){
        for (int i=0;i<mat.length;i++){
            for (int j = 0;j<mat[0].length;j++){
                if (mat[i][j]==k) {
                    System.out.print("Number is found at index or ("+i+","+j+")="+mat[i][j]);
                }
            }
        }
    }
    public static void main(String []arg){
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
        for (int i=0;i<a.length;i++){
            for (int j = 0;j<a[0].length;j++){
                System.out.println("a["+i+"]["+j+"] = "+a[i][j]);
            }
        }
        System.out.print("Enter a number search in matrix");
        int k = sc.nextInt();
        search(a, k);
        System.out.print("Maximum Number in the matrix: "+maximum(a));
    }
}
