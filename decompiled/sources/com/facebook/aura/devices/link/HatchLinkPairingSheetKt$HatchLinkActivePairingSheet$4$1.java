package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.C8j4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.devices.pairing.HatchDevicePairingStateExtKt;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<HatchDevicePairingViewState> $state$delegate;
    public final /* synthetic */ MutableState<Boolean> $terminalNavigationHandled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$4$1(AuraNavigator auraNavigator, MutableState<Boolean> mutableState, C1BO<HatchDevicePairingViewState> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$terminalNavigationHandled$delegate = mutableState;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!MutableState.A0A((MutableState) this.$terminalNavigationHandled$delegate)) {
            if (!C8j4.A1W(this.$state$delegate)) {
                this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
            } else if (HatchDevicePairingStateExtKt.isDeviceSelectionStep(C8j4.A0g(this.$state$delegate))) {
                this.$navigator.back();
            }
        }
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
