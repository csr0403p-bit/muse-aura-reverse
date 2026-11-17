package com.facebook.aura.vmavailability.content;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import com.facebook.aura.vmavailability.VmUnavailableViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VmUnavailableOverlayContentKt$VmUnavailableOverlayContent$2$1$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ VmUnavailableViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        C7384Etj.A0Y(headerButton, 0);
        if (headerButton == HeaderButton.Settings) {
            this.$viewModel.onSettingsVisibilityChanged(true);
            this.$navigator.navigate((AuraNavKey) ActivationSettingsScreenKey.INSTANCE, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmUnavailableOverlayContentKt$VmUnavailableOverlayContent$2$1$1(VmUnavailableViewModel vmUnavailableViewModel, AuraNavigator auraNavigator) {
        super(1);
        this.$viewModel = vmUnavailableViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
