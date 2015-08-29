public class DiamondExercise {
    private void printHorizontalLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private void printSpaceAndStars(int lenght, int i) {
        for (int j = 1; j <= lenght - i; j++)
            System.out.print(" ");
        printHorizontalLine(2 * i - 1);
    }

    public void printCenteredDiamond(int length) {
        for (int i = 1; i <= length; i++) {
            printSpaceAndStars(length, i);
        }
        for (int i=length-1;i>=0;i--){
            printSpaceAndStars(length, i);
        }
    }
    public void printCenteredDiamondWithName(int length){
        for (int i = 1; i <= length; i++) {
            if (i==length)
                System.out.println("Saisree");
            else
            printSpaceAndStars(length, i);
        }
        for (int i=length-1;i>=0;i--){
            printSpaceAndStars(length, i);
        }


    }
}

class DiamondExerciseTest {
    public static void main(String[] args) {
        DiamondExercise d = new DiamondExercise();
        d.printCenteredDiamond(4);
        d.printCenteredDiamondWithName(4);
    }
}
