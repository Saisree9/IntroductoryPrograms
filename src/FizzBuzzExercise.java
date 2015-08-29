public class FizzBuzzExercise {
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
}

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzExercise f = new FizzBuzzExercise();
        f.fizzBuzz();
    }
}