package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class Hy3 {
    public final /* synthetic */ G0U<HzU, Unit> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public Hy3(G0U<? super HzU, Unit> g0u) {
        this.A00 = g0u;
    }

    public final void A00(GNM gnm, List<C10470Hkc> list) {
        G0U<HzU, Unit> g0u = this.A00;
        C7384Etj.A0X(gnm);
        GOD god = new GOD(gnm);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (C10470Hkc c10470Hkc : list) {
            C7384Etj.A0X(c10470Hkc);
            arrayListA0i.add(new Huq(c10470Hkc));
        }
        g0u.invoke(new HzU(god, arrayListA0i));
    }
}
