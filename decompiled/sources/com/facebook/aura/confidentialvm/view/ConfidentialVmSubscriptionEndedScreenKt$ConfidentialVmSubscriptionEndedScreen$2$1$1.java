package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$2$1$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$2$1$1(Object obj) {
        super(0, obj, ConfidentialVmSubscriptionEndedViewModel.class, "onMenuClick", "onMenuClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmSubscriptionEndedViewModel) this.receiver).onMenuClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
