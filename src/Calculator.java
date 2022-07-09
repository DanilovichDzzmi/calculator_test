import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Arabic arabic = new Arabic();
        Roman roman = new Roman();

        System.out.print("Enter expressions: ");
        Scanner sc = new Scanner(System.in);
        String put = sc.nextLine().replaceAll("\\s+", "");
        String[] mass = put.split("[+*/\\-]+");
        String[] rep = put.split("");

        if (mass.length == 2) {
            if (isArabic(mass[0], mass[1])) {
                for (String s : rep) {
                    int[] full = parse(mass[0], mass[1]);
                    switch (s) {
                        case ("+"):
                            arabic.addition(full);
                            break;
                        case ("-"):
                            arabic.subtraction(full);
                            break;
                        case ("*"):
                            arabic.multiplication(full);
                            break;
                        case ("/"):
                            arabic.division(full);
                    }
                }
            } else if (isRoman(mass[0], mass[1])) {
                for (String s : rep) {
                    romanToArabic(mass[0], mass[1]);
                    String[] full = {mass[0], mass[1]};
                    switch (s) {
                        case ("+"):
                            roman.addition(full);
                            break;
                        case ("-"):
                            roman.subtraction(full);
                            break;
                        case ("*"):
                            roman.multiplication(full);
                            break;
                        case ("/"):
                            roman.division(full);
                    }
                }
            } else {
                System.err.println("Incorrect value!");
            }
        } else {
            System.err.println("Incorrect value!");
        }
    }

    public static boolean isArabic(String one, String two) {
        try {
            parse(one, two);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isRoman(String one, String two) {
        String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
        String mass = one + two;
        char[] isMassChar = mass.toCharArray();
        int counter = isMassChar.length;

        for (String s : roman) {
            for (char c : isMassChar) {
                if (s.equals(Character.toString(c))) {
                    counter--;
                }
            }
        }
        return counter == 0;
    }

    public static int[] parse(String one, String two) {
        return new int[]{Integer.parseInt(one), Integer.parseInt(two)};
    }

    public static int [] romanToArabic(String one, String two) {
        String[] arr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        HashMap<String, Integer> map = new HashMap<>();
        int i = 1;
        for (String element : arr) {
            map.put(element, i);
            i++;
        }
        int [] mass = new int[2];
        int res = 0;
        for (Map.Entry e : map.entrySet()) {
            if (e.equals(one)) {
                res += (int) e.getValue();
            }
        }
        System.out.println(res);

        return mass;
    }
}