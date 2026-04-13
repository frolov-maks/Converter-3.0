package app;

public class Main {

    public static void main (String[] args) {
        System.out.println("Converter app v. 3.0");

        double far = 53;

        double F = CONV_TO_C(far);

        System.out.printf("Result is %.2f Celsius degrees%n", F);
    }
    private static double CONV_TO_C(double far) {
        return (far - 32) * 5/9;
    }
}
