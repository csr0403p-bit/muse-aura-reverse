package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$DeviceScanningContent$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ Function0<Unit> $onRetryBeforeScan;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$DeviceScanningContent$1$1$1$1(Function0<Unit> function0, HatchDevicePairingActions hatchDevicePairingActions) {
        super(0);
        this.$onRetryBeforeScan = function0;
        this.$actions = hatchDevicePairingActions;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0 = this.$onRetryBeforeScan;
        if (function0 != null) {
            function0.invoke();
        } else {
            this.$actions.startPairingBleScan();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
