package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.Dpx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5813Dpx {
    public int A00;
    public HandlerThread A01;
    public Looper A02;
    public final Object A03;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Looper A00() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            android.os.Looper r1 = r4.A02     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2a
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L10
            android.os.HandlerThread r1 = r4.A01     // Catch: java.lang.Throwable -> L32
            r0 = 1
            if (r1 == 0) goto L11
        L10:
            r0 = 0
        L11:
            X.C1G.A08(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "ExoPlayer:Playback"
            r1 = -16
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L32
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L32
            r4.A01 = r0     // Catch: java.lang.Throwable -> L32
            r0.start()     // Catch: java.lang.Throwable -> L32
            android.os.HandlerThread r0 = r4.A01     // Catch: java.lang.Throwable -> L32
            android.os.Looper r1 = r0.getLooper()     // Catch: java.lang.Throwable -> L32
            r4.A02 = r1     // Catch: java.lang.Throwable -> L32
        L2a:
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + 1
            r4.A00 = r0     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            return r1
        L32:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5813Dpx.A00():android.os.Looper");
    }

    public final void A01() {
        HandlerThread handlerThread;
        synchronized (this.A03) {
            int i = this.A00;
            C1G.A08(AnonymousClass002.A1N(i));
            int i2 = i - 1;
            this.A00 = i2;
            if (i2 == 0 && (handlerThread = this.A01) != null) {
                handlerThread.quit();
                this.A01 = null;
                this.A02 = null;
            }
        }
    }

    public C5813Dpx(Looper looper) {
        this.A03 = C3cG.A0T();
        this.A02 = looper;
        this.A01 = null;
        this.A00 = 0;
    }

    public C5813Dpx() {
        this(null);
    }
}
