import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();

        if (!isValidTriangle(a, b, c)) {
            System.out.println("Ошибка: треугольник с такими сторонами не существует.");
            return;
        }

        double area = calculateArea(a, b, c);

        double ha = (2.0 * area) / a;
        double hb = (2.0 * area) / b;
        double hc = (2.0 * area) / c;

        System.out.printf("Высота ha = %.4f%n", ha);
        System.out.printf("Высота hb = %.4f%n", hb);
        System.out.printf("Высота hc = %.4f%n", hc);
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}