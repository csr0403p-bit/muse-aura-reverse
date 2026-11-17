package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$awaitLinkTeardown$dropped$1", f = "HatchDeviceBleManager.kt", l = {1183}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchDeviceBleManager$awaitLinkTeardown$dropped$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BluetoothDevice $device;
    public final /* synthetic */ BluetoothManager $manager;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceBleManager$awaitLinkTeardown$dropped$1(BluetoothManager bluetoothManager, BluetoothDevice bluetoothDevice, HtJ<? super HatchDeviceBleManager$awaitLinkTeardown$dropped$1> htJ) {
        super(2, htJ);
        this.$manager = bluetoothManager;
        this.$device = bluetoothDevice;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDeviceBleManager$awaitLinkTeardown$dropped$1(this.$manager, this.$device, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        while (this.$manager.getConnectionState(this.$device, 7) != 0) {
            this.label = 1;
            if (C7Bq.A01(100L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchDeviceBleManager$awaitLinkTeardown$dropped$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
