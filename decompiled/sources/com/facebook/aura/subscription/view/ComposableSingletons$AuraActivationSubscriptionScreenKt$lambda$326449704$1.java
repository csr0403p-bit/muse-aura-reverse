package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$326449704$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$326449704$1 INSTANCE = new ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$326449704$1();

    public ComposableSingletons$AuraActivationSubscriptionScreenKt$lambda$326449704$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraActivationSubscriptionScreenKt.ActivationPlanCardSkeleton(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
