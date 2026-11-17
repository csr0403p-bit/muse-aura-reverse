package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1", f = "HatchDeviceBleManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $advName;
    public final /* synthetic */ boolean $advertisesBluetoothGadget;
    public final /* synthetic */ BluetoothDevice $device;
    public final /* synthetic */ boolean $isSetUpAgainTarget;
    public final /* synthetic */ boolean $matchesLinkName;
    public final /* synthetic */ ScanRecord $record;
    public final /* synthetic */ ScanResult $result;
    public int label;
    public final /* synthetic */ HatchDeviceBleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1(HatchDeviceBleManager hatchDeviceBleManager, BluetoothDevice bluetoothDevice, String str, ScanRecord scanRecord, boolean z, boolean z2, boolean z3, ScanResult scanResult, HtJ<? super HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchDeviceBleManager;
        this.$device = bluetoothDevice;
        this.$advName = str;
        this.$record = scanRecord;
        this.$matchesLinkName = z;
        this.$advertisesBluetoothGadget = z2;
        this.$isSetUpAgainTarget = z3;
        this.$result = scanResult;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1(this.this$0, this.$device, this.$advName, this.$record, this.$matchesLinkName, this.$advertisesBluetoothGadget, this.$isSetUpAgainTarget, this.$result, htJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        if (X.AnonymousClass002.A1b(com.facebook.aura.devices.pairing.HatchDeviceBleAdvertisementKt.hatchAdvertisedPairingFlag(r8.$record), true) == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto Ld3
            X.Hwg.A00(r9)
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r1 = r8.this$0
            android.bluetooth.BluetoothDevice r0 = r8.$device
            java.lang.String r2 = X.C8j4.A0u(r0)
            java.lang.String r3 = r8.$advName
            android.bluetooth.le.ScanRecord r0 = r8.$record
            if (r0 == 0) goto L1b
            java.util.List r4 = r0.getServiceUuids()
            if (r4 != 0) goto L1d
        L1b:
            X.AGi r4 = X.C0881AGi.A00
        L1d:
            boolean r5 = r8.$matchesLinkName
            r6 = 0
            boolean r7 = r8.$advertisesBluetoothGadget
            com.facebook.aura.devices.intf.DiscoveryDecision r2 = com.facebook.aura.devices.pairing.HatchDeviceBleManager.access$classify(r1, r2, r3, r4, r5, r6, r7)
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r5 = r8.this$0
            android.bluetooth.BluetoothDevice r0 = r8.$device
            java.lang.String r3 = X.C8j4.A0u(r0)
            boolean r0 = r8.$advertisesBluetoothGadget
            r4 = 0
            if (r0 != 0) goto L40
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r0 = r8.this$0
            boolean r0 = com.facebook.aura.devices.pairing.HatchDeviceBleManager.access$getImpliesBluetoothGadget(r0, r2)
            if (r0 != 0) goto L40
            boolean r1 = r8.$isSetUpAgainTarget
            r0 = 0
            if (r1 == 0) goto L41
        L40:
            r0 = 1
        L41:
            boolean r7 = com.facebook.aura.devices.pairing.HatchDeviceBleManager.access$rememberBluetoothGadget(r5, r3, r0)
            com.facebook.aura.devices.intf.DiscoveryDecision$Hidden r0 = com.facebook.aura.devices.intf.DiscoveryDecision.Hidden.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 == 0) goto L5b
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r1 = r8.this$0
            android.bluetooth.BluetoothDevice r0 = r8.$device
            java.lang.String r0 = X.C8j4.A0u(r0)
            com.facebook.aura.devices.pairing.HatchDeviceBleManager.access$removeDiscoveredDevice(r1, r0)
        L58:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5b:
            boolean r0 = r2 instanceof com.facebook.aura.devices.intf.DiscoveryDecision.Claimed
            if (r0 == 0) goto L7d
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r1 = r8.this$0
            android.bluetooth.BluetoothDevice r0 = r8.$device
            java.lang.String r3 = X.C8j4.A0u(r0)
            java.lang.String r4 = r8.$advName
            android.bluetooth.le.ScanResult r0 = r8.$result
            int r5 = r0.getRssi()
            com.facebook.aura.devices.intf.DiscoveryDecision$Claimed r2 = (com.facebook.aura.devices.intf.DiscoveryDecision.Claimed) r2
            com.facebook.aura.devices.intf.ClaimedDeviceRow r6 = r2.row
            r7 = 1
        L74:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScannedDevice r2 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScannedDevice
            r2.<init>(r3, r4, r5, r6, r7)
            com.facebook.aura.devices.pairing.HatchDeviceBleManager.access$addDiscoveredDevice(r1, r2)
            goto L58
        L7d:
            boolean r0 = r8.$isSetUpAgainTarget
            if (r0 == 0) goto L85
            boolean r0 = r8.$matchesLinkName
            if (r0 != 0) goto Lc1
        L85:
            boolean r3 = r8.$matchesLinkName
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r1 = r8.this$0
            boolean r0 = r1.supportsGadgets
            if (r0 == 0) goto La7
            java.util.Set<java.lang.String> r1 = r1.linkSetupServiceAddresses
            android.bluetooth.BluetoothDevice r0 = r8.$device
            java.lang.String r0 = r0.getAddress()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto La7
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r0 = r8.this$0
            com.facebook.aura.devices.pairing.HatchDeviceFamily r1 = r0.deviceFamily
            java.lang.String r0 = r8.$advName
            boolean r0 = com.facebook.aura.devices.pairing.HatchDeviceFamilyKt.matchesCommunityName(r1, r0)
            if (r0 != 0) goto La8
        La7:
            r4 = 1
        La8:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r0 = r8.this$0
            boolean r0 = r0.includeWifiLinks
            boolean r0 = com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt.showsAsLinkRow(r2, r3, r4, r0)
            if (r0 == 0) goto L58
            if (r7 != 0) goto Lc1
            android.bluetooth.le.ScanRecord r0 = r8.$record
            java.lang.Boolean r1 = com.facebook.aura.devices.pairing.HatchDeviceBleAdvertisementKt.hatchAdvertisedPairingFlag(r0)
            r0 = 1
            boolean r0 = X.AnonymousClass002.A1b(r1, r0)
            if (r0 != 0) goto L58
        Lc1:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r1 = r8.this$0
            android.bluetooth.BluetoothDevice r0 = r8.$device
            java.lang.String r3 = X.C8j4.A0u(r0)
            java.lang.String r4 = r8.$advName
            android.bluetooth.le.ScanResult r0 = r8.$result
            int r5 = r0.getRssi()
            r6 = 0
            goto L74
        Ld3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
