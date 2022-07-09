public class Arabic {
    private final int MAXVALUE = 10;

    public void addition(int[] mass) {
        System.out.println(mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] + mass[1] : "Out of range");
    }

    public void subtraction(int[] mass) {
        System.out.println(mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] - mass[1] : "Out of range");
    }


    public void multiplication(int[] mass) {
        System.out.println(mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] * mass[1] : "Out of range");
    }

    public void division(int[] mass) {
        System.out.println(mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] / mass[1] : "Out of range");
    }
}
