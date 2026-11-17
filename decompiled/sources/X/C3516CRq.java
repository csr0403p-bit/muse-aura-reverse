package X;

import android.os.SystemClock;
import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import java.io.Closeable;
import java.util.Map;

/* renamed from: X.CRq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3516CRq implements Closeable {
    public static final Map A06 = BV4.A0u();
    public double A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04 = 2147483647L;
    public long A05 = AuraImpressionTimeTracker.UNKNOWN_TIME;

    public static void A00(C3516CRq c3516CRq) {
        c3516CRq.A01 = 0;
        c3516CRq.A00 = 0.0d;
        c3516CRq.A02 = 0L;
        c3516CRq.A04 = 2147483647L;
        c3516CRq.A05 = AuraImpressionTimeTracker.UNKNOWN_TIME;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this instanceof C3517CRr) {
            return;
        }
        long j = this.A02;
        if (j == 0) {
            throw C3cG.A0Q("Did you forget to call start()?");
        }
        long jA04 = BV4.A04(SystemClock.elapsedRealtimeNanos()) - j;
        long jA042 = BV4.A04(SystemClock.elapsedRealtimeNanos());
        long j2 = this.A03;
        if (j2 != 0 && jA042 - j2 >= 1000000) {
            A00(this);
        }
        this.A03 = jA042;
        int i = this.A01 + 1;
        this.A01 = i;
        this.A00 += jA04;
        this.A04 = Math.min(this.A04, jA04);
        this.A05 = Math.max(this.A05, jA04);
        if (i % 50 == 0) {
            C3518CRs.A00();
        }
        if (this.A01 % 500 == 0) {
            A00(this);
        }
    }
}
