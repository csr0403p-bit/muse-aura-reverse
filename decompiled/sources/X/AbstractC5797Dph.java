package X;

import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;

/* renamed from: X.Dph, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5797Dph implements Dn6 {
    public final C5998Dth A00 = new C5998Dth();

    public final void A0Q(long j, int i) {
        InterfaceC6459E6s interfaceC6459E6s;
        Runnable e64;
        C6438E5q c6438E5q = (C6438E5q) this;
        C6438E5q.A0J(c6438E5q);
        if (i != -1) {
            C1G.A07(C8j3.A1Q(i));
            Timeline timeline = c6438E5q.A0G.A06;
            if (AnonymousClass002.A1M(timeline.A02()) || i < timeline.A02()) {
                c6438E5q.A0p.ARR();
                c6438E5q.A02++;
                if (!AnonymousClass002.A1P(A03(c6438E5q).A09.A00, -1)) {
                    int i2 = A00(c6438E5q) != 1 ? 2 : 1;
                    int iAEU = c6438E5q.AEU();
                    E60 e60A03 = c6438E5q.A0G.A03(i2);
                    if (i2 == 1) {
                        e60A03 = e60A03.A0A(false);
                    }
                    E60 e60A0C = C6438E5q.A0C(C6438E5q.A0A(timeline, c6438E5q, i, j), timeline, c6438E5q, e60A03);
                    c6438E5q.A0o.AcO(timeline, i, Util.A0A(j));
                    C6438E5q.A0M(c6438E5q, e60A0C, 3, 1, iAEU, C6438E5q.A07(c6438E5q, e60A0C), true);
                    return;
                }
                CNC.A04("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                boolean z = c6438E5q.A0o instanceof C6440E5s;
                E60 e60 = c6438E5q.A0G;
                if (z) {
                    E78 e78 = new E78();
                    e78.A02 = e60;
                    e78.A00(1);
                    C6438E5q c6438E5q2 = ((E7P) c6438E5q.A0n).A00;
                    interfaceC6459E6s = c6438E5q2.A0i;
                    e64 = new E64(c6438E5q2, e78);
                } else {
                    E79 e79 = new E79();
                    e79.A02 = e60;
                    e79.A00(1);
                    C6438E5q c6438E5q3 = ((E7Q) c6438E5q.A0m).A00;
                    interfaceC6459E6s = c6438E5q3.A0i;
                    e64 = new E63(c6438E5q3, e79);
                }
                BV6.A1C(interfaceC6459E6s, e64);
            }
        }
    }

    public static Looper A01(C5615Dlu c5615Dlu) {
        return ((C6438E5q) c5615Dlu.A04).A0o.AIn();
    }

    public static E60 A04(C5615Dlu c5615Dlu) {
        C6438E5q c6438E5q = (C6438E5q) c5615Dlu.A04;
        C6438E5q.A0J(c6438E5q);
        return c6438E5q.A0G;
    }

    @Override // X.Dn6
    public final boolean isPlaying() {
        C6438E5q c6438E5q = (C6438E5q) this;
        return A00(c6438E5q) == 3 && A03(c6438E5q).A0E && A03(c6438E5q).A02 == 0;
    }

    public static int A00(C6438E5q c6438E5q) {
        C6438E5q.A0J(c6438E5q);
        return c6438E5q.A0G.A01;
    }

    public static Timeline A02(C6438E5q c6438E5q) {
        C6438E5q.A0J(c6438E5q);
        return c6438E5q.A0G.A06;
    }

    public static E60 A03(C6438E5q c6438E5q) {
        C6438E5q.A0J(c6438E5q);
        return c6438E5q.A0G;
    }
}
