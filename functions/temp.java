import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Find the highest power of 2 less than or equal to the decimal number
        int highestPowerOf2 = 1;
        while (highestPowerOf2 <= decimalNumber) {
            highestPowerOf2 *= 2;
        }
        highestPowerOf2 /= 2;

        System.out.print("Binary representation: ");
        int currentPowerOf2 = highestPowerOf2;
        while (currentPowerOf2 > 0) {
            if (decimalNumber >= currentPowerOf2) {
                System.out.print(1);
                decimalNumber -= currentPowerOf2;
            } else {
                System.out.print(0);
            }
            currentPowerOf2 /= 2;
        }
        System.out.println();

        scanner.close();
    }
}
