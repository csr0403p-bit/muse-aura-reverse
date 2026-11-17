package com.facebook.aura.onboarding.view;

import X.C7438Evz;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$4$1 extends C7438Evz implements Function0<Unit> {
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$4$1(Object obj) {
        super(0, obj, OnboardingUiFlowViewModel.class, "onContinueFromName", "onContinueFromName()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnboardingUiFlowViewModel) this.receiver).onContinueFromName();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
