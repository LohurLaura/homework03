public class Main {
    public static void main(String[] args) {
        // task 1 (when I declared all the three variables on different rows, running the code gave errors, so I deleted them)
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

        // task 7
        char originalChar = 'A';
        int shiftAmount = 3;
        char encryptedChar = (char) (originalChar + shiftAmount);
        System.out.println("Original Character: " + originalChar);
        System.out.println("Encrypted Character: " + encryptedChar);
    }
}