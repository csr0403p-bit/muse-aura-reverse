package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class AxM {
    public static final BRg A00(BFM bfm, BRg bRg) {
        if (bRg.all(new BUT(16))) {
            return bRg;
        }
        bfm.AgF(1219399079);
        BRg bRg2 = (BRg) bRg.foldIn(BRg.A00, new BUZ(bfm, 1));
        BBI.A0R((BBI) bfm, false);
        return bRg2;
    }

    public static final BRg A02(BRg bRg, G0U<? super ASF, Unit> g0u, G0W<? super BRg, ? super BFM, ? super Integer, ? extends BRg> g0w) {
        return bRg.then(new C2049AxL(g0u, g0w));
    }

    public static final BRg A01(BFM bfm, BRg bRg) {
        bfm.AgE(439770924);
        BRg bRgA00 = A00(bfm, bRg);
        BBI.A0R((BBI) bfm, false);
        return bRgA00;
    }
}
