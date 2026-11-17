package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C7Bm;
import X.C8j4;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GBL;
import X.HtJ;
import X.Hwg;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import com.facebook.aura.devices.pairing.HatchDeviceBleManager;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DispatchException;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$outcome$1", f = "HatchDeviceBleManager.kt", l = {1971}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$scanForDevice$outcome$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchDeviceBleManager.ScanOutcome>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchDeviceBleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceBleManager$scanForDevice$outcome$1(HatchDeviceBleManager hatchDeviceBleManager, HtJ<? super HatchDeviceBleManager$scanForDevice$outcome$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchDeviceBleManager;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDeviceBleManager$scanForDevice$outcome$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchDeviceBleManager.ScanOutcome> htJ) {
        return new HatchDeviceBleManager$scanForDevice$outcome$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.bluetooth.le.ScanCallback, com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$outcome$1$1$callback$1] */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws DispatchException {
        BluetoothLeScanner bluetoothLeScanner;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
            this.L$0 = hatchDeviceBleManager;
            this.label = 1;
            final GBL gblA04 = C7Bm.A04(this);
            ?? r4 = new ScanCallback() { // from class: com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$outcome$1$1$callback$1
                @Override // android.bluetooth.le.ScanCallback
                public void onScanResult(int i2, ScanResult scanResult) {
                    BluetoothDevice device;
                    BluetoothDevice device2;
                    String name;
                    BluetoothLeScanner bluetoothLeScanner2;
                    C7384Etj.A0Y(scanResult, 1);
                    if (!gblA04.isActive() || (device = scanResult.getDevice()) == null) {
                        return;
                    }
                    ScanRecord scanRecord = scanResult.getScanRecord();
                    if (((scanRecord == null || (name = scanRecord.getDeviceName()) == null) && ((device2 = scanResult.getDevice()) == null || (name = device2.getName()) == null)) || !hatchDeviceBleManager.nameMatchesTarget(name) || hatchDeviceBleManager.excludeNames.contains(name)) {
                        return;
                    }
                    CFK.A05(HatchDeviceBleManagerKt.TAG, FGI.A0V("Found via scan: ", name, " rssi=", scanResult.getRssi()));
                    hatchDeviceBleManager.listener.onDebugLog(FGI.A0V("Found: ", name, " rssi=", scanResult.getRssi()));
                    try {
                        BluetoothAdapter bluetoothAdapter = hatchDeviceBleManager.bluetoothAdapter;
                        if (bluetoothAdapter != null && (bluetoothLeScanner2 = bluetoothAdapter.getBluetoothLeScanner()) != null) {
                            bluetoothLeScanner2.stopScan(this);
                        }
                    } catch (Exception e) {
                        CFK.A0A(HatchDeviceBleManagerKt.TAG, "Error stopping scan after find", e);
                    }
                    if (gblA04.isActive()) {
                        gblA04.Abf(null, new HatchDeviceBleManager.ScanOutcome.Found(new HatchDeviceBleManager.ScannedDevice(C8j4.A0u(device), name, scanResult.getRssi(), null, false)));
                    }
                }

                @Override // android.bluetooth.le.ScanCallback
                public void onScanFailed(int i2) {
                    HatchDeviceBleManager hatchDeviceBleManager2 = hatchDeviceBleManager;
                    int i3 = HatchDeviceBleManager.$stable;
                    hatchDeviceBleManager2.listener.onDebugLog(FGI.A0H("Scan failed: errorCode=", i2));
                    if (gblA04.isActive()) {
                        gblA04.Abf(null, new HatchDeviceBleManager.ScanOutcome.ScanFailed(i2));
                    }
                }
            };
            ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
            try {
                int i2 = HatchDeviceBleManager.$stable;
                BluetoothAdapter bluetoothAdapter = hatchDeviceBleManager.bluetoothAdapter;
                if (bluetoothAdapter != null && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != 0) {
                    bluetoothLeScanner.startScan((List<ScanFilter>) null, scanSettingsBuild, (ScanCallback) r4);
                }
            } catch (Exception e) {
                CFK.A0A(HatchDeviceBleManagerKt.TAG, "Error starting scan", e);
                if (gblA04.isActive()) {
                    gblA04.Abf(null, new HatchDeviceBleManager.ScanOutcome.ScanFailed(-1));
                }
            }
            gblA04.AO2(new HatchDeviceBleManager$scanForDevice$outcome$1$1$1(hatchDeviceBleManager, r4));
            obj = gblA04.A0F();
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
