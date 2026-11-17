package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DiY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5437DiY {
    public int A00;
    public long A03;
    public C5540DkH A06;
    public C5328DgM A07;
    public final C5794Dpe A0K;
    public volatile boolean A0L;
    public volatile boolean A0N;
    public volatile boolean A0O;
    public volatile boolean A0P;
    public volatile boolean A0Q;
    public volatile boolean A0R;
    public final AtomicInteger A0A = new AtomicInteger();
    public final AtomicLong A0G = BV4.A14(-9223372036854775807L);
    public final AtomicLong A0H = BV4.A14(-9223372036854775807L);
    public final AtomicReference<C5518Dju> A0J = BV4.A15();
    public final AtomicLong A0F = BV4.A14(-9223372036854775807L);
    public final AtomicLong A0E = BV4.A14(-9223372036854775807L);
    public final C5448Dij A09 = new C5448Dij();
    public volatile boolean A0M = true;
    public final C5475DjC A08 = new C5475DjC();
    public long A01 = -1;
    public long A04 = -1;
    public long A02 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public long A05 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public final AtomicLong A0B = BV4.A14(-9223372036854775807L);
    public final AtomicLong A0C = BV4.A14(-9223372036854775807L);
    public final AtomicLong A0D = BV4.A14(-9223372036854775807L);
    public final AtomicLong A0I = BV4.A14(-9223372036854775807L);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A00() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r5 = r7.A02     // Catch: java.lang.Throwable -> L36
            long r3 = r7.A01     // Catch: java.lang.Throwable -> L36
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf
            goto L29
        Lf:
            long r5 = r7.A05     // Catch: java.lang.Throwable -> L36
            long r3 = r7.A04     // Catch: java.lang.Throwable -> L36
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L27
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L27
            goto L33
        L27:
            r0 = 0
            goto L34
        L29:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lf
        L33:
            r0 = 1
        L34:
            monitor-exit(r7)
            return r0
        L36:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5437DiY.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A01(long r6, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r8 == 0) goto L8
            r5.A02 = r6     // Catch: java.lang.Throwable -> L1a
            long r3 = r5.A01     // Catch: java.lang.Throwable -> L1a
            goto Lc
        L8:
            r5.A05 = r6     // Catch: java.lang.Throwable -> L1a
            long r3 = r5.A04     // Catch: java.lang.Throwable -> L1a
        Lc:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L17
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L18
        L17:
            r0 = 0
        L18:
            monitor-exit(r5)
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5437DiY.A01(long, boolean):boolean");
    }

    public C5437DiY(C5794Dpe c5794Dpe) {
        this.A0K = c5794Dpe;
    }
}
