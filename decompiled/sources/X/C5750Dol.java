package X;

import android.os.SystemClock;
import androidx.media3.common.util.Util;

/* renamed from: X.Dol, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5750Dol {
    public long A01;
    public long A02;
    public boolean A03;
    public final E7C A04 = E7C.A00;
    public C6233Dyb A00 = C6233Dyb.A03;

    public long A00() {
        long j = this.A02;
        if (!this.A03) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.A01;
        return j + (this.A00.A01 == 1.0f ? Util.A0A(jElapsedRealtime) : jElapsedRealtime * r4.A02);
    }

    public void A01() {
        if (this.A03) {
            return;
        }
        this.A01 = SystemClock.elapsedRealtime();
        this.A03 = true;
    }

    public void A02() {
        if (this.A03) {
            A03(A00());
            this.A03 = false;
        }
    }

    public void A03(long j) {
        this.A02 = j;
        if (this.A03) {
            this.A01 = SystemClock.elapsedRealtime();
        }
    }

    public void A04(C6233Dyb c6233Dyb) {
        if (this.A03) {
            A03(A00());
        }
        this.A00 = c6233Dyb;
    }
}
