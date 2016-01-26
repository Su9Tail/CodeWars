class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int first = n * (n - 1) + 1;
        return n * first + n * (n - 1);
//        return n * n * n;
    }

    public static void main(String[] args) {
        RowSumOddNumbers rowSumOddNumbers = new RowSumOddNumbers();
        int result = rowSumOddNumbers.rowSumOddNumbers(3);
        System.out.println(result);
    }
}