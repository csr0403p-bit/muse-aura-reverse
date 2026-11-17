package X;

import java.util.Iterator;

/* renamed from: X.Dnj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5702Dnj {
    public final long A01;
    public final long A02;
    public final AIG<long[]> A03 = new AIG<>();
    public long A00 = Long.MIN_VALUE;

    public final int A00(long j, long j2) {
        AIG<long[]> aig;
        int i;
        long j3 = j - this.A02;
        while (true) {
            aig = this.A03;
            if (aig.isEmpty() || aig.A0T()[1] > j3) {
                break;
            }
            aig.removeFirst();
        }
        if (aig.isEmpty()) {
            i = 0;
        } else {
            Iterator<long[]> it = aig.iterator();
            i = 0;
            while (it.hasNext()) {
                long[] next = it.next();
                if (next[1] - next[0] >= j2 && (i = i + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        return i + ((!AnonymousClass002.A1L((this.A00 > Long.MIN_VALUE ? 1 : (this.A00 == Long.MIN_VALUE ? 0 : -1))) || A01(j) < j2) ? 0 : 1);
    }

    public final long A01(long j) {
        if (AnonymousClass002.A1L((this.A00 > Long.MIN_VALUE ? 1 : (this.A00 == Long.MIN_VALUE ? 0 : -1)))) {
            return Math.max(0L, j - this.A00);
        }
        return 0L;
    }

    public final long A02(long j, long j2) {
        AIG<long[]> aig;
        long j3 = j - this.A02;
        while (true) {
            aig = this.A03;
            if (aig.isEmpty() || aig.A0T()[1] > j3) {
                break;
            }
            aig.removeFirst();
        }
        Iterator<long[]> it = aig.iterator();
        long jMax = 0;
        while (it.hasNext()) {
            long[] next = it.next();
            long j4 = next[1];
            long j5 = next[0];
            if (j4 - j5 >= j2) {
                jMax += j4 - Math.max(j5, j3);
            }
        }
        if (!AnonymousClass002.A1L((this.A00 > Long.MIN_VALUE ? 1 : (this.A00 == Long.MIN_VALUE ? 0 : -1)))) {
            return jMax;
        }
        long j6 = this.A00;
        return (j <= j6 || A01(j) < j2) ? jMax : jMax + (j - Math.max(j6, j3));
    }

    public final void A03(boolean z, long j) {
        long j2 = this.A00;
        if (z) {
            if (j2 == Long.MIN_VALUE) {
                this.A00 = j;
            }
        } else if (j2 != Long.MIN_VALUE) {
            if (j > j2) {
                this.A03.addLast(new long[]{j2, j});
            }
            this.A00 = Long.MIN_VALUE;
        }
    }

    public C5702Dnj(long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
    }
}
