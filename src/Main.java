import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task 1
        int length = 2;
        int width = 5;
        int area = length * width;
        System.out.println(area);

        // task 2
        double weight = 54;
        double height = 1.6;
        double bodyMassIndex = weight / (height * height);
        System.out.println(bodyMassIndex);

        // task 3
        double c = 25;
        double f = (9.0/5.0) * c + 32;
        System.out.println(f);

        // task 4
        int increment = 2147483647;
        increment++;
        System.out.println("Increment: " + increment++);

        //task 5
        double originalW = 5.7;
        int truncatedW = (int) originalW;
        System.out.println("Original number: " + originalW);
        System.out.println("Truncated number: " + truncatedW);

        //task 6
        int age = 25;
        boolean comparison = age >= 18;
        System.out.println("Test result: " + comparison);

        // task 7
        char originalChar = 'A';
        int shiftAmount = 3;
        char encryptedChar = (char) (originalChar + shiftAmount);
        System.out.println("Original Character: " + originalChar);
        System.out.println("Encrypted Character: " + encryptedChar);

        //task 8 copied from the link, but something seems to be not working...
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        System.out.println("You entered integer 5" + a);
        int b = in.nextInt();
        System.out.println("You entered integer 2" + b);

        System.out.println(a*b);
    }
}