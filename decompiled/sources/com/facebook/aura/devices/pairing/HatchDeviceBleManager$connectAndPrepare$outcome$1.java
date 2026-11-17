package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$connectAndPrepare$outcome$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchDeviceBleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceBleManager$connectAndPrepare$outcome$1(HatchDeviceBleManager hatchDeviceBleManager) {
        super(0);
        this.this$0 = hatchDeviceBleManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
        int i = HatchDeviceBleManager.$stable;
        return Boolean.valueOf(hatchDeviceBleManager.hasStopped);
    }
}
