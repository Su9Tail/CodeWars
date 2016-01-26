import java.util.Arrays;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int[] start = new int[]{0, 0};
        int[] stop = new int[]{0, 0};
        int minutes = 0;
        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    stop[1] = stop[1] + 1;
                    break;
                case 's':
                    stop[1] = stop[1] - 1;
                    break;
                case 'w':
                    stop[0] = stop[0] - 1;
                    break;
                case 'e':
                    stop[0] = stop[0] + 1;
                    break;
                default:
                    break;
            }
            minutes++;
        }
        if (Arrays.equals(start, stop) && minutes == 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TenMinWalk tenMinWalk = new TenMinWalk();
        System.out.println(tenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
