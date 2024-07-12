public class MathFunctions {
    private static final double PI = 3.14159265359;
    private static final double E = 2.71828182846;


    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double powerOfE(double exponent) {
        return Math.pow(E, exponent);
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void initialize() {
        System.out.println("Initializing MathFunctions...");
        System.out.println("π = " + PI);
        System.out.println("e = " + E);
    }

}
