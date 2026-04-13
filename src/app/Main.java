package app;

public class Main {

    private static byte koef = 32;

    public static void main (String[] args) {
        System.out.println("Converter app v. 3.0");

        double far = 74.5;
        double cel = 36.6;

        double F = converteFarToCel(far);
        double C = convertCelToFar(cel);

        System.out.printf("Result is %.2f Celsius degrees%n", F);
        System.out.printf("Result is %.2f Fahrenheit degrees%n", C);
    }
    private static double converteFarToCel(double far) {
        return (far - koef) * 5/9;
    }
    private static double convertCelToFar(double cel) {
        return (cel * 9/5) + koef;
    }
}
