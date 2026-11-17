package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkPairingSheet$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ MutableState<Boolean> $showPermissionDeniedDialog$delegate;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkPairingSheet$9$1(HatchDevicePairingViewModel hatchDevicePairingViewModel, String str, MutableState<Boolean> mutableState) {
        super(0);
        this.$viewModel = hatchDevicePairingViewModel;
        this.$presentationId = str;
        this.$showPermissionDeniedDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onBlePermissionRetry(this.$presentationId);
        MutableState.A09(true, this.$showPermissionDeniedDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
