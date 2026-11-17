package com.facebook.aura.flights;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.C1DG;
import X.C3U4;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$FlightDetailScreenKt$lambda$146489947$1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public static final ComposableSingletons$FlightDetailScreenKt$lambda$146489947$1 INSTANCE = new ComposableSingletons$FlightDetailScreenKt$lambda$146489947$1();

    public ComposableSingletons$FlightDetailScreenKt$lambda$146489947$1() {
        super(4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m941invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    public final void m941invokei1RSzL4(float f, float f2, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A04(bfm, f);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 131, 130), bfm, i)) {
            HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a42), null, C3U4.A04(C10G.A01, f), null, null, null, null, bfm, 0, 122);
        } else {
            bfm.Afo();
        }
    }
}
