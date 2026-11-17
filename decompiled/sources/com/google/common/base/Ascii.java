package com.google.common.base;

/* loaded from: classes5.dex */
public abstract class Ascii {
    public static boolean equalsIgnoreCase(CharSequence s1, CharSequence s2) {
        char c;
        int length = s1.length();
        if (s1 != s2) {
            if (length == s2.length()) {
                for (int i = 0; i < length; i++) {
                    if (s1.charAt(i) == s2.charAt(i) || ((c = (char) ((r0 | ' ') - 97)) < 26 && c == ((char) ((r2 | ' ') - 97)))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static String toLowerCase(String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            char cCharAt = string.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }

    public static String toUpperCase(String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            char cCharAt = string.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }
}
