package check;

import exeption.CheckException;
import numbers.Manipulation;

public class SignCheck {

    Manipulation arabic = new Manipulation();

    public int sign(String txt, int[] mass) throws CheckException {
        int a = 0;
        if (mass[0] > 10 || mass[1] > 10) {
            throw new CheckException("Invalid input!");
        } else {
            switch (txt) {
                case ("+"):
                    a = arabic.addition(mass);
                    break;
                case ("-"):
                    a = arabic.subtraction(mass);
                    break;
                case ("*"):
                    a = arabic.multiplication(mass);
                    break;
                case ("/"):
                    a = arabic.division(mass);
            }
        }
        return a;
    }
}
