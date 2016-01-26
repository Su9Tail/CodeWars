public class Numbers {
    public static double twoDecimalPlaces(double number) {
        String string = String.valueOf(number);
        String[] array = string.split("\\.");
        double decimals = Double.parseDouble(array[1]);
        if (decimals < 10) {
            array[1] = decimals * 10 + "";
        } else {
            array[1] = array[1].substring(0, 2);
        }
        string = array[0] + "." + array[1];
        return Double.parseDouble(string);
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        double result = numbers.twoDecimalPlaces(-7488.83485834983);
        System.out.println(result);
    }
}