package X;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E69 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Object A04;
    public boolean A05;
    public final int A06;
    public final /* synthetic */ E6E A07;

    public E69(E6E e6e, int i) {
        this.A07 = e6e;
        this.A06 = i;
    }

    public final void A00() {
        E6E e6e = this.A07;
        Dn6 dn6 = e6e.A01;
        if (!dn6.isPlaying()) {
            if (this.A05) {
                BV6.A1A(e6e.A04, 2);
            }
            this.A05 = false;
            return;
        }
        Timeline timelineA02 = AbstractC5797Dph.A02((C6438E5q) dn6);
        Object objA0C = AnonymousClass002.A1M(timelineA02.A02()) ? null : timelineA02.A0C(dn6.AEV());
        int iAEP = dn6.AEP();
        int iAEQ = dn6.AEQ();
        long currentPosition = dn6.getCurrentPosition();
        if (objA0C != null && iAEP == -1) {
            currentPosition -= Util.A0B(timelineA02.A0B(e6e.A02, objA0C).A02);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A05 && C6xC.A00(objA0C, this.A04) && iAEP == this.A00 && iAEQ == this.A01 && currentPosition == this.A02) {
            long j = jElapsedRealtime - this.A03;
            int i = this.A06;
            BV8.A1G(e6e, (j > i ? 1 : (j == i ? 0 : -1)), 2, i);
            return;
        }
        this.A05 = true;
        this.A03 = jElapsedRealtime;
        this.A04 = objA0C;
        this.A00 = iAEP;
        this.A01 = iAEQ;
        this.A02 = currentPosition;
        Handler handler = ((E6I) e6e.A04).A00;
        handler.removeMessages(2);
        handler.sendEmptyMessageDelayed(2, this.A06);
    }
}
