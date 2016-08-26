/**
 * Created by Cals on 2016/8/26.
 */
public class BitCounting {
    public static int countBits(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
