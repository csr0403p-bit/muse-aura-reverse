package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.settings.HatchWhatsAppUiState;
import com.facebook.aura.settings.HatchWhatsAppViewModel;
import com.facebook.aura.settings.WhatsAppConnectPhase;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$WhatsAppConnectContent$3$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ C1BO<HatchWhatsAppUiState> $uiState$delegate;
    public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        if (this.$uiState$delegate.getValue().connectPhase == WhatsAppConnectPhase.AWAITING_RETURN) {
            this.$viewModel.onResumeFromWhatsApp();
        }
        return new InterfaceC06807bD() { // from class: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$WhatsAppConnectContent$3$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$WhatsAppConnectContent$3$1(HatchWhatsAppViewModel hatchWhatsAppViewModel, C1BO<HatchWhatsAppUiState> c1bo) {
        super(1);
        this.$viewModel = hatchWhatsAppViewModel;
        this.$uiState$delegate = c1bo;
    }
}
