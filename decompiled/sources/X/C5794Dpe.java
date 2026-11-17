package X;

import java.util.Queue;

/* renamed from: X.Dpe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5794Dpe {
    public final Queue<Long> A02 = BV4.A0s();
    public int A00 = 1;
    public long A01 = 3600000;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r8v0 X.Dpe) */
    public static final synchronized void A00(C5794Dpe c5794Dpe, long j) {
        synchronized (c5794Dpe) {
            while (true) {
                Queue<Long> queue = c5794Dpe.A02;
                Long lPeek = queue.peek();
                if (lPeek == null || lPeek.longValue() > j - c5794Dpe.A01) {
                    break;
                } else {
                    queue.poll();
                }
            }
        }
    }
}
