package X;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.BxD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3074BxD {
    public static final Pattern A01 = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern A00 = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long A01(String str, String str2) throws NumberFormatException {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                CNC.A02("HttpUtil", FGI.A0U("Unexpected Content-Length [", str, "]"));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = A01.matcher(str2);
            if (matcher.matches()) {
                try {
                    long jA0M = (BV8.A0M(matcher, 2) - BV8.A0M(matcher, 1)) + 1;
                    if (j < 0) {
                        return jA0M;
                    }
                    if (j != jA0M) {
                        CNC.A04("HttpUtil", FGI.A0h("Inconsistent headers [", str, "] [", str2, "]"));
                        return Math.max(j, jA0M);
                    }
                } catch (NumberFormatException unused2) {
                    CNC.A02("HttpUtil", FGI.A0U("Unexpected Content-Range [", str2, "]"));
                }
            }
        }
        return j;
    }

    public static String A02(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sbA0z = C60O.A0z("bytes=", j);
        sbA0z.append("-");
        if (j2 != -1) {
            sbA0z.append(BV7.A0S(j, j2));
        }
        return sbA0z.toString();
    }

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = A00.matcher(str);
        if (matcher.matches()) {
            return BV8.A0M(matcher, 1);
        }
        return -1L;
    }
}
