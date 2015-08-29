public class TriangleExercise {
    public void printAsterisk() {
        System.out.println("*");
    }

    public void printHorizontalLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printVerticalLine(int length) {
        for (int i = 1; i <= length; i++) {
            printAsterisk();
        }
    }

    public void printRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            printHorizontalLine(i);
        }
    }

    public void printIsoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            printHorizontalLine(2 * i - 1);
        }
    }
}

class TraingleTest {
    public static void main(String[] args) {
        TriangleExercise triangle = new TriangleExercise();
        System.out.println("Asterisk");
        triangle.printAsterisk();
        System.out.println("Horizontal Line");
        triangle.printHorizontalLine(3);
        System.out.println("Vertical Line");
        triangle.printVerticalLine(4);
        System.out.println("Right Triangle");
        triangle.printRightTriangle(3);
        System.out.println("Isosceles Triangle");
        triangle.printIsoscelesTriangle(5);
    }
}

