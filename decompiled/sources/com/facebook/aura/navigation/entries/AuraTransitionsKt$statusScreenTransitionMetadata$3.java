package com.facebook.aura.navigation.entries;

import X.AMP;
import X.ANR;
import X.ANU;
import X.ANi;
import X.ASj;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;

/* loaded from: classes4.dex */
public final class AuraTransitionsKt$statusScreenTransitionMetadata$3 extends AbstractC7559F3s implements G0V<ANi<AMP<?>>, Integer, ANU> {
    public static final AuraTransitionsKt$statusScreenTransitionMetadata$3 INSTANCE = new AuraTransitionsKt$statusScreenTransitionMetadata$3();

    public AuraTransitionsKt$statusScreenTransitionMetadata$3() {
        super(2);
    }

    public final ANU invoke(ANi<AMP<?>> aNi, int i) {
        ASj<Float> aSj = AuraTransitionsKt.statusExitFadeSpec;
        return ANR.A00(AbstractC1011APs.A04(aSj, 0.0f), AbstractC1011APs.A0F(AuraTransitionsKt.statusExitScaleSpec, 0.0f, AuraTransitionsKt.pillTransformOrigin).A00(AbstractC1011APs.A0E(aSj)));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ ANU invoke(ANi<AMP<?>> aNi, Integer num) {
        return invoke(aNi, AnonymousClass001.A0F(num));
    }
}
