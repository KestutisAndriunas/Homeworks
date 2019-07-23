package lt.bit.hw;

import java.util.Scanner;

public class op013 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Įrašykite skaičių: ");
        int number = inputNumber.nextInt();
        int numberTwo = 1;
        for (int i = number; i>0; i--){
            numberTwo = numberTwo* i;
        }
        System.out.println("Skaičiaus "+number+" faktorialas yra "+numberTwo);
    }
}
