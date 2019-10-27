package com.math;

public class Logic implements Check {
    public String Ariph(int x, int y, String ar) {
        int res = 0;
        String result = "";
        char chars = ar.charAt(0);
                if (chars == '+') {
                    res = x + y;
                    return result = Integer.toString(res);
                } else if (chars == '-') {
                    res = x - y;
                    return result = Integer.toString(res);

                } else if (chars == '/') {
                    res = x / y;
                    return result = Integer.toString(res);

                } else if (chars == '*') {
                    res = x * y;
                    return result = Integer.toString(res);
            }
            return result;
    }

    @Override
    public String check(String ch) {
        String result = "";
        char check = ch.charAt(0);
        if (check == '+') {
            result = String.valueOf(check);
        } else if (check == '-') {
            result = String.valueOf(check);
        } else if (check == '/') {
            result = String.valueOf(check);
        } else if (check == '*') {
            result = String.valueOf(check);
        }
        else {
            result = "Error value";
        }
        return result;

    }
}

