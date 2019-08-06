package lt.bit.hw;

//Parašykite programą, kuri skaičiuoja visų lyginių skaičių sumą diapazone nuo 0 iki 1000.
// Turi būti panaudoti for, while ir do ... while ciklai.

public class Op016 {
    public static void main(String[] args) {
        countByFor();
        countByWhile();
        countByDoWhile();
    }

    private static void countByFor() {
        int sum = 0;
        for (int i = 0; i <= 1000; i = i + 2) {
            sum += i;
        }
        System.out.println("Counted using for " + sum);
    }

    private static void countByWhile() {
        int i = 0, sum = 0;
        while (i <= 1000) {
            sum += i;
            i = i + 2;
        }
        System.out.println("Counted using while " + sum);

    }

    private static void countByDoWhile() {
        int sum = 0, i = 0;
        do {
            sum += i;
            i = i + 2;
        } while (i <= 1000);
        System.out.println("Counted using do while " + sum);
    }


}
