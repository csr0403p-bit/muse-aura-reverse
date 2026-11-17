package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class GBY<E> {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final /* synthetic */ AtomicReferenceArray A03;
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ long _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06 = AtomicReferenceFieldUpdater.newUpdater(GBY.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A05 = AtomicLongFieldUpdater.newUpdater(GBY.class, "_state$volatile");
    public static final HrH A04 = HrH.A00("REMOVE_FROZEN");

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02(E r16) {
        /*
            r15 = this;
            r11 = r15
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = X.GBY.A05
        L3:
            long r12 = r10.get(r11)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r12
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L1a
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r12 = r12 & r0
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L19
            r0 = 2
        L19:
            return r0
        L1a:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r12
            int r6 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r12
            r7 = 30
            long r0 = r0 >> r7
            int r4 = (int) r0
            int r3 = r11.A01
            int r1 = r4 + 2
            r1 = r1 & r3
            r0 = r6 & r3
            r2 = 1
            if (r1 == r0) goto L50
            boolean r0 = r11.A02
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.A03
            r0 = r4 & r3
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L51
            int r1 = r11.A00
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 < r0) goto L50
            int r4 = r4 - r6
            r4 = r4 & r5
            int r0 = r1 >> 1
            if (r4 <= r0) goto L3
        L50:
            return r2
        L51:
            int r2 = r4 + 1
            r2 = r2 & r5
            r0 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r14 = r12 & r0
            long r0 = (long) r2
            long r0 = r0 << r7
            long r14 = r14 | r0
            boolean r0 = r10.compareAndSet(r11, r12, r14)
            if (r0 == 0) goto L3
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.A03
            r0 = r4 & r3
            r5 = r16
            r1.set(r0, r5)
        L6d:
            long r2 = r10.get(r11)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L97
            long r0 = A00(r11)
            X.GBY r11 = A01(r11, r0)
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r11.A03
            int r2 = r11.A01
            r2 = r2 & r4
            java.lang.Object r1 = r3.get(r2)
            boolean r0 = r1 instanceof X.GC4
            if (r0 == 0) goto L97
            X.GC4 r1 = (X.GC4) r1
            int r0 = r1.A00
            if (r0 != r4) goto L97
            r3.set(r2, r5)
            goto L6d
        L97:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBY.A02(java.lang.Object):int");
    }

    public static final long A00(GBY gby) {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        do {
            j = atomicLongFieldUpdater.get(gby);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = 1152921504606846976L | j;
        } while (!atomicLongFieldUpdater.compareAndSet(gby, j, j2));
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final GBY A01(GBY gby, long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A06;
        while (true) {
            GBY gby2 = (GBY) atomicReferenceFieldUpdater.get(gby);
            if (gby2 != null) {
                return gby2;
            }
            GBY gby3 = new GBY(gby.A00 * 2, gby.A02);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = gby.A01;
                if ((i & i3) != (i3 & i2)) {
                    Object gc4 = gby.A03.get(i3 & i);
                    if (gc4 == null) {
                        gc4 = new GC4(i);
                    }
                    gby3.A03.set(gby3.A01 & i, gc4);
                    i++;
                }
            }
            A05.set(gby3, j & (-1152921504606846977L));
            AbstractC5217DdT.A00(gby, null, gby3, atomicReferenceFieldUpdater);
        }
    }

    public final Object A03() {
        GBY<E> gbyA01 = this;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        while (true) {
            long j = atomicLongFieldUpdater.get(gbyA01);
            if ((1152921504606846976L & j) != 0) {
                return A04;
            }
            int i = (int) (1073741823 & j);
            int i2 = gbyA01.A01;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = gbyA01.A03;
            Object obj = atomicReferenceArray.get(i4);
            if (obj == null) {
                if (gbyA01.A02) {
                    return null;
                }
            } else {
                if (obj instanceof GC4) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(gbyA01, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                if (gbyA01.A02) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(gbyA01);
                        int i5 = (int) (1073741823 & j3);
                        if ((1152921504606846976L & j3) != 0) {
                            gbyA01 = A01(gbyA01, A00(gbyA01));
                        } else if (atomicLongFieldUpdater.compareAndSet(gbyA01, j3, (j3 & (-1073741824)) | j2)) {
                            gbyA01.A03.set(gbyA01.A01 & i5, null);
                            return obj;
                        }
                    }
                }
            }
        }
    }

    public final boolean A04() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public GBY(int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        int i2 = i - 1;
        this.A01 = i2;
        this.A03 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw C3cG.A0Q("Check failed.");
        }
        if ((i & i2) != 0) {
            throw C3cG.A0Q("Check failed.");
        }
    }
}
