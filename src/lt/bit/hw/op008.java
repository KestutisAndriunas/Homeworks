package lt.bit.hw;

/*Parašykite paprasto skaičiuotuvo programą.
Skaičiuotuvas turi mokėti atlikti aritmetines, logines ir bitines operacijas.*/

import java.util.Scanner;

public class op008 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Input number a: ");
        a = input.nextInt();
        System.out.println("Input Math. operation:" + "\n" + "" +
                " Elementary:  + , - , / , * , % " + "\n" +
                " Logic:  == , > , < , != , >= , <= " + "\n" +
                " Bitwise:  | , & , ^");
        String c = input.next();
        System.out.println("Input number b: ");
        b = input.nextInt();
        float sum = a + b;
        float diff = a - b;
        float div = a / b;
        float mult = a * b;
        float rem = a % b;

        switch (c) {
            case ("+"):
                System.out.println("a + b = " + sum);
                break;
            case ("-"):
                System.out.println(" a - b = " + diff);
                break;
            case ("/"):
                System.out.println(" a / b = " + div);
                break;
            case ("*"):
                System.out.println(" a * b =  " + mult);
                break;
            case ("%"):
                System.out.println(" a % b = " + rem);
                break;
            case ("=="):
                System.out.println(" a = b is " + (a == b));
                break;
            case (">"):
                System.out.println(" a > b is " + (a > b));
                break;
            case ("<"):
                System.out.println(" a < b is " + (a < b));
                break;
            case ("!="):
                System.out.println(" a != b is " + (a != b));
                break;
            case (">="):
                System.out.println(" a >= b is " + (a >= b));
                break;
            case ("<="):
                System.out.println(" a <= b is " + (a <= b));
                break;
            case ("&"):
                System.out.printf(" a & b = %d%n", (a & b));
                break;
            case ("|"):
                System.out.println(" a | b = " + (a | b));
                break;
            case ("^"):
                System.out.println(" a ^ b = " + (a ^ b));
                break;

        }
    }
}
