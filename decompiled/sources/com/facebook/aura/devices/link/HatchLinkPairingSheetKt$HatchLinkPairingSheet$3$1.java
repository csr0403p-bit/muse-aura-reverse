package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.C8j4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchLinkActivePairingSheetKey $activePairingKey;
    public final /* synthetic */ MutableState<Boolean> $hasRequestedPermissions$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ Function0<Unit> $requestBlePermissions;
    public final /* synthetic */ C1BO<HatchDevicePairingViewState> $state$delegate;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$3$1(HatchDevicePairingViewModel hatchDevicePairingViewModel, String str, Function0<Unit> function0, AuraNavigator auraNavigator, HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, C1BO<HatchDevicePairingViewState> c1bo, MutableState<Boolean> mutableState) {
        super(1);
        this.$viewModel = hatchDevicePairingViewModel;
        this.$presentationId = str;
        this.$requestBlePermissions = function0;
        this.$navigator = auraNavigator;
        this.$activePairingKey = hatchLinkActivePairingSheetKey;
        this.$state$delegate = c1bo;
        this.$hasRequestedPermissions$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C8j4.A1W(this.$state$delegate)) {
            if (!this.$state$delegate.getValue().getBlePermissionsGranted() && !MutableState.A0A((MutableState) this.$hasRequestedPermissions$delegate)) {
                MutableState.A09(true, this.$hasRequestedPermissions$delegate);
                this.$viewModel.onBlePermissionRequested(this.$presentationId);
                this.$requestBlePermissions.invoke();
            }
        } else if (!this.$navigator.isInBackStack(this.$activePairingKey)) {
            this.$navigator.back();
        }
        return new C78g() { // from class: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
