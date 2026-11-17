package X;

import android.util.Log;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DEX {
    public static final DEX A00 = new DEX();

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/Map<Ljava/lang/String;+Ljava/util/List<Ljava/lang/String;>;>;I)J */
    public static final long A02(Map map, int i, int i2) {
        if (i == 400 || i == 401 || i == 403) {
            return -9223372036854775807L;
        }
        if (i == 404) {
            String strA03 = A03(map, "x-fb-one-variant");
            if (strA03 != null && C7BY.A0q(strA03, "-RE", false)) {
                return -9223372036854775807L;
            }
        } else {
            if (i == 410 || i == 416) {
                return -9223372036854775807L;
            }
            if (i != 429) {
                if (i == 502) {
                    return -9223372036854775807L;
                }
                if (i == 503) {
                    long jA00 = A00(map);
                    if (jA00 != -1) {
                        return Math.min(jA00 * 1000, 60000L);
                    }
                }
            } else if (i2 == 1) {
                return 1000L;
            }
        }
        if (i2 <= 0) {
            i2 = 1;
        }
        return BV4.A01(BV6.A0H(i2 - 1) + 500, 5000L);
    }

    public static final int A00(Map<String, ? extends List<String>> map) throws NumberFormatException {
        String strA03 = A03(map, "Retry-After");
        if (strA03 != null) {
            try {
                int i = Integer.parseInt(strA03);
                if (i >= 0) {
                    return i;
                }
            } catch (NumberFormatException e) {
                Log.w("OneSemanticUtil", FGI.A0M("Malformed x-fb-one retry-after header: ", strA03), e);
            }
        }
        return -1;
    }

    public static final String A03(Map<String, ? extends List<String>> map, String str) {
        List listA0z;
        if (map == null || (listA0z = BV4.A0z(str, map)) == null || listA0z.isEmpty()) {
            return null;
        }
        return (String) C8j4.A0p(listA0z);
    }

    public static final boolean A04(Map map, int i) {
        if (i <= 0 || A01(map) > i) {
            return "".length() != 0 && A01(map) <= Integer.parseInt("");
        }
        return true;
    }

    public static final int A01(Map<String, ? extends List<String>> map) {
        String strA03 = A03(map, "x-fb-one");
        if (strA03 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return Integer.parseInt(strA03);
        } catch (NumberFormatException e) {
            Log.w("OneSemanticUtil", FGI.A0M("Malformed x-fb-one wave header: ", strA03), e);
            return Integer.MAX_VALUE;
        }
    }
}
