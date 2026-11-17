package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $messageText;
    public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$5$1(OnboardingUiFlowViewModel onboardingUiFlowViewModel, Context context, String str) {
        super(0);
        this.$viewModel = onboardingUiFlowViewModel;
        this.$context = context;
        this.$messageText = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onFinish(this.$context, this.$messageText);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
