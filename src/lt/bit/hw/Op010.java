package lt.bit.hw;

//Parašykite programą, kuri užpildo 20 elementų masyvą atsitiktiniais skaičiais.
//      Surušiuokite gautą masyvą. suskaičiuokite Masyvo elementų reikšmių sumą.

import java.util.Arrays;

public class Op010 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);
        int sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            sum += randomNumbers[i];
        }
        System.out.println("Sorted array : " + Arrays.toString(randomNumbers));
        System.out.println("Array's numbers sum : " + sum);
    }
}
