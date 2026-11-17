package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class BPg<T> {
    public static final <V> void A01(BFM bfm, V v, G0V<? super T, ? super V, Unit> g0v) {
        if (((BBI) bfm).A0M) {
            bfm.A4P(v, g0v);
        }
    }

    public static final <V> void A02(BFM bfm, V v, G0V<? super T, ? super V, Unit> g0v) {
        if (((BBI) bfm).A0M || !C7384Etj.areEqual(bfm.AaT(), v)) {
            bfm.Ai0(v);
            bfm.A4P(v, g0v);
        }
    }

    public static void A00(BFM bfm, Object obj, int i) {
        A02(bfm, obj, new BUR(i));
    }

    public static final void A03(BFM bfm, G0U<? super T, Unit> g0u) {
        bfm.A4P(Unit.INSTANCE, new C2296BSw(g0u, 15));
    }
}
