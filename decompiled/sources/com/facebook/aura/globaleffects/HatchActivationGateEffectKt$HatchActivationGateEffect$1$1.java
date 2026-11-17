package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.activation.model.HatchActivationGateViewModel;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ActivationScreenKey;

/* loaded from: classes2.dex */
public final class HatchActivationGateEffectKt$HatchActivationGateEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Boolean> $isGateRequired$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchActivationGateViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivationGateEffectKt$HatchActivationGateEffect$1$1(AuraNavigator auraNavigator, HatchActivationGateViewModel hatchActivationGateViewModel, C1BO<Boolean> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$viewModel = hatchActivationGateViewModel;
        this.$isGateRequired$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C1BO.A0F(this.$isGateRequired$delegate) && !(this.$navigator.currentKey(false) instanceof ActivationScreenKey)) {
            AgeCheckFunnelLogging.INSTANCE.onInAppRegate();
            this.$navigator.navigate(new ActivationScreenKey(false, false, null, false, null), LaunchFlag.REPLACE_BACKSTACK);
        }
        return new C78g() { // from class: com.facebook.aura.globaleffects.HatchActivationGateEffectKt$HatchActivationGateEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
