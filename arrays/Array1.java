import java.util.*;

public class Array1 {
    public static void UpdateMarks(int arr[]){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int marks[]=new int[6];
        for(int i=0;i<6;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){
            System.out.print(marks[i]+",");
        }
        UpdateMarks(marks);
        for(int i=0;i<6;i++){
            System.out.print(marks[i]+",");
        }

    }
}
