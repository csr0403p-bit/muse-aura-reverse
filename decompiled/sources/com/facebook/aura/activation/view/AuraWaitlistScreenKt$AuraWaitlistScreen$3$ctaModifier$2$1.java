package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C2av;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$AuraWaitlistScreen$3$ctaModifier$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AuraWaitlistCelebrationState $celebrationState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.AeX(C3cH.A00(this.$celebrationState.ctaScale));
        c2av.AeY(C3cH.A00(this.$celebrationState.ctaScale));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$AuraWaitlistScreen$3$ctaModifier$2$1(AuraWaitlistCelebrationState auraWaitlistCelebrationState) {
        super(1);
        this.$celebrationState = auraWaitlistCelebrationState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
