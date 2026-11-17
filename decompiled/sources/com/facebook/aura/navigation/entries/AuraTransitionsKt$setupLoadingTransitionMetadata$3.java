package com.facebook.aura.navigation.entries;

import X.AMP;
import X.ANU;
import X.ANi;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes4.dex */
public final class AuraTransitionsKt$setupLoadingTransitionMetadata$3 extends AbstractC7559F3s implements G0V<ANi<AMP<?>>, Integer, ANU> {
    public static final AuraTransitionsKt$setupLoadingTransitionMetadata$3 INSTANCE = new AuraTransitionsKt$setupLoadingTransitionMetadata$3();

    public AuraTransitionsKt$setupLoadingTransitionMetadata$3() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ ANU invoke(ANi<AMP<?>> aNi, Integer num) {
        ANi<AMP<?>> aNi2 = aNi;
        AnonymousClass005.A0w(num);
        C7384Etj.A0Y(aNi2, 0);
        return AuraTransitionsKt.setupLoadingTransition(aNi2);
    }

    public final ANU invoke(ANi<AMP<?>> aNi, int i) {
        C7384Etj.A0Y(aNi, 0);
        return AuraTransitionsKt.setupLoadingTransition(aNi);
    }
}
