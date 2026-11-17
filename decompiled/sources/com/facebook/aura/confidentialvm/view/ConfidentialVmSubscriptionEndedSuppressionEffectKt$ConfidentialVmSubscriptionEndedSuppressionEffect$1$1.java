package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedPromptViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmSubscriptionEndedSuppressionEffectKt$ConfidentialVmSubscriptionEndedSuppressionEffect$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isSuppressed;
    public final /* synthetic */ ConfidentialVmSubscriptionEndedPromptViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSubscriptionEndedSuppressionEffectKt$ConfidentialVmSubscriptionEndedSuppressionEffect$1$1(ConfidentialVmSubscriptionEndedPromptViewModel confidentialVmSubscriptionEndedPromptViewModel, boolean z) {
        super(0);
        this.$viewModel = confidentialVmSubscriptionEndedPromptViewModel;
        this.$isSuppressed = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onSuppressionChanged(this.$isSuppressed);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
