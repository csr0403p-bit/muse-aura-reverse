package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0W;
import com.facebook.aura.devices.intf.ClaimedDeviceRow;
import com.facebook.aura.devices.intf.DeviceRowBadge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ HatchDiscoveredDevice $device;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1$1$1(HatchDiscoveredDevice hatchDiscoveredDevice, HatchDevicePairingActions hatchDevicePairingActions) {
        super(3);
        this.$device = hatchDiscoveredDevice;
        this.$actions = hatchDevicePairingActions;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            String str = this.$device.name;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$device, bfm.A67(this.$actions));
            HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
            HatchDiscoveredDevice hatchDiscoveredDevice = this.$device;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$DeviceFoundContent$1$4$1$1$1$1$1(hatchDevicePairingActions, hatchDiscoveredDevice);
                bfm.Ai0(objAaT);
            }
            HatchDiscoveredDevice hatchDiscoveredDevice2 = this.$device;
            HatchDevicePairingBottomSheetsKt.PairingDeviceRow(str, (Function0) objAaT, null, false, false, hatchDiscoveredDevice2.claim, hatchDiscoveredDevice2.badge, bfm, (ClaimedDeviceRow.$stable << 15) | (DeviceRowBadge.$stable << 18), 28);
            return;
        }
        bfm.Afo();
    }
}
