import check.CheckNumber;
import check.Mark;
import check.SignCheck;
import exeption.CheckException;
import numbers.Manipulation;
import numbers.Roman;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws CheckException {
        System.out.print("Enter expressions: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextLine()));
    }

    public static String calc(String input) throws CheckException {
        CheckNumber checkNumber = new CheckNumber();
        SignCheck signCheck = new SignCheck();
        Mark mark = new Mark();
        Manipulation arabic = new Manipulation();
        Roman roman = new Roman();

        String put = input.replaceAll("\\s+", "");
        String[] mass = put.split("[+*/\\-]+");
        String opo = mark.token(put);

        if (mass.length == 2) {
            if (CheckNumber.isArabic(mass[0], mass[1])) {
                return arabic.display(signCheck.sign(opo, CheckNumber.parse(mass[0], mass[1])));
            } else if (checkNumber.isRoman(mass[0], mass[1])) {
                return roman.romanDisplay(signCheck.sign(opo, roman.romanToArabicConverter(mass[0], mass[1])));
            } else {
                throw new CheckException("Different number systems are used at the same time");
            }
        } else {
            throw new CheckException("The format of the mathematical operation" +
                    " does not satisfy the task - two operands and one operator (+, -, /, *)");
        }
    }
}