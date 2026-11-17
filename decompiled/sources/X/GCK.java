package X;

import X.GCK;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public abstract class GCK<S extends GCK<S>> extends GCL<S> implements G6I {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(GCK.class, "cleanedAndPointers$volatile");
    public final long A00;
    public volatile /* synthetic */ int cleanedAndPointers$volatile;

    @Override // X.GCL
    public final boolean A03() {
        return A01.get(this) == A04() && A00() != null;
    }

    public int A04() {
        return AbstractC9276GCd.A01;
    }

    public final void A05() {
        if (A01.incrementAndGet(this) == A04()) {
            A02();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        r4.set(r3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C78T r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.GCY
            if (r0 == 0) goto L70
            X.GCY r6 = (X.GCY) r6
            int r0 = X.AbstractC9276GCd.A01
            r5 = 0
            if (r8 < r0) goto Ld
            r5 = 1
            int r8 = r8 - r0
        Ld:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r6.A01
            int r3 = r8 * 2
            java.lang.Object r1 = r4.get(r3)
        L15:
            int r0 = r3 + 1
            java.lang.Object r2 = r4.get(r0)
            boolean r0 = r2 instanceof X.GCR
            if (r0 != 0) goto L4b
            boolean r0 = r2 instanceof X.C9281GCi
            if (r0 != 0) goto L4b
            X.HrH r0 = X.AbstractC9276GCd.A0A
            if (r2 == r0) goto L46
            X.HrH r0 = X.AbstractC9276GCd.A09
            if (r2 == r0) goto L46
            X.HrH r0 = X.AbstractC9276GCd.A0F
            if (r2 == r0) goto L15
            X.HrH r0 = X.AbstractC9276GCd.A0G
            if (r2 == r0) goto L15
            X.HrH r0 = X.AbstractC9276GCd.A07
            if (r2 == r0) goto L6c
            X.HrH r0 = X.AbstractC9276GCd.A03
            if (r2 == r0) goto L6c
            X.HrH r0 = X.AbstractC9276GCd.A04
            if (r2 == r0) goto L6c
            java.lang.String r0 = "unexpected state: "
            java.lang.IllegalStateException r0 = X.AbstractC7607F5u.A10(r2, r0)
            throw r0
        L46:
            r0 = 0
            r4.set(r3, r0)
            goto L5e
        L4b:
            if (r5 == 0) goto L6d
            X.HrH r0 = X.AbstractC9276GCd.A0A
        L4f:
            boolean r0 = r6.A0A(r8, r2, r0)
            if (r0 == 0) goto L15
            r0 = 0
            r4.set(r3, r0)
            r0 = r5 ^ 1
            r6.A09(r8, r0)
        L5e:
            if (r5 == 0) goto L6c
            X.GCV<E> r0 = r6.A00
            X.C7384Etj.A0X(r0)
            X.G0U<E, kotlin.Unit> r0 = r0.A00
            if (r0 == 0) goto L6c
            X.GCT.A01(r1, r7, r0)
        L6c:
            return
        L6d:
            X.HrH r0 = X.AbstractC9276GCd.A09
            goto L4f
        L70:
            X.GCJ r6 = (X.GCJ) r6
            X.HrH r1 = X.GCQ.A03
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.A00
            r0.set(r8, r1)
            r6.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCK.A06(X.78T, int):void");
    }

    public final boolean A07() {
        return A01.addAndGet(this, -65536) == A04() && A00() != null;
    }

    public final boolean A08() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == A04() && A00() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (JTS;I)V */
    public GCK(GCK gck, int i, long j) {
        this._prev$volatile = gck;
        this.A00 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }
}
