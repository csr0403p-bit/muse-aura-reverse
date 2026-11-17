package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Cbc implements ServiceConnection, CUE {
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final Cbb A04;
    public final /* synthetic */ C3649Cbe A06;
    public final Map A05 = BV4.A0u();
    public int A00 = 2;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: zzaj -> 0x00e3, TryCatch #2 {zzaj -> 0x00e3, blocks: (B:2:0x0000, B:4:0x0010, B:5:0x0019, B:8:0x002b, B:22:0x0051, B:24:0x005b, B:26:0x0065, B:27:0x0079, B:28:0x007a, B:20:0x0042, B:14:0x0036, B:15:0x003d, B:12:0x0032, B:13:0x0035, B:29:0x0087), top: B:52:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:33:0x00ae, B:35:0x00bc, B:36:0x00cd, B:37:0x00d0, B:38:0x00d3), top: B:55:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #6 {all -> 0x00de, blocks: (B:33:0x00ae, B:35:0x00bc, B:36:0x00cd, B:37:0x00d0, B:38:0x00d3), top: B:55:0x00ae }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult A00(X.Cbc r13, java.lang.String r14) throws com.google.android.gms.common.internal.zzaj, android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cbc.A00(X.Cbc, java.lang.String):com.google.android.gms.common.ConnectionResult");
    }

    public Cbc(Cbb cbb, C3649Cbe c3649Cbe) {
        this.A06 = c3649Cbe;
        this.A04 = cbb;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3649Cbe c3649Cbe = this.A06;
        synchronized (c3649Cbe.A02) {
            c3649Cbe.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            Iterator itA10 = BV5.A10(this.A05);
            while (itA10.hasNext()) {
                ((ServiceConnection) itA10.next()).onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3649Cbe c3649Cbe = this.A06;
        synchronized (c3649Cbe.A02) {
            c3649Cbe.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            Iterator itA10 = BV5.A10(this.A05);
            while (itA10.hasNext()) {
                ((ServiceConnection) itA10.next()).onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }
}
