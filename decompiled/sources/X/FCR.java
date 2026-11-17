package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FCR {
    public static final HashMap<Integer, Integer> A03 = BV4.A0u();
    public final int A00 = 38;
    public final int A01;
    public final G0U<FDW, Object> A02;

    public FCR(G0U g0u, int i) {
        this.A01 = i;
        this.A02 = g0u;
    }

    public static final FCR A00(G0U g0u) {
        int iIntValue;
        HashMap<Integer, Integer> map = A03;
        synchronized (map) {
            Integer num = map.get(38);
            iIntValue = num != null ? num.intValue() : 0;
            C8j4.A1O(38, map, iIntValue + 1);
        }
        if (iIntValue <= 63) {
            return new FCR(g0u, iIntValue);
        }
        throw BV5.A0Q("More than 64 projections of attribute ", 38);
    }
}
