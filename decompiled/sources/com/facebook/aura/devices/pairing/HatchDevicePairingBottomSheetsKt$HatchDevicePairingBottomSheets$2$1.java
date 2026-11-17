package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$HatchDevicePairingBottomSheets$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ Function0<Unit> $onPairingSucceeded;
    public final /* synthetic */ boolean $pairingSucceeded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$HatchDevicePairingBottomSheets$2$1(boolean z, Function0<Unit> function0, HatchDevicePairingActions hatchDevicePairingActions) {
        super(1);
        this.$pairingSucceeded = z;
        this.$onPairingSucceeded = function0;
        this.$actions = hatchDevicePairingActions;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$pairingSucceeded) {
            Function0<Unit> function0 = this.$onPairingSucceeded;
            if (function0 != null) {
                function0.invoke();
            } else {
                this.$actions.dismissPairingFlow();
            }
        }
        return new C78g() { // from class: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingBottomSheets$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
