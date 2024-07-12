public class Main {
    public static void main(String[] args) {
        MathFunctions.initialize();


        double circleArea = MathFunctions.calculateCircleArea(5);
        System.out.println("Circle Area with radius 5: " + circleArea);


        double powerResult = MathFunctions.powerOfE(2.5);
        System.out.println("e^2.5 = " + powerResult);

        double triangleArea = MathFunctions.calculateTriangleArea(3, 4, 5);
        System.out.println("Triangle Area with sides 3, 4, 5: " + triangleArea);
    }
}