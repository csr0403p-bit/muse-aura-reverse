package X;

import java.util.TimeZone;

/* renamed from: X.EYd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6743EYd {
    public static final TimeZone A00 = TimeZone.getTimeZone("UTC");

    public static int A00(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw BV6.A0k(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw BV6.A0k(FGI.A0M("Invalid number: ", str.substring(i, i2)));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw BV6.A0k(FGI.A0M("Invalid number: ", str.substring(i, i2)));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }

    public static boolean A01(String str, char c, int i) {
        return i < str.length() && str.charAt(i) == c;
    }
}
