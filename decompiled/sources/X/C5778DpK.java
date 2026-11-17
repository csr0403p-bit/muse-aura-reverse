package X;

import android.os.SystemClock;

/* renamed from: X.DpK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5778DpK {
    public boolean A00;
    public final E7C A01;

    public final synchronized void A00() {
        boolean z = false;
        while (!this.A00) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            BV4.A1A();
        }
    }

    public final synchronized void A01() {
        this.A00 = false;
    }

    public final synchronized boolean A02() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A03(long j) {
        boolean z;
        if (j <= 0) {
            z = this.A00;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                A00();
            } else {
                boolean z2 = false;
                while (!this.A00 && jElapsedRealtime < j2) {
                    try {
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z2) {
                    BV4.A1A();
                }
            }
            z = this.A00;
        }
        return z;
    }

    public C5778DpK(E7C e7c) {
        this.A01 = e7c;
    }

    public C5778DpK() {
        this(E7C.A00);
    }
}
