package X;

import java.util.regex.Pattern;

/* renamed from: X.Bzt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3153Bzt {
    public static final Pattern A00 = Pattern.compile("^NOTE([ \t].*)?$");

    public static float A00(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(BV4.A0j(str, str.length() - 1)) / 100.0f;
        }
        throw BV6.A0k("Percentages must end with %");
    }

    public static long A01(String str) {
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : BV4.A1a(strArrSplit[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strA0r = BV6.A0r(strArrSplit, 1);
            if (strA0r.length() != 3) {
                throw C60Q.A0U("Expected 3 decimal places, got: ", strA0r);
            }
            j2 += Long.parseLong(strA0r);
        }
        return j2 * 1000;
    }
}
