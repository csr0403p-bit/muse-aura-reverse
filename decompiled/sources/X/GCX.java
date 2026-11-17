package X;

import kotlin.Unit;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes6.dex */
public final class GCX<E> extends GCV<E> {
    public final Integer A00;

    public GCX(int i, Integer num) {
        super(i, null);
        this.A00 = num;
        if (num == C79.A00) {
            throw new IllegalArgumentException(FGI.A0U("This implementation does not support suspension for senders, use ", C0861A6i.A01(GCV.class), " instead"));
        }
        if (i < 1) {
            throw new IllegalArgumentException(FGI.A0I("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        return new X.Ho5(A0I());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A05(E r14, boolean r15) throws kotlinx.coroutines.DispatchException {
        /*
            r13 = this;
            r10 = r13
            java.lang.Integer r1 = r13.A00
            java.lang.Integer r0 = X.C79.A0C
            r8 = r14
            if (r1 != r0) goto L26
            java.lang.Object r1 = super.AhZ(r14)
            boolean r0 = r1 instanceof X.C2zT
            r0 = r0 ^ 1
            if (r0 != 0) goto L25
            boolean r0 = r1 instanceof X.Ho5
            if (r0 != 0) goto L25
            if (r15 == 0) goto L23
            X.G0U<E, kotlin.Unit> r1 = r13.A00
            if (r1 == 0) goto L23
            r0 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = X.GCT.A00(r14, r1, r0)
            if (r1 != 0) goto Lae
        L23:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L25:
            return r1
        L26:
            X.HrH r9 = X.AbstractC9276GCd.A03
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GCV.A0B
            java.lang.Object r11 = r0.get(r13)
            X.GCY r11 = (X.GCY) r11
        L30:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A06
            long r0 = r0.getAndIncrement(r10)
            r13 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r13 & r0
            r2 = 0
            boolean r15 = X.GCV.A0G(r10, r0, r2)
            int r6 = X.AbstractC9276GCd.A01
            long r0 = (long) r6
            long r2 = r13 / r0
            long r4 = r13 % r0
            int r12 = (int) r4
            long r4 = r11.A00
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L62
            X.GCY r2 = X.GCV.A07(r10, r11, r2)
            if (r2 != 0) goto L61
            if (r15 == 0) goto L30
        L57:
            java.lang.Throwable r0 = r10.A0I()
            X.Ho5 r1 = new X.Ho5
            r1.<init>(r0)
            return r1
        L61:
            r11 = r2
        L62:
            int r3 = X.GCV.A00(r8, r9, r10, r11, r12, r13, r15)
            if (r3 == 0) goto La2
            r2 = 1
            if (r3 == r2) goto L23
            r2 = 2
            if (r3 == r2) goto L86
            r0 = 3
            if (r3 == r0) goto La7
            r0 = 4
            if (r3 == r0) goto L78
            r11.A01()
            goto L30
        L78:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A05
            long r1 = r0.get(r10)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L57
            r11.A01()
            goto L57
        L86:
            if (r15 == 0) goto L8c
            r11.A05()
            goto L57
        L8c:
            boolean r2 = r9 instanceof X.GCR
            if (r2 == 0) goto L99
            X.GCR r9 = (X.GCR) r9
            if (r9 == 0) goto L99
            int r2 = r12 + r6
            r9.AO3(r11, r2)
        L99:
            long r2 = r11.A00
            long r2 = r2 * r0
            long r0 = (long) r12
            long r2 = r2 + r0
            r10.A0J(r2)
            goto L23
        La2:
            r11.A01()
            goto L23
        La7:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        Lae:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCX.A05(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // X.GCV, X.HxO
    public final Object AcU(E e, HtJ<? super Unit> htJ) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionA00;
        if (!(A05(e, true) instanceof Ho5)) {
            return Unit.INSTANCE;
        }
        G0U<E, Unit> g0u = super.A00;
        if (g0u == null || (undeliveredElementExceptionA00 = GCT.A00(e, g0u, null)) == null) {
            throw A0I();
        }
        CU7.A01(undeliveredElementExceptionA00, A0I());
        throw undeliveredElementExceptionA00;
    }

    @Override // X.GCV, X.HxO
    public final Object AhZ(E e) {
        return A05(e, false);
    }
}
