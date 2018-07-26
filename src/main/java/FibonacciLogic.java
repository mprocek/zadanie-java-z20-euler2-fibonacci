import java.util.ArrayList;
import java.util.List;

public class FibonacciLogic {

    public int fibonacciCalc(int maxSum) {

        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        int sumNext = 0;
        int sum = 0;


        while (sumNext < maxSum) {

            if (num3 % 2 == 0) {
                sumNext += num3;
            }
            if (sumNext < maxSum) {
                sum = sumNext;
            }

            num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }
        return sum;
    }
}
