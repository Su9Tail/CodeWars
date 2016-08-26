/**
 * Created by Cals on 2016/8/26.
 */
public class Tripple {

    public static int TripleDouble(long num1, long num2) {
        Tripple tripple = new Tripple();
        int credential = tripple.validateNumberOne(num1);
        boolean flag = tripple.validateNumberTwo(num2, credential);
        if (flag) {
            return 1;
        }
        return 0;
    }

    //If num1 is validated,return the number of straight tripple or more,else return -1
    private int validateNumberOne(long number) {
        String string = Long.toString(number);
        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            int count = 0;
            char temporary = stringArray[i];
            for (int j = 0; j < stringArray.length; j++) {
                if (temporary == stringArray[j]) {
                    count = count + 1;
                }
            }
            if (count >= 3) {
                return Integer.parseInt(String.valueOf(temporary));
            }
        }
        return -1;
    }

    private boolean validateNumberTwo(long number, int credential) {
        String string = Long.toString(number);
        char[] stringArray = string.toCharArray();
        int count = 0;
        for (int i = 0; i < stringArray.length; i++) {
            int temporary = Integer.parseInt(String.valueOf(stringArray[i]));
            if (credential == temporary) {
                count = count + 1;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Tripple tripple = new Tripple();
        System.out.println(tripple.TripleDouble(451999277L, 41177722899L));
    }
}
