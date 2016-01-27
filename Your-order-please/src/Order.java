public class Order {
    public static String order(String words) {
        if(words == ""){
            return "";
        }
        String[] strings = words.split(" ");
        String[] results = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            char digit;
            for (int j = 0; j < strings[i].length(); j++) {
                digit = strings[i].charAt(j);
                if (Character.isDigit(digit)) {
                    results[Integer.parseInt(digit + "") - 1] = strings[i];
                }
            }
        }
        String string = "";
        for (int i = 0; i < results.length; i++) {
            string = string + results[i] + " ";
        }
        string = string.substring(0,string.length()-1);
        return string;
    }

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.order("is2 Thi1s T4est 3a"));
        System.out.println(order.order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order.order(""));
    }
}