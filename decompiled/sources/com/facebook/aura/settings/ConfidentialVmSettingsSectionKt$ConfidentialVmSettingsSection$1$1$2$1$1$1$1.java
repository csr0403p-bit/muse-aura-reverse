package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.permissions.defaults.ConfidentialVmToggle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$2$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ ConfidentialVmToggle $toggle;
    public final /* synthetic */ ConfidentialVmSettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$2$1$1$1$1(ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel, ConfidentialVmToggle confidentialVmToggle) {
        super(1);
        this.$viewModel = confidentialVmSettingsViewModel;
        this.$toggle = confidentialVmToggle;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$viewModel.setAllowed(this.$toggle, z);
    }
}
