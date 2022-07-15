package numbers;

import exeption.CheckException;

import java.util.HashMap;
import java.util.Map;

public class Roman {

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

    public void romanDisplay(int a) throws CheckException {
        if (a > 0) {
            for (Map.Entry e : romanMap().entrySet()) {
                if (e.getValue().equals(a)) {
                    System.out.println(e.getKey());
                }
            }
        } else {
            throw new CheckException("There are no negative numbers in the roman system");
        }
    }
}
