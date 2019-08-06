package lt.bit.hw;

// faktorialo skaičiavimo programą, kuri nenaudoja rekursijos.

import java.math.BigInteger;
import java.util.Scanner;

public class Op013 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = inputNumber.nextInt();
        BigInteger numberTwo = BigInteger.valueOf(1);
        for (int i = number; i>0; i--){
            numberTwo = numberTwo.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println("Number's "+number+" factorial = "+numberTwo);
    }
}
