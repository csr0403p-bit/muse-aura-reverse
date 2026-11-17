package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$actions.updateWifiSsid(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$1$1$1(HatchDevicePairingActions hatchDevicePairingActions) {
        super(1);
        this.$actions = hatchDevicePairingActions;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
