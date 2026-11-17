package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.library.view.ComposableSingletons$GoalsCompletedScreenKt$lambda$-1492621787$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$GoalsCompletedScreenKt$lambda$1492621787$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$GoalsCompletedScreenKt$lambda$1492621787$1 INSTANCE = new ComposableSingletons$GoalsCompletedScreenKt$lambda$1492621787$1();

    public ComposableSingletons$GoalsCompletedScreenKt$lambda$1492621787$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
        } else {
            bfm.Afo();
        }
    }
}
