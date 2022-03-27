package triangle;

import java.text.DecimalFormat;

public class UpgradedTriangle {

    public static String classifyTriangle(int a, int b, int c) {
        // 首先判断三边是否都大于0
        if (a <= 0 || b <= 0 || c <= 0) return "INVALID";
        // 判断三角形是否存在
        if (!(a + b > c && a + c > b && b + c > a)) {
            return "INVALID";
        }
        // 判断是否为等边三角形
        if (a == b && b == c) {
            return "EQUILATERAL";
        }
        // 判断是否为等腰三角形
        if (a == b || a == c || b == c) {
            return "ISOSCELES";
        }
        // 判断是否为直角三角形
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "RIGHT ANGLED";
        }
        // 最后即为普通三角形
        return "SCALENE";
    }

    public static double calculateArea(int a, int b, int c) {
        // 首先判断三边是否都大于0
        if (a <= 0 || b <= 0 || c <= 0) return 0;
        // 判断三角形是否存在
        if (!(a + b > c && a + c > b && b + c > a)) {
            return 0;
        }
        // 利用海伦公式计算三角形面积
        double p = ((double) a + (double) b + (double) c) / 2;
        DecimalFormat df = new DecimalFormat("#.000");
        double area = Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
        return Double.parseDouble(df.format(area));
    }
}
