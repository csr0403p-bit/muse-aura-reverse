package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes5.dex */
public final class CKm implements ServiceConnection {
    public final /* synthetic */ C3404CKi A00;

    public /* synthetic */ CKm(C3404CKi c3404CKi) {
        this.A00 = c3404CKi;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3404CKi c3404CKi = this.A00;
        c3404CKi.A06.A02("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c3404CKi.A01().post(new CKT(iBinder, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3404CKi c3404CKi = this.A00;
        c3404CKi.A06.A02("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c3404CKi.A01().post(new CKg(this));
    }
}
