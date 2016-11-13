
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    private static int fib(int arg) {
        System.out.println("" + arg);
        return (arg < 2) ? arg : fib(arg - 2) + fib(arg - 1);
    }
}