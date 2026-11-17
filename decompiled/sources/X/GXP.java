package X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import com.sun.jna.Callback;

/* loaded from: classes6.dex */
public final class GXP implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ GXF A00;
    public final /* synthetic */ InterfaceC9648GXn A01;

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C7384Etj.A0Y(bluetoothProfile, 1);
        if (i == 1) {
            GXF gxf = this.A00;
            gxf.A01 = (BluetoothHeadset) bluetoothProfile;
            GXT gxt = gxf.A0G;
            if (gxt == null) {
                this.A01.AAq("DefaultBluetoothManager", "Bluetooth connected but listener is null", BV4.A1W());
                return;
            }
            GXK gxk = gxt.A00;
            gxk.A09 = false;
            boolean zA05 = gxk.A05.A05();
            InterfaceC9648GXn.A00(gxk.A07, FGI.A0r("onServiceConnected: turning bluetooth on: ", zA05));
            if (zA05) {
                GXK.A01(gxk);
            }
            GY0 gy0 = gxk.A01;
            if (gy0 == null) {
                C7384Etj.A0b(Callback.METHOD_NAME);
                throw F60.createAndThrow();
            }
            gy0.A00.A0d();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            GXF gxf = this.A00;
            gxf.A01 = null;
            GXT gxt = gxf.A0G;
            if (gxt != null) {
                GXK gxk = gxt.A00;
                gxk.A09 = false;
                InterfaceC9648GXn.A00(gxk.A07, "onServiceDisconnected: turning bluetooth off");
                GXK.A02(gxk, true);
                GY0 gy0 = gxk.A01;
                if (gy0 == null) {
                    C7384Etj.A0b(Callback.METHOD_NAME);
                    throw F60.createAndThrow();
                }
                gy0.A00.A0d();
            }
        }
    }

    public GXP(GXF gxf, InterfaceC9648GXn interfaceC9648GXn) {
        this.A00 = gxf;
        this.A01 = interfaceC9648GXn;
    }
}
