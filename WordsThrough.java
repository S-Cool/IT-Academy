
class WordsThrough {

    public static void main(String[] args) {
        String text = "  Для подтверждения - электронной почты и завершения  процесса регистрации,  пройдите, пожалуйста, по ссылке  ";
        int word = 0;
        char cur;
        boolean space = true;
        boolean symbol = false;
        for (int i = 0; i < text.length(); i++) {
            cur = text.charAt(i);
            if ((cur == ' ') || (space && (cur == '-'))) {
                space = true;
                continue;
            } else {
                symbol = true;
            }
            if (space && symbol) {
                word++;
                space = false;
            }
        }
        System.out.println("В тестовой строке " + word + " слов");
    }
}
