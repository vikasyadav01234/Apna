import java.util.*;
public class search {
    public static void search1(int arr[][] ,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.print("("+i+","+j+")");
                }
            }
        }
        
    }
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
        int key = sc.nextInt();
        search1(matrix, key);
    }
}
