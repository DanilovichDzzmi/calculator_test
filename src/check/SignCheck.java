package check;

import numbers.Manipulation;

public class SignCheck {

    Manipulation arabic = new Manipulation();

    public int sign(String txt, int[] mass) {
        int a = 0;
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
        return a;
    }
}
