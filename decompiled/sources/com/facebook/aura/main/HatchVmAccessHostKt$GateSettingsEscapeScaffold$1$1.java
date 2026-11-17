package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchVmAccessHostKt$GateSettingsEscapeScaffold$1$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        C7384Etj.A0Y(headerButton, 0);
        if (headerButton == HeaderButton.Settings) {
            this.$navigator.navigate((AuraNavKey) ActivationSettingsScreenKey.INSTANCE, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessHostKt$GateSettingsEscapeScaffold$1$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
