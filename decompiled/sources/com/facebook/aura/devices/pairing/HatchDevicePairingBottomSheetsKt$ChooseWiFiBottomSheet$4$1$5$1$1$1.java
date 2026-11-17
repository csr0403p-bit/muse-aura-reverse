package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$5$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ HatchDeviceWiFiNetwork $network;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$5$1$1$1(HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork, HatchDevicePairingActions hatchDevicePairingActions) {
        super(3);
        this.$network = hatchDeviceWiFiNetwork;
        this.$actions = hatchDevicePairingActions;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            String str = this.$network.ssid;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$network, bfm.A67(this.$actions));
            HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
            HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork = this.$network;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$5$1$1$1$1$1(hatchDevicePairingActions, hatchDeviceWiFiNetwork);
                bfm.Ai0(objAaT);
            }
            HatchDevicePairingBottomSheetsKt.WifiListRow(str, (Function0) objAaT, null, Integer.valueOf(HatchDevicePairingBottomSheetsKt.wifiSignalIcon(this.$network.isOpen())), bfm, 0, 4);
            return;
        }
        bfm.Afo();
    }
}
