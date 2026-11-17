package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$requestBlePermissions$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ MutableState<Boolean> $showPermissionDeniedDialog$delegate;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$requestBlePermissions$1$1(HatchDevicePairingViewModel hatchDevicePairingViewModel, String str, MutableState<Boolean> mutableState) {
        super(1);
        this.$viewModel = hatchDevicePairingViewModel;
        this.$presentationId = str;
        this.$showPermissionDeniedDialog$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        MutableState.A09(!z, this.$showPermissionDeniedDialog$delegate);
        this.$viewModel.onBlePermissionsResult(z, this.$presentationId);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
