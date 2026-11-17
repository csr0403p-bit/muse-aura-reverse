package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class OnboardingGateScreenKt$OnboardingGateScreen$4$1$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingGateScreenKt$OnboardingGateScreen$4$1$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        this.$navigator.navigate((AuraNavKey) ActivationSettingsScreenKey.INSTANCE, false);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
