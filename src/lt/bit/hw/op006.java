package lt.bit.hw;

/*Parašykite Farenheito į Celsijaus (ºF į ºC) konversijų skaičiuoklę.
Skaičiavimo tikslumas turi būti du skaičiai po kalblelio. */

import java.util.Scanner;

public class op006 {
    public static void main(String[] args) {
        converterFahrenheitToCelsius();
    }

    private static void converterFahrenheitToCelsius() {
        double fahrenheitDegrees;
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degrees: ");
        fahrenheitDegrees = input.nextDouble();
        double CelsiusDegrees = (fahrenheitDegrees - 32) / 1.8;
        System.out.format("If temperature in ºF = " + fahrenheitDegrees +
                ", temperature in ºC = %.2f%n", CelsiusDegrees);

    }

}
