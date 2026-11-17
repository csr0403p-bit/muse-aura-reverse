package com.facebook.aura.devices.link.startup;

import X.AbstractC7559F3s;
import X.G0U;
import android.bluetooth.le.BluetoothLeScanner;
import android.os.Handler;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class DeviceRepairCheckJob$scanForUnpairedDevices$2$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ DeviceRepairCheckJob$scanForUnpairedDevices$2$callback$1 $callback;
    public final /* synthetic */ Handler $handler;
    public final /* synthetic */ BluetoothLeScanner $scanner;
    public final /* synthetic */ Runnable $timeoutRunnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceRepairCheckJob$scanForUnpairedDevices$2$1(Handler handler, Runnable runnable, BluetoothLeScanner bluetoothLeScanner, DeviceRepairCheckJob$scanForUnpairedDevices$2$callback$1 deviceRepairCheckJob$scanForUnpairedDevices$2$callback$1) {
        super(1);
        this.$handler = handler;
        this.$timeoutRunnable = runnable;
        this.$scanner = bluetoothLeScanner;
        this.$callback = deviceRepairCheckJob$scanForUnpairedDevices$2$callback$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$handler.removeCallbacks(this.$timeoutRunnable);
        try {
            this.$scanner.stopScan(this.$callback);
        } catch (Exception unused) {
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
