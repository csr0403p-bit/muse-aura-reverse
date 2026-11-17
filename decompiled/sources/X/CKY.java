package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes5.dex */
public final class CKY implements ServiceConnection {
    public final /* synthetic */ CKV A00;

    public /* synthetic */ CKY(CKV ckv) {
        this.A00 = ckv;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CKV ckv = this.A00;
        ckv.A06.A00("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        ckv.A01().post(new CKR(iBinder, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        CKV ckv = this.A00;
        ckv.A06.A00("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        ckv.A01().post(new CKU(this));
    }
}
