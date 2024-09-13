public class Factorial {
    public static void main(String[] args) {
        int num = 5; // You can change this value to any number you want to find the factorial of
        long factorial = 1;

        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }

        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

