package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class ResetConfirmSheetKt$ResetConfirmSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $isExitLogged$delegate;
    public final /* synthetic */ HatchSurface $surface;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetConfirmSheetKt$ResetConfirmSheet$1$1(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, HatchSurface hatchSurface, MutableState<Boolean> mutableState) {
        super(1);
        this.$viewModel = hatchDataPrivacySettingsViewModel;
        this.$surface = hatchSurface;
        this.$isExitLogged$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel = this.$viewModel;
        final HatchSurface hatchSurface = this.$surface;
        final MutableState<Boolean> mutableState = this.$isExitLogged$delegate;
        return new C78g() { // from class: com.facebook.aura.settings.ResetConfirmSheetKt$ResetConfirmSheet$1$1$invoke$$inlined$onDispose$1
            /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
            @Override // X.C78g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void dispose() {
                /*
                    r2 = this;
                    com.facebook.aura.settings.HatchDataPrivacySettingsViewModel r0 = r1
                    X.1BN<com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$DataPrivacyUiState> r0 = r0.uiState
                    java.lang.Object r0 = r0.getValue()
                    com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$DataPrivacyUiState r0 = (com.facebook.aura.settings.HatchDataPrivacySettingsViewModel.DataPrivacyUiState) r0
                    com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$ResetState r1 = r0.resetState
                    boolean r0 = r1 instanceof com.facebook.aura.settings.HatchDataPrivacySettingsViewModel.ResetState.Loading
                    if (r0 != 0) goto L15
                    boolean r0 = r1 instanceof com.facebook.aura.settings.HatchDataPrivacySettingsViewModel.ResetState.Success
                    r1 = 0
                    if (r0 == 0) goto L16
                L15:
                    r1 = 1
                L16:
                    androidx.compose.runtime.MutableState r0 = r3
                    boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
                    if (r0 != 0) goto L27
                    if (r1 != 0) goto L27
                    com.facebook.aura.analytics.hatch.HatchSurface r1 = r2
                    com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.CLOSE_BUTTON
                    com.facebook.aura.settings.ResetConfirmSheetKt.logDismiss(r1, r0)
                L27:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ResetConfirmSheetKt$ResetConfirmSheet$1$1$invoke$$inlined$onDispose$1.dispose():void");
            }
        };
    }
}
