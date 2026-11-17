package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C01N;
import X.C06G;
import X.C10G;
import X.C1DG;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.shopping.view.ComposableSingletons$InstacartProductDetailsSheetKt$lambda$-1478119592$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$InstacartProductDetailsSheetKt$lambda$1478119592$1 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
    public static final ComposableSingletons$InstacartProductDetailsSheetKt$lambda$1478119592$1 INSTANCE = new ComposableSingletons$InstacartProductDetailsSheetKt$lambda$1478119592$1();

    public ComposableSingletons$InstacartProductDetailsSheetKt$lambda$1478119592$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
        m2018invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m2018invoke8Feqmps(float f, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A04(bfm, f);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            C01N.A07(bfm, C06G.A0N(bfm, C10G.A04(C10G.A02, f)));
        } else {
            bfm.Afo();
        }
    }
}
