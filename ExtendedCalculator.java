package CIE_1.J2;

public class ExtendedCalculator extends Calculator {

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double cubeRoot(double num) {
        return Math.cbrt(num);
    }

    public static void main(String[] args) {
        ExtendedCalculator calc = new ExtendedCalculator();

        System.out.println("Square root of 16: " + calc.squareRoot(16));
        System.out.println("Cube root of 27: " + calc.cubeRoot(27));
    }
}

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
