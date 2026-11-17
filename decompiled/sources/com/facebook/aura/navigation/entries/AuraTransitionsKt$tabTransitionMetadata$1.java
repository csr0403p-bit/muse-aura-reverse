package com.facebook.aura.navigation.entries;

import X.AMP;
import X.ANU;
import X.ANi;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import com.facebook.aura.navigation.AuraPageSceneStrategyKt;

/* loaded from: classes4.dex */
public final class AuraTransitionsKt$tabTransitionMetadata$1 extends AbstractC7559F3s implements G0U<ANi<AMP<?>>, ANU> {
    public static final AuraTransitionsKt$tabTransitionMetadata$1 INSTANCE = new AuraTransitionsKt$tabTransitionMetadata$1();

    public AuraTransitionsKt$tabTransitionMetadata$1() {
        super(1);
    }

    @Override // X.G0U
    public final ANU invoke(ANi<AMP<?>> aNi) {
        C7384Etj.A0Y(aNi, 0);
        ANU anuDeferredPageRevealTransition = AuraPageSceneStrategyKt.deferredPageRevealTransition(aNi);
        return anuDeferredPageRevealTransition == null ? C8j4.A0S() : anuDeferredPageRevealTransition;
    }
}
