package X;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class E6H {
    public int A00;
    public long A01;
    public boolean A02;
    public final int A03;
    public final /* synthetic */ E6E A04;

    public E6H(E6E e6e, int i) {
        this.A04 = e6e;
        this.A03 = i;
    }

    public final void A00() {
        E6E e6e = this.A04;
        C6438E5q c6438E5q = (C6438E5q) e6e.A01;
        int i = AbstractC5797Dph.A03(c6438E5q).A02;
        if (!AbstractC5797Dph.A03(c6438E5q).A0E || AbstractC5797Dph.A00(c6438E5q) == 1 || AbstractC5797Dph.A00(c6438E5q) == 4 || i == 0 || i == 1) {
            if (this.A02) {
                BV6.A1A(e6e.A04, 4);
            }
            this.A02 = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A02 && this.A00 == i) {
            long j = jElapsedRealtime - this.A01;
            int i2 = this.A03;
            BV8.A1G(e6e, (j > i2 ? 1 : (j == i2 ? 0 : -1)), 4, i2);
        } else {
            this.A02 = true;
            this.A01 = jElapsedRealtime;
            this.A00 = i;
            Handler handler = ((E6I) e6e.A04).A00;
            handler.removeMessages(4);
            handler.sendEmptyMessageDelayed(4, this.A03);
        }
    }
}
