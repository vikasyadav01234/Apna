import java.util.*;
public class spiral {
    public static void matrix(int arr[][]){
        int sr=0;
        int er=arr.length-1;
        int sc=0;
        int ec=arr[0].length-1;
        int count=0;
        int total=arr.length*arr[0].length;
        while(sr<=er && sc<=ec){
            if(count%2==0){
                for(int i=sc;i<=ec;i++){
                    System.out.print(arr[sr][i]+" ");
                }
                sr++;
                for(int i=sr;i<=er;i++){
                    System.out.print(arr[i][ec]+" ");
                }
                ec--;
            }
            else{
                for(int i=ec;i>=sc;i--){
                    System.out.print(arr[er][i]+" ");
                }
                er--;
                for(int i=er;i>=sr;i--){
                    System.out.print(arr[i][sc]+" ");
                }
                sc++;
            }
            count++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j]=sc.nextInt();
            }
        }
        matrix(a);

    }
}