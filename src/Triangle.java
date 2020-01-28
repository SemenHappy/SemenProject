import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Введите значение сторон треугольника: ");
        Scanner scanner = new Scanner(System.in);
        Triangle1 triangle1 = new Triangle1();
        System.out.println("Сторона А: ");
        triangle1.a = scanner.nextInt();
        System.out.println("Сторона Б: ");
        triangle1.b = scanner.nextInt();
        System.out.println("Сторона С: ");
        triangle1.c = scanner.nextInt();
        int perimeter = triangle1.trianglePerimeter(triangle1.a, triangle1.b, triangle1.c);
        Triangle1.triangleAbsent(triangle1.a, triangle1.b, triangle1.c);
        triangle1.trianglePerimeter(triangle1.a, triangle1.b, triangle1.c);
        System.out.println("Периметер треугольника: " + triangle1.trianglePerimeter(triangle1.a, triangle1.b, triangle1.c));
        triangle1.triangleArea(triangle1.a, triangle1.b, triangle1.c);
        System.out.println("Площадь треугольника: " + triangle1.triangleArea(triangle1.a, triangle1.b, triangle1.c));

    }
}

class Triangle1 {
    int a;
    int b;
    int c;

    public static void triangleAbsent(int a, int b, int c) {
        if (a >= (b + c)) {
            System.out.println("Дальше");
        } else if (b >= (a + c)) {
            System.out.println("Дальше 1");
        } else if (c >= (a + b)) {
            System.out.println("Треугольник не существует : ");
        } else {
            System.out.println("Треугольник существует");
        }


    }


    public int trianglePerimeter(int a, int b, int c) {
        return a + b + c;
    }

    public double triangleArea(int a, int b, int c) {
        double p = 0.5 * (a+b+c);
        return Math.sqrt (p*(p-a)*(p-b)*(p-c));

    }
}