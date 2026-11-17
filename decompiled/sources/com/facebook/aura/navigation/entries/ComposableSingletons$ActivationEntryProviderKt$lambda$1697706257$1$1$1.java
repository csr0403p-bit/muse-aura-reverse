package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.navigation.key.ActivationScreenKey;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ActivationScreenKey $key;
    public final /* synthetic */ AuraActivationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$1$1(AuraActivationViewModel auraActivationViewModel, ActivationScreenKey activationScreenKey) {
        super(1);
        this.$viewModel = auraActivationViewModel;
        this.$key = activationScreenKey;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.setWearablesStepRequested(this.$key.wearablesStepRequested);
        return new C78g() { // from class: com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
