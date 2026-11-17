package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes5.dex */
public final class CKa implements ServiceConnection {
    public final /* synthetic */ CKb A00;

    public /* synthetic */ CKa(CKb cKb) {
        this.A00 = cKb;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CKb cKb = this.A00;
        cKb.A06.A03("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        cKb.A01().post(new CKS(iBinder, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        CKb cKb = this.A00;
        cKb.A06.A03("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        cKb.A01().post(new CKZ(this));
    }
}
