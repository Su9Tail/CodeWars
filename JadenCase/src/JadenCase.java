public class JadenCase {
    public String toJadenCase(String phrase) {
        String result = "";
        if (phrase == null || phrase == "") {
            return null;
        } else {
            String[] array = phrase.split(" ");
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
            }
            for (int i = 0; i < array.length; i++) {
                result = result + array[i] + " ";
            }
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        String result = jadenCase.toJadenCase("hello world!");
        System.out.println(result);
    }
}
