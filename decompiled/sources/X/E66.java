package X;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E66 {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;
    public boolean A04;
    public final int A05;
    public final /* synthetic */ E6E A06;

    public E66(E6E e6e, int i) {
        this.A06 = e6e;
        this.A05 = i;
    }

    public final void A00() {
        long duration;
        E6E e6e = this.A06;
        Dn6 dn6 = e6e.A01;
        Timeline timelineA02 = AbstractC5797Dph.A02((C6438E5q) dn6);
        Object objA0C = AnonymousClass002.A1M(timelineA02.A02()) ? null : timelineA02.A0C(dn6.AEV());
        int iAEP = dn6.AEP();
        int iAEQ = dn6.AEQ();
        long currentPosition = dn6.getCurrentPosition();
        if (objA0C == null || iAEP != -1) {
            duration = iAEP != -1 ? dn6.getDuration() : -9223372036854775807L;
        } else {
            E6B e6b = e6e.A02;
            timelineA02.A0B(e6b, objA0C);
            currentPosition -= Util.A0B(e6b.A02);
            duration = Util.A0B(e6b.A01);
        }
        boolean zIsPlaying = dn6.isPlaying();
        if (!zIsPlaying || duration == -9223372036854775807L || currentPosition < duration) {
            Handler handler = ((E6I) e6e.A04).A00;
            handler.removeMessages(3);
            if (zIsPlaying && duration != -9223372036854775807L) {
                handler.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - currentPosition) / AbstractC5797Dph.A03(r13).A05.A01));
            }
            this.A04 = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A04 && C6xC.A00(objA0C, this.A03) && iAEP == this.A00 && iAEQ == this.A01) {
            long j = jElapsedRealtime - this.A02;
            int i = this.A05;
            BV8.A1G(e6e, (j > i ? 1 : (j == i ? 0 : -1)), 3, i);
            return;
        }
        this.A04 = true;
        this.A02 = jElapsedRealtime;
        this.A03 = objA0C;
        this.A00 = iAEP;
        this.A01 = iAEQ;
        Handler handler2 = ((E6I) e6e.A04).A00;
        handler2.removeMessages(3);
        handler2.sendEmptyMessageDelayed(3, this.A05);
    }
}
