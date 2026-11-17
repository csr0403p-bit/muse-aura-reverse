package com.facebook.aura.devices.pairing;

import X.C7384Etj;
import X.CFK;
import com.facebook.aura.common.ble.AuraBleLogger;

/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$bleLogger$1 implements AuraBleLogger {
    public final /* synthetic */ HatchDeviceBleManager this$0;

    @Override // com.facebook.aura.common.ble.AuraBleLogger
    public void debug(String str) {
        C7384Etj.A0Y(str, 0);
    }

    @Override // com.facebook.aura.common.ble.AuraBleLogger
    public void error(String str, Throwable th) {
        C7384Etj.A0Y(str, 0);
        CFK.A08(HatchDeviceBleManagerKt.TAG, str, th);
        HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
        int i = HatchDeviceBleManager.$stable;
        hatchDeviceBleManager.listener.onDebugLog(str);
    }

    @Override // com.facebook.aura.common.ble.AuraBleLogger
    public void log(String str) {
        C7384Etj.A0Y(str, 0);
        CFK.A05(HatchDeviceBleManagerKt.TAG, str);
        HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
        int i = HatchDeviceBleManager.$stable;
        hatchDeviceBleManager.listener.onDebugLog(str);
    }

    @Override // com.facebook.aura.common.ble.AuraBleLogger
    public void warning(String str) {
        C7384Etj.A0Y(str, 0);
        CFK.A06(HatchDeviceBleManagerKt.TAG, str);
        HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
        int i = HatchDeviceBleManager.$stable;
        hatchDeviceBleManager.listener.onDebugLog(str);
    }

    public HatchDeviceBleManager$bleLogger$1(HatchDeviceBleManager hatchDeviceBleManager) {
        this.this$0 = hatchDeviceBleManager;
    }
}
