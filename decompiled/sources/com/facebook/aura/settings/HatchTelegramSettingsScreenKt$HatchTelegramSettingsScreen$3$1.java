package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$HatchTelegramSettingsScreen$3$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ C1BO<HatchTelegramUiState> $uiState$delegate;
    public final /* synthetic */ HatchTelegramViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        if (this.$uiState$delegate.getValue().connectPhase == TelegramConnectPhase.AWAITING_RETURN) {
            this.$viewModel.onResumeFromTelegram();
        }
        return new InterfaceC06807bD() { // from class: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$HatchTelegramSettingsScreen$3$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTelegramSettingsScreenKt$HatchTelegramSettingsScreen$3$1(HatchTelegramViewModel hatchTelegramViewModel, C1BO<HatchTelegramUiState> c1bo) {
        super(1);
        this.$viewModel = hatchTelegramViewModel;
        this.$uiState$delegate = c1bo;
    }
}
