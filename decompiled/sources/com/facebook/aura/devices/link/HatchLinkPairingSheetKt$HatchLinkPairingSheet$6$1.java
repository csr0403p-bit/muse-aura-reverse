package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.C8j4;
import X.G0U;
import com.facebook.aura.devices.pairing.HatchDevicePairingStateExtKt;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$6$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchLinkActivePairingSheetKey $activePairingKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<HatchDevicePairingViewState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$6$1(AuraNavigator auraNavigator, HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, C1BO<HatchDevicePairingViewState> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$activePairingKey = hatchLinkActivePairingSheetKey;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C8j4.A1W(this.$state$delegate) && !HatchDevicePairingStateExtKt.isDeviceSelectionStep(C8j4.A0g(this.$state$delegate)) && !this.$navigator.isInBackStack(this.$activePairingKey)) {
            this.$navigator.navigate((AuraNavKey) this.$activePairingKey, false);
        }
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$6$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
