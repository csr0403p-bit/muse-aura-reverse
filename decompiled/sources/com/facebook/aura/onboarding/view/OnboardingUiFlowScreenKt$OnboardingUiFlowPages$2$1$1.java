package com.facebook.aura.onboarding.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2$1$1 extends C7438Evz implements G0U<String, Unit> {
    public OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2$1$1(Object obj) {
        super(1, obj, OnboardingUiFlowViewModel.class, "onAgentNameChange", "onAgentNameChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((OnboardingUiFlowViewModel) AnonymousClass006.A0o(str, this)).onAgentNameChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
