package X;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E67 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Object A05;
    public boolean A06;
    public final int A07;
    public final /* synthetic */ E6E A08;

    public E67(E6E e6e, int i) {
        this.A08 = e6e;
        this.A07 = i;
    }

    public final void A00() {
        E6E e6e = this.A08;
        Dn6 dn6 = e6e.A01;
        C6438E5q c6438E5q = (C6438E5q) dn6;
        if (AbstractC5797Dph.A00(c6438E5q) != 2 || !AbstractC5797Dph.A03(c6438E5q).A0E || AbstractC5797Dph.A03(c6438E5q).A02 != 0) {
            if (this.A06) {
                BV6.A1A(e6e.A04, 1);
            }
            this.A06 = false;
            return;
        }
        Timeline timelineA02 = AbstractC5797Dph.A02(c6438E5q);
        Object objA0C = AnonymousClass002.A1M(timelineA02.A02()) ? null : timelineA02.A0C(dn6.AEV());
        int iAEP = dn6.AEP();
        int iAEQ = dn6.AEQ();
        long jAD7 = dn6.AD7();
        long jMax = Math.max(0L, Util.A0B(AbstractC5797Dph.A03(c6438E5q).A0K) - Math.max(0L, jAD7 - dn6.getCurrentPosition()));
        if (objA0C != null && iAEP == -1) {
            jAD7 -= Util.A0B(timelineA02.A0B(e6e.A02, objA0C).A02);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A06 && C6xC.A00(objA0C, this.A05) && iAEP == this.A00 && iAEQ == this.A01 && jAD7 == this.A03 && jMax == this.A02) {
            long j = jElapsedRealtime - this.A04;
            int i = this.A07;
            BV8.A1G(e6e, (j > i ? 1 : (j == i ? 0 : -1)), 1, i);
            return;
        }
        this.A06 = true;
        this.A04 = jElapsedRealtime;
        this.A05 = objA0C;
        this.A00 = iAEP;
        this.A01 = iAEQ;
        this.A03 = jAD7;
        this.A02 = jMax;
        Handler handler = ((E6I) e6e.A04).A00;
        handler.removeMessages(1);
        handler.sendEmptyMessageDelayed(1, this.A07);
    }
}
