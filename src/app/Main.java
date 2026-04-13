package app;

public class Main {

    public static void main (String[] args) {
        System.out.println("Converter app v. 3.0");

        double far = 53.5;
        double cel = 36.6;

        double F = CONV_TO_C(far);
        double C = CONV_TO_F(cel);

        System.out.printf("Result is %.2f Celsius degrees%n", F);
        System.out.printf("Result is %.2f Fahrenheit degrees%n", C);
    }
    private static double CONV_TO_C(double far) {
        return (far - 32) * 5/9;
    }
    private static double CONV_TO_F(double cel) {
        return (cel * 5/9) + 32;
    }
}
