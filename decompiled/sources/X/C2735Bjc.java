package X;

import android.os.SystemClock;

/* renamed from: X.Bjc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2735Bjc {
    public long A00 = -1;
    public final long A01;
    public final /* synthetic */ Bj8 A02;

    public C2735Bjc(Bj8 bj8, long j) {
        this.A02 = bj8;
        this.A01 = j;
    }

    public final int A00() {
        Bj4 bj4 = this.A02.A05;
        if (!bj4.A05) {
            return 700;
        }
        int i = bj4.A00;
        if (i != 1 && i != 2) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.A00;
        if (j == -1) {
            this.A00 = jUptimeMillis;
            j = jUptimeMillis;
        }
        long j2 = jUptimeMillis - j;
        if (j2 <= 120000) {
            return 1000;
        }
        return j2 <= 300000 ? 2000 : 4000;
    }
}
