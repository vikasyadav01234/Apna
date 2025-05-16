import java.util.Scanner;

public class matrixser {
    public static void searchmatrix(int a[][], int key) {
        int cs = a[0].length - 1;
        int rs = 0;

        while (rs < a.length && cs >= 0) {
            if (a[rs][cs] == key) {
                System.out.println("(" + rs + " , " + cs + ") = " + a[rs][cs]);
                return;
            } else if (a[rs][cs] > key) {
                cs--;  // move left
            } else {
                rs++;  // move down
            }
        }

        System.out.println("Key not found");
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int a[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        System.out.print("Enter the number to search in matrix: ");
        int b = sc.nextInt();
        searchmatrix(a, b);
    }
}
