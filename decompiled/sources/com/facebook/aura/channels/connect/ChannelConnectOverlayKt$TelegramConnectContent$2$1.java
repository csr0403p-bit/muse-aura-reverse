package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.settings.HatchTelegramUiState;
import com.facebook.aura.settings.HatchTelegramViewModel;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$TelegramConnectContent$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $hasStartedLoading$delegate;
    public final /* synthetic */ C1BO<HatchTelegramUiState> $uiState$delegate;
    public final /* synthetic */ HatchTelegramViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$TelegramConnectContent$2$1(HatchTelegramViewModel hatchTelegramViewModel, MutableState<Boolean> mutableState, C1BO<HatchTelegramUiState> c1bo) {
        super(1);
        this.$viewModel = hatchTelegramViewModel;
        this.$hasStartedLoading$delegate = mutableState;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (MutableState.A0A((MutableState) this.$hasStartedLoading$delegate) && !this.$uiState$delegate.getValue().isLoading && !this.$uiState$delegate.getValue().isLinked) {
            this.$viewModel.showOnboarding();
        }
        return new C78g() { // from class: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$TelegramConnectContent$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
