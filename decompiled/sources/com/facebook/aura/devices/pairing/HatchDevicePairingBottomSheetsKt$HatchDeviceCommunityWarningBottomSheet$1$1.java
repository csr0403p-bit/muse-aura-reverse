package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$1$1(HatchDevicePairingActions hatchDevicePairingActions) {
        super(0);
        this.$actions = hatchDevicePairingActions;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$actions.goBackInPairing();
    }
}
