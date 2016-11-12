import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Sergey on 12.11.2016.
 */
public class BubbleSort {

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    public static void main(String[] args) {
        int[] array = {10, 30, 40, 50, 20, 70, 90, 100};
        for (int barrier = array.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (array[index] < array[index + 1]) {
                    swap(array, index, index + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}