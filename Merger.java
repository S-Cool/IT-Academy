import java.util.Arrays;

public class Merger {
    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int lastCountArray = 1;
        while (aIndex + bIndex != result.length - 1) {
            if (a[aIndex] < b[bIndex]) {
                result[aIndex + bIndex] = a[aIndex++];
                if (aIndex == a.length) {
                    System.arraycopy(b, bIndex, result, result.length - 1, lastCountArray);}
                } else {
                    result[aIndex + bIndex] = b[bIndex++];
                if (aIndex == a.length) {
                    System.arraycopy(a, aIndex, result, result.length - 1, lastCountArray);}
                }
            }
        return result;
    }

    public static void main(String[] args) {
//        int[] firstArray = {10, 30, 50, 70, 90, 110, 130, 150};
//        int[] secondArray = {20, 40, 60, 80, 100, 120, 140, 160};
        int[] firstArray = {10, 30, 120};
        int[] secondArray = {100, 120, 140, 160};
        int[] mergeArrays = Merger.merge(firstArray, secondArray);
        System.out.println(Arrays.toString(mergeArrays));
    }
}
