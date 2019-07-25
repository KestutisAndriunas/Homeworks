package lt.bit.hw;

/*Parašykite programą, kuri skaičiuoja pateikto kūno
masę įvairiose planetose (Marsas, Plutonas ir pan.).*/

import java.util.Scanner;

public class op005 {
    public static void main(String[] args) {
        weightOnPlanetCounter();
    }

    private static void weightOnPlanetCounter() {
        double massOfBody;
        double gOnPlanet;
        /* gEarth = 9.81; gMoon = (float) 1.62; gMercury = 3.70;
        gMars = 3.86; Uranus = 7.51; Neptun = 11; gJupiter = 23.95;*/
        double weightOnPlanet;
        Scanner input = new Scanner(System.in);
        System.out.println("Input mass of body: ");
        massOfBody = input.nextDouble();
        System.out.println("Input g on the Planet: ");
        gOnPlanet = input.nextDouble();
        weightOnPlanet = (massOfBody * gOnPlanet);
        System.out.println("Weight of the body which mass =  " + massOfBody +
                " kg, on choosen planet = " + weightOnPlanet + " N");
    }
}
