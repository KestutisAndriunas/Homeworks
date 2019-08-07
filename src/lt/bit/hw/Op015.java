package lt.bit.hw;

//Parašykite programą, kuri skaičiuoja funkcijos y = 3x reikšmes, kai x keičiasi nuo 0 iki 10.

public class Op015 {

    public static void main(String[] args) {
        calcFunction();
    }

    private static void calcFunction() {
        System.out.println("Function y = x * 3");
        System.out.println("------------------");
        for (int x = 0; x <= 10; x++) {
            System.out.println("If x = " + x + "   y = " + (x * 3));
        }
    }
}
        /*int x = 0, y;
        do {
            y = x * 3;
            System.out.println("If x = " + x + "   y = " + (y));
            x++;
        } while (x <= 10);*/

