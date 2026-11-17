package com.facebook.aura.navigation.entries;

import X.AMP;
import X.ANU;
import X.ANi;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class AuraTransitionsKt$pushTransitionMetadata$2 extends AbstractC7559F3s implements G0U<ANi<AMP<?>>, ANU> {
    public static final AuraTransitionsKt$pushTransitionMetadata$2 INSTANCE = new AuraTransitionsKt$pushTransitionMetadata$2();

    public AuraTransitionsKt$pushTransitionMetadata$2() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ ANU invoke(ANi<AMP<?>> aNi) {
        ANi<AMP<?>> aNi2 = aNi;
        C7384Etj.A0Y(aNi2, 0);
        return AuraTransitionsKt.pushTransition(aNi2, true);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final ANU invoke2(ANi<AMP<?>> aNi) {
        C7384Etj.A0Y(aNi, 0);
        return AuraTransitionsKt.pushTransition(aNi, true);
    }
}
