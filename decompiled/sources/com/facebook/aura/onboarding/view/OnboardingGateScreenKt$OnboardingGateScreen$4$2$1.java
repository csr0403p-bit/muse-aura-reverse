package com.facebook.aura.onboarding.view;

import X.C7438Evz;
import com.facebook.aura.onboarding.OnboardingGateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class OnboardingGateScreenKt$OnboardingGateScreen$4$2$1 extends C7438Evz implements Function0<Unit> {
    public OnboardingGateScreenKt$OnboardingGateScreen$4$2$1(Object obj) {
        super(0, obj, OnboardingGateViewModel.class, "retry", "retry()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnboardingGateViewModel) this.receiver).retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
