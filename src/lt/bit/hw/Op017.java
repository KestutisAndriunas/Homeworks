package lt.bit.hw;

//Parašykite programą, kuri išveda į ekraną daugybos lentelę iki 10.

public class Op017 {

    public static void main(String[] args) {
        int a, b;
        System.out.println("                Multiplication table");
        System.out.format("      ");
        for (int i = 1; i <= 10; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("     -----------------------------------------");

        for (a = 1; a <= 10; a++) {
            System.out.format("%4d |", a);
            for (b = 1; b <= 10; b++) {
                System.out.format("%4d", a * b);
            }
            System.out.println();
        }
    }
}
