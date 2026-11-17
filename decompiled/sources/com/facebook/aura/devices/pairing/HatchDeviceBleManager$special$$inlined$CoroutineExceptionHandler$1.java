package com.facebook.aura.devices.pairing;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A0A(HatchDeviceBleManagerKt.TAG, "Uncaught exception in HatchDeviceBleManager scope", th);
    }

    public HatchDeviceBleManager$special$$inlined$CoroutineExceptionHandler$1(C78p c78p) {
        super(c78p);
    }
}
