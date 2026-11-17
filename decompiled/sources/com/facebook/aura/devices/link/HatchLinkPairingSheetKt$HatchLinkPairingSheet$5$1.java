package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.devices.pairing.HatchDiscoveredDevice;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $autoSelectConsumed$delegate;
    public final /* synthetic */ String $autoTarget;
    public final /* synthetic */ C1BO<HatchDevicePairingViewState> $state$delegate;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$5$1(String str, HatchDevicePairingViewModel hatchDevicePairingViewModel, MutableState<Boolean> mutableState, C1BO<HatchDevicePairingViewState> c1bo) {
        super(1);
        this.$autoTarget = str;
        this.$viewModel = hatchDevicePairingViewModel;
        this.$autoSelectConsumed$delegate = mutableState;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchDiscoveredDevice next;
        String str = this.$autoTarget;
        if (str != null && !MutableState.A0A((MutableState) this.$autoSelectConsumed$delegate)) {
            Iterator<HatchDiscoveredDevice> it = this.$state$delegate.getValue().getDiscoveredDevices().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str2 = next.name;
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    break;
                }
            }
            HatchDiscoveredDevice hatchDiscoveredDevice = next;
            if (hatchDiscoveredDevice != null) {
                MutableState.A09(true, this.$autoSelectConsumed$delegate);
                this.$viewModel.selectDevice(hatchDiscoveredDevice.address);
            }
        }
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
