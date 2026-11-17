package com.facebook.aura.navigation.entries;

import X.AMP;
import X.ANR;
import X.ANU;
import X.ANi;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.G0U;

/* loaded from: classes4.dex */
public final class AuraTransitionsKt$statusScreenTransitionMetadata$1 extends AbstractC7559F3s implements G0U<ANi<AMP<?>>, ANU> {
    public static final AuraTransitionsKt$statusScreenTransitionMetadata$1 INSTANCE = new AuraTransitionsKt$statusScreenTransitionMetadata$1();

    public AuraTransitionsKt$statusScreenTransitionMetadata$1() {
        super(1);
    }

    @Override // X.G0U
    public final ANU invoke(ANi<AMP<?>> aNi) {
        return ANR.A00(AbstractC1011APs.A05(AuraTransitionsKt.statusEnterScaleSpec, 0.0f, AuraTransitionsKt.pillTransformOrigin).A00(AbstractC1011APs.A04(AuraTransitionsKt.statusEnterFadeSpec, 0.0f)), AbstractC1011APs.A0E(AuraTransitionsKt.statusExitFadeSpec));
    }
}
