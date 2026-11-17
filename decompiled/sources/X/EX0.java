package X;

import java.math.BigDecimal;

/* loaded from: classes5.dex */
public abstract class EX0 {
    public static BigDecimal A00(String str) {
        A01(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw BV6.A0k(FGI.A0M("Number has unsupported scale: ", str));
    }

    public static void A01(String str) {
        if (str.length() > 10000) {
            throw BV6.A0k(FGI.A0U("Number string too large: ", str.substring(0, 30), "..."));
        }
    }
}
