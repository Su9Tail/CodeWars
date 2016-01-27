public class PlayPass {
    public static String playPass(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                int ascii = (int) chars[i] + n;
                if (ascii > 90) {
                    ascii = ascii - 26;
                }
                chars[i] = (char) ascii;
            }
            if (Character.isDigit(chars[i])) {
                chars[i] = (char) (105 - chars[i]);
            }
            if (i % 2 != 0) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        String string = String.valueOf(chars);
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }
}