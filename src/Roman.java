import java.util.HashMap;
import java.util.Map;

public class Roman {

    public static HashMap<String, Integer> romanMap() {
        String[] arr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        HashMap<String, Integer> map = new HashMap<>();
        int i = 1;
        for (String element : arr
        ) {
            map.put(element, i);
            i++;
        }
        return map;
    }

    public void addition(String[] mass) {

    }

    public void subtraction(String[] mass) {

    }


    public void multiplication(String[] mass) {

    }

    public void division(String[] mass) {

    }
}
