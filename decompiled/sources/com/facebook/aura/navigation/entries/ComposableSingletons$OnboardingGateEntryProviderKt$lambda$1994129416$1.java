package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C3cG;
import X.C5wL;
import X.G0W;
import com.facebook.aura.navigation.key.OnboardingGateScreenKey;
import com.facebook.aura.onboarding.OnboardingGateViewModel;
import com.facebook.aura.onboarding.view.OnboardingGateScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$OnboardingGateEntryProviderKt$lambda$-1994129416$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OnboardingGateEntryProviderKt$lambda$1994129416$1 extends AbstractC7559F3s implements G0W<OnboardingGateScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$OnboardingGateEntryProviderKt$lambda$1994129416$1 INSTANCE = new ComposableSingletons$OnboardingGateEntryProviderKt$lambda$1994129416$1();

    public ComposableSingletons$OnboardingGateEntryProviderKt$lambda$1994129416$1() {
        super(3);
    }

    public final void invoke(OnboardingGateScreenKey onboardingGateScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        OnboardingGateViewModel.Factory factory = new OnboardingGateViewModel.Factory(AnonymousClass002.A0h(bfm));
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        OnboardingGateScreenKt.OnboardingGateScreen((OnboardingGateViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, C3cG.A0x(OnboardingGateViewModel.class)), null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(OnboardingGateScreenKey onboardingGateScreenKey, BFM bfm, Integer num) {
        invoke(onboardingGateScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
