package com.facebook.aura.subscription.view;

import X.C7438Evz;
import com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$4$1 extends C7438Evz implements Function0<Unit> {
    public AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$4$1(Object obj) {
        super(0, obj, AuraComplimentaryRedeemViewModel.class, "dismissFailure", "dismissFailure()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraComplimentaryRedeemViewModel) this.receiver).dismissFailure();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
