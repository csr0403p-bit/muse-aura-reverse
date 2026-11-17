package X;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class HzS {
    /* JADX WARN: Incorrect types in method signature: (LX/HoC;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(HtJ htJ, HoC hoC) {
        hoC.A5w(null);
        Object objAPQ = hoC.APQ(htJ);
        return objAPQ != EnumC10460Hji.A02 ? Unit.INSTANCE : objAPQ;
    }

    public static final void A04(C78T c78t) {
        C3b6<HoC> c3b6ADc;
        HoC hoC = (HoC) c78t.get(HoC.A00);
        if (hoC == null || (c3b6ADc = hoC.ADc()) == null) {
            return;
        }
        Iterator<HoC> it = c3b6ADc.iterator();
        while (it.hasNext()) {
            it.next().A5w(null);
        }
    }

    public static final HsS A01(HoC hoC, GBP gbp, boolean z) {
        if (hoC instanceof GBM) {
            return ((GBM) hoC).A0G(gbp, z);
        }
        return hoC.AO6(new C8838Fqo(gbp, 36), gbp.A07(), z);
    }

    public static final HoC A02(C78T c78t) {
        HoC hoC = (HoC) c78t.get(HoC.A00);
        if (hoC != null) {
            return hoC;
        }
        throw AbstractC7607F5u.A10(c78t, "Current context doesn't contain Job in it: ");
    }

    public static final void A03(CancellationException cancellationException, C78T c78t) {
        HoC hoC = (HoC) c78t.get(HoC.A00);
        if (hoC != null) {
            hoC.A5w(cancellationException);
        }
    }

    public static final void A05(C78T c78t) {
        HoC hoC = (HoC) c78t.get(HoC.A00);
        if (hoC != null && !hoC.isActive()) {
            throw hoC.ADQ();
        }
    }

    public static final boolean A06(C78T c78t) {
        HoC hoC = (HoC) c78t.get(HoC.A00);
        if (hoC != null) {
            return hoC.isActive();
        }
        return true;
    }
}
