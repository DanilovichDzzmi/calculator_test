package numbers;

import exeption.CheckException;

import java.util.HashMap;
import java.util.Map;

public class Roman {

    public static int[] arab = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static Map<String, Integer> romanMap() {
        String[] arr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
                "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
        Map<String, Integer> map = new HashMap<>();
        int i = 1;
        for (String element : arr
        ) {
            map.put(element, i);
            i++;
        }
        return map;
    }

    public int[] romanToArabicConverter(String one, String two) {
        String[] mass = {one, two};
        int[] massToArabic = new int[2];
        for (int i = 0; i < massToArabic.length; i++) {
            massToArabic[i] = romanMap().get(mass[i]);
        }
        return massToArabic;
    }

    public String romanDisplay(int a) throws CheckException {
        if (a > 0) {
            int i = 12;
            StringBuilder result = new StringBuilder();
            while (a > 0) {
                while (arab[i] > a) {
                    i--;
                }
                result.append(roman[i]);
                a -= arab[i];
            }
            return String.valueOf(result);
        } else {
            throw new CheckException("There are no negative numbers in the roman system");
        }
    }
}
