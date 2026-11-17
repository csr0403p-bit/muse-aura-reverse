package com.facebook.aura.onboarding.view;

import X.C7438Evz;
import com.facebook.aura.onboarding.OnboardingGreetingVideo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$3$1 extends C7438Evz implements Function0<Unit> {
    public OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$3$1(Object obj) {
        super(0, obj, OnboardingGreetingVideo.class, "onRendered", "onRendered()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnboardingGreetingVideo) this.receiver).onRendered();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
