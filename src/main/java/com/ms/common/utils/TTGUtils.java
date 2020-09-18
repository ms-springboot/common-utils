package com.ms.common.utils;

public class TTGUtils {


    public static boolean checkOs(String os) {
        String s = os.toLowerCase();

        if ("android".equals(s)) {
            return true;
        }
        if ("ios".equals(s)) {
            return true;
        }
        if ("windows".equals(s)) {
            return true;
        }
        if ("osx".equals(s)) {
            return true;
        }
        if ("linux".equals(s)) {
            return true;
        }

        return false;
    }
}
