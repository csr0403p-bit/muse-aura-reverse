package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public interface G0U<P1, R> extends Ht9<R> {
    R invoke(P1 p1);

    static void A01(G0U g0u) {
        g0u.invoke(new HsJ(Unit.INSTANCE));
    }

    static Object A00(G0U g0u, long j) {
        return g0u.invoke(Long.valueOf(j));
    }
}
