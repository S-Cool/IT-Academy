import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        int[] x = {10, 20, 30};
        x = change(x);
        System.out.println(Arrays.toString(x));
    }

    public static int[] change(int[] arg) {
        arg[0] = 1000;
        arg = new int[]{100, 200, 300, 400, 500};
        return arg;
    }
}
