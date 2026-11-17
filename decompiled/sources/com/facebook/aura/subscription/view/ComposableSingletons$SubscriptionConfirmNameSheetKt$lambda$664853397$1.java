package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1DG;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$SubscriptionConfirmNameSheetKt$lambda$664853397$1 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
    public static final ComposableSingletons$SubscriptionConfirmNameSheetKt$lambda$664853397$1 INSTANCE = new ComposableSingletons$SubscriptionConfirmNameSheetKt$lambda$664853397$1();

    public ComposableSingletons$SubscriptionConfirmNameSheetKt$lambda$664853397$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
        m2280invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m2280invoke8Feqmps(float f, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A04(bfm, f);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            SubscriptionSheetHelpersKt.m2284SubscriptionSheetBackgroundorJrPs(f, null, bfm, i & 14, 2);
        } else {
            bfm.Afo();
        }
    }
}
