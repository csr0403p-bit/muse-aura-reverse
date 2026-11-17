package com.facebook.aura.activation.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel;
import com.facebook.aura.user.provider.AgeCheckMethod;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ActivationAgeStepKt$MethodListAgeStep$3$1 extends C7438Evz implements G0V<AgeCheckMethod, Integer, Unit> {
    public ActivationAgeStepKt$MethodListAgeStep$3$1(Object obj) {
        super(2, obj, HatchAgeLinkingViewModel.class, "onAccountPicked", "onAccountPicked(Lcom/facebook/aura/user/provider/AgeCheckMethod;I)V", 0);
    }

    public final void invoke(AgeCheckMethod ageCheckMethod, int i) {
        ((HatchAgeLinkingViewModel) AnonymousClass006.A0o(ageCheckMethod, this)).onAccountPicked(ageCheckMethod, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AgeCheckMethod ageCheckMethod, Integer num) {
        invoke(ageCheckMethod, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
