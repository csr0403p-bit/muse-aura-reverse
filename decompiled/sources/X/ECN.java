package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public final class ECN extends BroadcastReceiver {
    public final /* synthetic */ ECM A00;

    public ECN(ECM ecm) {
        this.A00 = ecm;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException {
        ECM ecm = this.A00;
        LayoutInflaterFactory2C8250FaT.A0G(ecm instanceof DBV ? ((DBV) ecm).A01 : ((DBW) ecm).A01, true, true);
    }
}
