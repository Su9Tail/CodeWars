public class DigPow {
    public static long digPow(int n, int p) {
        String string = String.valueOf(n);
        int digits = string.length();
        double sum = 0;
        for (int i = 0; i < digits; i++) {
            int number = Integer.parseInt(string.charAt(i) + "");
            sum = sum + Math.pow(number, (p + i));
        }
        if (sum % n == 0) {
            return (long) sum / n;
        }
        return -1;
    }

    public static void main(String[] args) {
        DigPow digPow = new DigPow();
        System.out.println(digPow.digPow(89,1));
        System.out.println(digPow.digPow(92,1));
        System.out.println(digPow.digPow(695,2));
        System.out.println(digPow.digPow(46288,3));
    }
}
