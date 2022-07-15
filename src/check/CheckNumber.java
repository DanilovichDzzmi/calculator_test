package check;

public class CheckNumber {
    public static boolean isArabic(String one, String two) {
        try {
            parse(one, two);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isRoman(String one, String two) {
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
}
