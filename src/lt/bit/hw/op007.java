package lt.bit.hw;

/*Parašykite žmogaus kūno masės indekso skaičiuoklę.*/

import java.util.Scanner;

public class op007 {
    public static void main(String[] args) {
bodyMassIndexCounter ();
    }
    private static void bodyMassIndexCounter() {

        double height; // m
        double weight; // kg
        double bmiCounter;
        Scanner input = new Scanner(System. in);
        System.out.println("Body height in meters");
        height = input.nextDouble();
        System.out.println("Body weight in kilograms");
        weight = input.nextDouble();
        bmiCounter = weight / (height * height);
        System.out.format("Body height: " + height + " m, body weight: " + weight +
                " kg, body mass index = %.2f%n", bmiCounter);
    }
}
