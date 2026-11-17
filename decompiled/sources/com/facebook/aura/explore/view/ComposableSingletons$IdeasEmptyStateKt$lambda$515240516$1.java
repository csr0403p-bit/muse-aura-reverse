package com.facebook.aura.explore.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.C0AU;
import X.C1Z5;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchScreenEmptyStateKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$IdeasEmptyStateKt$lambda$515240516$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$IdeasEmptyStateKt$lambda$515240516$1 INSTANCE = new ComposableSingletons$IdeasEmptyStateKt$lambda$515240516$1();

    public ComposableSingletons$IdeasEmptyStateKt$lambda$515240516$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        C7384Etj.A0Y(anonymousClass037, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, anonymousClass037);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120254);
            C0AU c0au = (C0AU) anonymousClass037;
            C1Z5 c1z5 = new C1Z5(c0au.A01, c0au.A00, "fillParentMaxSize", 1.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$IdeasEmptyStateKt$lambda$515240516$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            HatchScreenEmptyStateKt.HatchScreenEmptyState(strA01, AnonymousClass001.A0Y(c1z5, objAaT, false), null, null, bfm, 0, 12);
            return;
        }
        bfm.Afo();
    }
}
