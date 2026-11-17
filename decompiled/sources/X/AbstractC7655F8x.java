package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.F8x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7655F8x {
    public static Object A00(F94 f94) {
        Integer numAXl = f94.AXl();
        if (numAXl == C79.A0C) {
            return A01(f94);
        }
        if (numAXl == C79.A00) {
            ArrayList arrayListA0h = C3cG.A0h();
            while (f94.ARK() != C79.A01) {
                arrayListA0h.add(A00(f94));
            }
            return arrayListA0h;
        }
        if (numAXl == C79.A0c) {
            return null;
        }
        if (numAXl == C79.A0Z) {
            return F94.A00(f94);
        }
        if (numAXl == C79.A0Y) {
            Number numberARX = f94.AXm().ARX();
            return numberARX instanceof Long ? Long.valueOf(numberARX.longValue()) : Double.valueOf(numberARX.doubleValue());
        }
        if (numAXl == C79.A0T) {
            return f94.AXm().AgW();
        }
        if (numAXl == C79.A0W) {
            return F93.A00(null, f94.AXm());
        }
        throw BV5.A0U("unsupported token type ", HqV.A00(numAXl));
    }

    public static HashMap A01(F94 f94) {
        if (f94.AXl() != C79.A0C) {
            return null;
        }
        HashMap mapA0u = BV4.A0u();
        while (f94.ARK() != C79.A0K) {
            String strAXk = f94.AXk();
            f94.ARK();
            mapA0u.put(strAXk, A00(f94));
        }
        return mapA0u;
    }
}
