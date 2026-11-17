package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public abstract class Hxb {
    public static final HzC A01() {
        C8eO c8eO = new C8eO(null);
        GBK gbk = AbstractC9266GBt.A00;
        return new HzC(C78W.A02(c8eO, AbstractC7429Evm.A00));
    }

    public static final <R> Object A00(G0V<? super C3UX, ? super HtJ<? super R>, ? extends Object> g0v, HtJ<? super R> htJ) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBM.A00;
        GAk gAk = new GAk(htJ, htJ.getContext());
        return GAj.A00(gAk, g0v, gAk, true);
    }

    public static final HzC A02(C78T c78t) {
        if (c78t.get(HoC.A00) == null) {
            c78t = c78t.plus(new C9250GBd(null));
        }
        return new HzC(c78t);
    }

    public static final void A03(CancellationException cancellationException, C3UX c3ux) {
        HoC hoC = (HoC) C3cH.A0t(c3ux);
        if (hoC == null) {
            throw AbstractC7607F5u.A10(c3ux, "Scope cannot be cancelled because it does not have a job: ");
        }
        hoC.A5w(cancellationException);
    }

    public static final boolean A04(C3UX c3ux) {
        HoC hoC = (HoC) C3cH.A0t(c3ux);
        if (hoC != null) {
            return hoC.isActive();
        }
        return true;
    }
}
