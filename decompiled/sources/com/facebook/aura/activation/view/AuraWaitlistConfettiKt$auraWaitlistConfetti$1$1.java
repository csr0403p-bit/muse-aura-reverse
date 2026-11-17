package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.BLU;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraWaitlistConfettiKt$auraWaitlistConfetti$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ MutableState<BLU> $surfaceBoundsInRoot$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        MutableState<BLU> mutableState = this.$surfaceBoundsInRoot$delegate;
        BLU bluA02 = c2ld.A02();
        float f = AuraWaitlistConfettiKt.CtaPunchScale;
        mutableState.Af8(bluA02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistConfettiKt$auraWaitlistConfetti$1$1(MutableState<BLU> mutableState) {
        super(1);
        this.$surfaceBoundsInRoot$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
