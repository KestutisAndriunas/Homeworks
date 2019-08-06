package lt.bit.hw;

//Parašykite Fibonačio skaičių sekos skaičiavimo programą, kuri nenaudoja rekursijos.

import java.math.BigDecimal;
import java.math.BigInteger;

public class Op014 {
    public static void main(String args[]) {
        BigInteger numberOne = BigInteger.valueOf(0);
        BigInteger numberTwo = BigInteger.valueOf(1);
        int fibonacci = 100;
        System.out.print(numberOne + " " + numberTwo);
        for (int i = 2; i < fibonacci; ++i) {
            BigInteger numberThree = numberOne.add(numberTwo);
            System.out.print(" " + numberThree);
            numberOne = numberTwo;
            numberTwo = numberThree;
        }
    }

}
