package com.facebook.aura.activation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$WaitlistHeader$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ MutableState<Float> $alpha$delegate;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ MutableState<Float> $offsetY$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Af6(this.$density.Ah4(AnonymousClass001.A02(this.$offsetY$delegate.getValue())));
        c2av.Acj(AnonymousClass001.A02(this.$alpha$delegate.getValue()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$WaitlistHeader$2$1(AXN axn, MutableState<Float> mutableState, MutableState<Float> mutableState2) {
        super(1);
        this.$density = axn;
        this.$offsetY$delegate = mutableState;
        this.$alpha$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
