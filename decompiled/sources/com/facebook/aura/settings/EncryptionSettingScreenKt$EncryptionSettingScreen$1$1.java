package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;

/* loaded from: classes.dex */
public final class EncryptionSettingScreenKt$EncryptionSettingScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $isViewLogged$delegate;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionSettingScreenKt$EncryptionSettingScreen$1$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$isViewLogged$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!MutableState.A0A((MutableState) this.$isViewLogged$delegate)) {
            MutableState.A09(true, this.$isViewLogged$delegate);
            HatchClientCvmEventLogger.INSTANCE.logCvmEncryptionSettingsView();
        }
        return new C78g() { // from class: com.facebook.aura.settings.EncryptionSettingScreenKt$EncryptionSettingScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
