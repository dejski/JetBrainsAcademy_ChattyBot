import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
//        System.out.println(house);

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "rectangle":
                double a2 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                System.out.println(a2 * b2);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(3.14 * r * r);
                break;
        }

    }
}