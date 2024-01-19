package unity.test;

public class Math {

    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static float divide(float a, float b) {

        if (b == 0.0f) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }

        return a / b;
    }
}
