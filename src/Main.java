import java.util.Scanner;
public class Main {
    private static final String HYPOTENUSE = "Введите значение гипотенузы: ";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(HYPOTENUSE);
        double hypotenuse = scanner.nextDouble();
        double cathetus = getCathetus(hypotenuse);
        double halfperimeter = getHalfperimeter(cathetus,hypotenuse);
        double radius = getRadius(cathetus,halfperimeter,hypotenuse);
        double area = getArea(radius);
    }

    public static double getCathetus(double hypotenuse) {fff
        double cathetus = hypotenuse/Math.sqrt(2);
        System.out.println("cathetus: "+cathetus);
        return cathetus;
    }

    public static double getHalfperimeter(double cathetus, double hypotenuse) {
    double halfperimeter = (2*cathetus+hypotenuse)/2;
        System.out.println("halfperimeter: "+halfperimeter);
        return halfperimeter;
    }
    public static double getRadius(double cathetus, double halfperimeter, double hypotenuse) {
        double radius = Math.sqrt(((halfperimeter-hypotenuse)*(halfperimeter-cathetus)*(halfperimeter-cathetus))/halfperimeter);
        System.out.println("radius: "+radius);
        return radius;
    }
    public static double getArea(double radius) {
        double area = Math.PI*radius*radius;
        System.out.println("area: "+area);
        return area;
    }
}
