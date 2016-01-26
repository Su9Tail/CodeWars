import java.text.DecimalFormat;

public class Circle {
    public static double area(double radius) {
        if(radius <= 0){
            throw new IllegalArgumentException("参数不能为0或者负数");
        }
        double area = Math.PI * radius * radius;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(area));
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area(-5));
    }
}