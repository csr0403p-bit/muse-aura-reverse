package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$DeviceScanningContent$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ Function0<Unit> $onRetryBeforeScan;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$DeviceScanningContent$1$1(Function0<Unit> function0, HatchDevicePairingActions hatchDevicePairingActions) {
        super(2);
        this.$onRetryBeforeScan = function0;
        this.$actions = hatchDevicePairingActions;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$actions, bfm.A65(this.$onRetryBeforeScan));
            Function0<Unit> function0 = this.$onRetryBeforeScan;
            HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$DeviceScanningContent$1$1$1$1(function0, hatchDevicePairingActions);
                bfm.Ai0(objAaT);
            }
            HatchDevicePairingBottomSheetsKt.PairingScanAgainLink((Function0) objAaT, null, bfm, 0, 2);
            return;
        }
        bfm.Afo();
    }
}
