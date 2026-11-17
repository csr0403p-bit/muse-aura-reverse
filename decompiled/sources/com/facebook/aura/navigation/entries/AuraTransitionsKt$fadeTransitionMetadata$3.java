package com.facebook.aura.navigation.entries;

import X.AMP;
import X.ANU;
import X.ANi;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C8j3;
import X.G0V;

/* loaded from: classes4.dex */
public final class AuraTransitionsKt$fadeTransitionMetadata$3 extends AbstractC7559F3s implements G0V<ANi<AMP<?>>, Integer, ANU> {
    public static final AuraTransitionsKt$fadeTransitionMetadata$3 INSTANCE = new AuraTransitionsKt$fadeTransitionMetadata$3();

    public AuraTransitionsKt$fadeTransitionMetadata$3() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ ANU invoke(ANi<AMP<?>> aNi, Integer num) {
        AnonymousClass001.A0F(num);
        return C8j3.A0c(AuraTransitionsKt.fadeSpec);
    }

    public final ANU invoke(ANi<AMP<?>> aNi, int i) {
        return C8j3.A0c(AuraTransitionsKt.fadeSpec);
    }
}
