package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistPresentationKt$HatchAssistPresentation$1$2$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AssistIdentityState $identityState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(1.0f - C1BO.A01(this.$identityState.progress));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistPresentationKt$HatchAssistPresentation$1$2$1$1$1(AssistIdentityState assistIdentityState) {
        super(1);
        this.$identityState = assistIdentityState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
