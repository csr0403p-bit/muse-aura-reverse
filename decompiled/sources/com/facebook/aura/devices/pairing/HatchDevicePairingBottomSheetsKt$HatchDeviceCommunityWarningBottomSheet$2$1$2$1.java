package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ HatchDevicePairingUiState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$2$1$2$1(HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingUiState hatchDevicePairingUiState) {
        super(0);
        this.$actions = hatchDevicePairingActions;
        this.$state = hatchDevicePairingUiState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$actions.continueFromCommunityWarning(this.$state.getLinkConfirmationRequestId());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
