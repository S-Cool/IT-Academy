
public class CountingCommas {
    public static void main(String[] args) {

        String line = "Тестовая строка, с несколькими,, запятыми , ";
        int numberOfCommas = 0;
        int cursor = 0;

        while (cursor != -1) {
            cursor = line.indexOf(',', cursor);
            if (cursor != -1) {
                cursor++;
                numberOfCommas++;
            }
        }
        System.out.println(numberOfCommas);
    }


}
