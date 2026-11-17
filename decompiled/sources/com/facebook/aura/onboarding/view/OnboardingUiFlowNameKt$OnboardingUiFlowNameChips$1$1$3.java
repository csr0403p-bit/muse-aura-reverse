package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1822Arm;
import X.G0V;

/* loaded from: classes.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
    public static final OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3 INSTANCE = new OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3();

    public OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final C1822Arm invoke(BFM bfm, int i) {
        bfm.AgE(-326329153);
        C1822Arm chip = OnboardingUiFlowTypography.INSTANCE.getChip(bfm, 6);
        AnonymousClass002.A19(bfm);
        return chip;
    }
}
