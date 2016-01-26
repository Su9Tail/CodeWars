public class Square {
    public static boolean isSquare(int n) {
        if (n <= 0) {
            return false;
        }
        int max = 0;
        if (n % 2 != 0) {
            max = (n + 1) / 2;
        }
        max = n / 2;
        for (int i = 1; i <= max; i++) {
            int product = i * i;
            if (n == product) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Square square = new Square();
        for(int i=0;i<=100;i++){
            System.out.println(square.isSquare(i));
        }
    }
}