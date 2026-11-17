package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.G0U;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$scanForDevice$outcome$1$1$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ HatchDeviceBleManager$scanForDevice$outcome$1$1$callback$1 $callback;
    public final /* synthetic */ HatchDeviceBleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceBleManager$scanForDevice$outcome$1$1$1(HatchDeviceBleManager hatchDeviceBleManager, HatchDeviceBleManager$scanForDevice$outcome$1$1$callback$1 hatchDeviceBleManager$scanForDevice$outcome$1$1$callback$1) {
        super(1);
        this.this$0 = hatchDeviceBleManager;
        this.$callback = hatchDeviceBleManager$scanForDevice$outcome$1$1$callback$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        BluetoothLeScanner bluetoothLeScanner;
        try {
            HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
            int i = HatchDeviceBleManager.$stable;
            BluetoothAdapter bluetoothAdapter = hatchDeviceBleManager.bluetoothAdapter;
            if (bluetoothAdapter == null || (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) == null) {
                return;
            }
            bluetoothLeScanner.stopScan(this.$callback);
        } catch (Exception unused) {
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
