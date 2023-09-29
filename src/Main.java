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
        double temperatureC = 6.5;
        double temperatureF = 15.5;
        double Fahrenheit = (9/5) * temperatureC + 32;
        System.out.println(Fahrenheit);

        // task 7 (errors, don't know the right answer)
        char a = n;
        final int r = a + 1;
        System.out.println('final int');
    }
}