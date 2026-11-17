package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<AuraNavKey> $claimedDeviceDestination$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$4$1(C1BO<? extends AuraNavKey> c1bo, HatchDevicePairingViewModel hatchDevicePairingViewModel, AuraNavigator auraNavigator) {
        super(1);
        this.$claimedDeviceDestination$delegate = c1bo;
        this.$viewModel = hatchDevicePairingViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AuraNavKey value = this.$claimedDeviceDestination$delegate.getValue();
        if (value != null) {
            HatchDevicePairingViewModel hatchDevicePairingViewModel = this.$viewModel;
            AuraNavigator auraNavigator = this.$navigator;
            hatchDevicePairingViewModel.onClaimedDeviceDestinationHandled();
            auraNavigator.navigate(value, false);
        }
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
