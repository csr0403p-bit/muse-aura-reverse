package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchLinkActivePairingSheetKey $activePairingKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$1$1(AuraNavigator auraNavigator, HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, HatchDevicePairingViewModel hatchDevicePairingViewModel, String str) {
        super(1);
        this.$navigator = auraNavigator;
        this.$activePairingKey = hatchLinkActivePairingSheetKey;
        this.$viewModel = hatchDevicePairingViewModel;
        this.$presentationId = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AuraNavigator auraNavigator = this.$navigator;
        final HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey = this.$activePairingKey;
        final HatchDevicePairingViewModel hatchDevicePairingViewModel = this.$viewModel;
        final String str = this.$presentationId;
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (auraNavigator.isInBackStack(new HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$1$1$1$discoveryOpen$1(str)) || auraNavigator.isInBackStack(hatchLinkActivePairingSheetKey)) {
                    return;
                }
                hatchDevicePairingViewModel.onPairingPresentationClosed(str);
            }
        };
    }
}
