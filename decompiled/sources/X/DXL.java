package X;

import android.os.SystemClock;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Deque;

/* loaded from: classes5.dex */
public abstract class DXL {
    public int A00;
    public int A01;
    public long A03;
    public C5339Dga A04 = new C5339Dga();
    public DXM A05 = new DXM(E7C.A00);
    public long A02 = -1;

    public synchronized void A01(AbrContextAwareConfiguration abrContextAwareConfiguration, DXN dxn, boolean z, boolean z2) {
        this.A01++;
        long j = dxn.A05;
        if (j > 0 && !dxn.A0A && !dxn.A0B) {
            long j2 = dxn.A00;
            long j3 = dxn.A04;
            long j4 = j2 - j3;
            long j5 = j4 + dxn.A01;
            long j6 = j + j5 + j3;
            long j7 = j5 > 0 ? (dxn.A02 * 8000) / j5 : 0L;
            int i = dxn.A02;
            int iSqrt = i > 0 ? (int) Math.sqrt(i) : 0;
            long j8 = i;
            DXM dxm = this.A05;
            long j9 = dxn.A09;
            long j10 = dxn.A03;
            synchronized (dxm) {
                if (j4 > 0 && j5 > j4 && j8 > 0) {
                    if (z) {
                        try {
                            Deque<DXQ> deque = dxm.A04;
                            deque.add(new DXQ(j4, j8, SystemClock.elapsedRealtime(), j9, !deque.isEmpty() ? j4 - deque.getLast().A02 : 0L));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z2) {
                        long j11 = (8000 * j8) / (j5 - j4);
                        Deque<DXP> deque2 = dxm.A03;
                        deque2.add(new DXP(j11, j8, SystemClock.elapsedRealtime(), j10, deque2.isEmpty() ? 0L : j11 - deque2.getLast().A00));
                    }
                    DXM.A00(dxm);
                    dxm.A01 = true;
                }
            }
            if (z && z2) {
                try {
                    this.A03 = (long) Math.max(this.A03, j6);
                    if (j7 > 0) {
                        this.A04.A01(iSqrt, j7);
                        float fA00 = this.A04.A00();
                        this.A02 = Float.isNaN(fA00) ? -1L : (long) fA00;
                        this.A00++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
