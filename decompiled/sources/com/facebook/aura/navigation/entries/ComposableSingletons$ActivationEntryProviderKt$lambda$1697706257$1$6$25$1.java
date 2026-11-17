package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$25$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraActivationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$25$1(AuraActivationViewModel auraActivationViewModel) {
        super(0);
        this.$viewModel = auraActivationViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.refresh(true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
