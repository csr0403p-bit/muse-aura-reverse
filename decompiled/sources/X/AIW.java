package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AIW extends AbstractC2258BHp {
    public static final <K, V> Map<K, V> A0J(HxE<? extends K, ? extends V> hxE) {
        C7384Etj.A0Y(hxE, 0);
        return Collections.singletonMap(hxE.first, hxE.second);
    }

    public static final int A0H(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> A0K(Map<K, V> map) {
        C0924AIa c0924AIa = (C0924AIa) map;
        c0924AIa.A06();
        c0924AIa.isReadOnly = true;
        return c0924AIa.size() <= 0 ? C0924AIa.A00 : c0924AIa;
    }

    public static LinkedHashMap A0I(Map map) {
        return new LinkedHashMap(A0H(map.size()));
    }
}
