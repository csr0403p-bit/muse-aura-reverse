package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.settings.HatchMessengerViewModel;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$MessengerConnectContent$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchMessengerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$MessengerConnectContent$1$1(HatchMessengerViewModel hatchMessengerViewModel) {
        super(1);
        this.$viewModel = hatchMessengerViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.fetchStatus();
        this.$viewModel.fetchLinkedFBAccounts();
        return new C78g() { // from class: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$MessengerConnectContent$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
