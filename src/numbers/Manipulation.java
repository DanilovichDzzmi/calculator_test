package numbers;

import exeption.CheckException;

public class Manipulation {
    private final int MAXVALUE = 10;

    public int addition(int[] mass) {
        return mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] + mass[1] : -255;
    }

    public int subtraction(int[] mass) {
        return mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] - mass[1] : -255;
    }

    public int multiplication(int[] mass) {
        return mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] * mass[1] : -255;
    }

    public int division(int[] mass) {
        return mass[0] <= MAXVALUE && mass[1] <= MAXVALUE ? mass[0] / mass[1] : -255;
    }

    public void display(int a) throws CheckException {
        if (a != -255) {
            System.out.println(a);
        } else {
            throw new CheckException("Invalid input!");
        }
    }
}
