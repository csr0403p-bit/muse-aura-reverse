package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.DsT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5933DsT {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C5995Dtc A04;
    public C5995Dtc A05;
    public C5995Dtc A06;
    public final C6082DvM A07;
    public final DwM A08;
    public final List<C5995Dtc> A09 = C3cG.A0h();

    public final synchronized void A00() {
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = 0L;
        this.A02 = -1L;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
        this.A09.clear();
    }

    public final synchronized void A01() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A02;
        if (j >= 0) {
            long j2 = jElapsedRealtime - j;
            if (j2 > 0) {
                this.A00++;
                if (j2 > 200) {
                    this.A01++;
                }
                this.A03 += j2;
                C5995Dtc c5995Dtc = new C5995Dtc(j, j2);
                if (this.A04 == null) {
                    this.A04 = c5995Dtc;
                }
                this.A05 = c5995Dtc;
                C5995Dtc c5995Dtc2 = this.A06;
                if (c5995Dtc2 == null || j2 > c5995Dtc2.A00) {
                    this.A06 = c5995Dtc;
                }
                this.A09.add(c5995Dtc);
            }
        }
        this.A02 = -1L;
    }

    public C5933DsT(C6082DvM c6082DvM, DwM dwM) {
        this.A07 = c6082DvM;
        this.A08 = dwM;
        A00();
    }
}
