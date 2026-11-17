package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.C8j4;
import X.G0U;
import com.facebook.aura.devices.pairing.HatchDevicePairingStep;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$7$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ C1BO<HatchDevicePairingViewState> $state$delegate;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$7$1(HatchDevicePairingViewModel hatchDevicePairingViewModel, String str, C1BO<HatchDevicePairingViewState> c1bo) {
        super(1);
        this.$viewModel = hatchDevicePairingViewModel;
        this.$presentationId = str;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C8j4.A1W(this.$state$delegate) && C8j4.A0g(this.$state$delegate) == HatchDevicePairingStep.LINK_INFO) {
            this.$viewModel.onLinkInfoShown(this.$presentationId);
        }
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$7$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
