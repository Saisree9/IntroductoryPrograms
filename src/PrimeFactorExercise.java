import java.util.ArrayList;
import java.util.List;

public class PrimeFactorExercise {
    List<Integer> listOfPrimeFactors = new ArrayList<>();

    public List<Integer> generate(int number) {
        for (int i = 2; i <=number; i++) {
            if (number % i == 0) {
                int flag=0;
                for (int k = 2; k < i; k++)
                    if (i % k == 0)
                        flag = 1;
                if (flag == 0)
                    listOfPrimeFactors.add(i);
            }
        }
        return listOfPrimeFactors;
    }
}

class PrimeFactorTest {
    public static void main(String[] args) {
        List primeFactors = new ArrayList<>();
        PrimeFactorExercise p = new PrimeFactorExercise();
        primeFactors = p.generate(5);
        System.out.println(primeFactors);
    }
}
