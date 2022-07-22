package check;

import exeption.CheckException;

public class Mark {
    public String token(String txt) throws CheckException {
        String b;
        if (txt.contains("-")) {
            b = "-";
        } else if (txt.contains("+")) {
            b = "+";
        } else if (txt.contains("/")) {
            b = "/";
        } else if (txt.contains("*")) {
            b = "*";
        } else {
            throw new CheckException("Not a vein sign!");
        }
        return b;
    }
}
