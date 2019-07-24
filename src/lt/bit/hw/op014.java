package lt.bit.hw;

import java.math.BigDecimal;

public class op014 {
    public static void main(String args[]) {
        BigDecimal numberOne = BigDecimal.valueOf(0);
        BigDecimal numberTwo = BigDecimal.valueOf(1);
        int fibonacci = 37;
        System.out.print(numberOne + " " + numberTwo);
        for (int i = 2; i < fibonacci; ++i) {
            BigDecimal numberThree = numberOne.add(numberTwo);
            System.out.print(" " + numberThree);
            numberOne = numberTwo;
            numberTwo = numberThree;
        }
    }

}
