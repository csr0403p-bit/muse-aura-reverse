package X;

import java.util.Locale;

/* renamed from: X.3up, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3up {
    public static final String A00(char c) {
        String strValueOf = String.valueOf(c);
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == '\u0149') {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String lowerCase = upperCase.substring(1).toLowerCase(locale);
        StringBuilder sb = new StringBuilder();
        sb.append(cCharAt);
        return AnonymousClass001.A0v(lowerCase, sb);
    }
}
