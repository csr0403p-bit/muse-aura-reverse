package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.onboarding.view.ComposableSingletons$OnboardingGateScreenKt$lambda$-2062125086$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$OnboardingGateScreenKt$lambda$2062125086$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$OnboardingGateScreenKt$lambda$2062125086$1 INSTANCE = new ComposableSingletons$OnboardingGateScreenKt$lambda$2062125086$1();

    public ComposableSingletons$OnboardingGateScreenKt$lambda$2062125086$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            OnboardingErrorStateKt.OnboardingErrorMessage(null, C06G.A0S(bfm), bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
