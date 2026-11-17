package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.content.Context;
import com.facebook.aura.devices.pairing.HatchDeviceBlePermissionEffectKt;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingMode;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingTriggerSource;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;
import com.facebook.aura.navigation.key.HatchLinkPairingPurpose;
import com.facebook.aura.navigation.key.HatchLinkPairingSheetKey;
import com.facebook.aura.settings.HatchPendingPairAgain;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchLinkActivePairingSheetKey $activePairingKey;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchLinkPairingSheetKey $discoveryKey;
    public final /* synthetic */ boolean $fromDeeplink;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchLinkPairingPurpose $pairingPurpose;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $setUpAgainAddress;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$1$1(Context context, boolean z, HatchLinkPairingPurpose hatchLinkPairingPurpose, HatchDevicePairingViewModel hatchDevicePairingViewModel, String str, String str2, AuraNavigator auraNavigator, HatchLinkPairingSheetKey hatchLinkPairingSheetKey, HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey) {
        super(1);
        this.$context = context;
        this.$fromDeeplink = z;
        this.$pairingPurpose = hatchLinkPairingPurpose;
        this.$viewModel = hatchDevicePairingViewModel;
        this.$presentationId = str;
        this.$setUpAgainAddress = str2;
        this.$navigator = auraNavigator;
        this.$discoveryKey = hatchLinkPairingSheetKey;
        this.$activePairingKey = hatchLinkActivePairingSheetKey;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.showPairingFlow(this.$presentationId, this.$fromDeeplink ? HatchDevicePairingTriggerSource.DEEPLINK : HatchDevicePairingTriggerSource.MANUAL, this.$pairingPurpose == HatchLinkPairingPurpose.PAIR_AGAIN ? HatchDevicePairingMode.REPAIR : HatchDevicePairingMode.FIRST_TIME, HatchDeviceBlePermissionEffectKt.hasHatchDeviceBlePermissions(this.$context), this.$setUpAgainAddress);
        final AuraNavigator auraNavigator = this.$navigator;
        final HatchLinkPairingSheetKey hatchLinkPairingSheetKey = this.$discoveryKey;
        final HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey = this.$activePairingKey;
        final HatchDevicePairingViewModel hatchDevicePairingViewModel = this.$viewModel;
        final String str = this.$presentationId;
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchPendingPairAgain.autoSelectTarget = null;
                if (auraNavigator.isInBackStack(hatchLinkPairingSheetKey) || auraNavigator.isInBackStack(hatchLinkActivePairingSheetKey)) {
                    return;
                }
                hatchDevicePairingViewModel.onPairingPresentationClosed(str);
            }
        };
    }
}
