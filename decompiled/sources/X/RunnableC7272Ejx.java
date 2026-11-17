package X;

import android.util.SparseArray;

/* renamed from: X.Ejx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7272Ejx implements Runnable {
    public static final String __redex_internal_original_name = "DefaultBitmapFramePreparer$FrameDecodeRunnable";
    public final InterfaceC7275Ek1 A00;
    public final int A01;
    public final int A02;
    public final InterfaceC7278Ek4 A03;
    public final /* synthetic */ Ek0 A04;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A00(int r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r4 = -1
            r5 = 2
            r3 = 0
            if (r10 == r0) goto L26
            r7 = 0
            X.Ek0 r6 = r8.A04     // Catch: java.lang.RuntimeException -> L1d java.lang.Throwable -> L5f
            X.EhM r5 = r6.A03     // Catch: java.lang.RuntimeException -> L1d java.lang.Throwable -> L5f
            X.Ek4 r0 = r8.A03     // Catch: java.lang.RuntimeException -> L1d java.lang.Throwable -> L5f
            int r2 = r0.AGh()     // Catch: java.lang.RuntimeException -> L1d java.lang.Throwable -> L5f
            int r1 = r0.AGg()     // Catch: java.lang.RuntimeException -> L1d java.lang.Throwable -> L5f
            android.graphics.Bitmap$Config r0 = r6.A00     // Catch: java.lang.RuntimeException -> L1d java.lang.Throwable -> L5f
            X.EfF r3 = r5.A00(r0, r2, r1)     // Catch: java.lang.RuntimeException -> L1d java.lang.Throwable -> L5f
            r5 = -1
            goto L2c
        L1d:
            r2 = move-exception
            java.lang.Class<X.Ek0> r1 = X.Ek0.class
            java.lang.String r0 = "Failed to create frame bitmap"
            X.AbstractC3422CMk.A01(r1, r0, r2)     // Catch: java.lang.Throwable -> L5f
            return r7
        L26:
            X.Ek1 r0 = r8.A00     // Catch: java.lang.Throwable -> L5f
            X.EfF r3 = r0.ACq()     // Catch: java.lang.Throwable -> L5f
        L2c:
            boolean r0 = X.EfF.A01(r3)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L50
            if (r3 == 0) goto L50
            X.Ek0 r2 = r8.A04     // Catch: java.lang.Throwable -> L5f
            X.Ehn r1 = r2.A02     // Catch: java.lang.Throwable -> L5f
            android.graphics.Bitmap r0 = X.BV6.A0M(r3)     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r1.A00(r0, r9)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L50
            android.util.SparseArray<java.lang.Runnable> r1 = r2.A01     // Catch: java.lang.Throwable -> L5f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L5f
            X.Ek1 r0 = r8.A00     // Catch: java.lang.Throwable -> L4d
            r0.ATT(r3, r9)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            r7 = 1
            goto L53
        L4d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        L50:
            r7 = 0
            if (r3 == 0) goto L58
        L53:
            r3.close()
            if (r7 != 0) goto L5e
        L58:
            if (r5 == r4) goto L5e
            boolean r7 = r8.A00(r9, r5)
        L5e:
            return r7
        L5f:
            r0 = move-exception
            if (r3 == 0) goto L65
            r3.close()
        L65:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC7272Ejx.A00(int, int):boolean");
    }

    public RunnableC7272Ejx(InterfaceC7278Ek4 interfaceC7278Ek4, InterfaceC7275Ek1 interfaceC7275Ek1, Ek0 ek0, int i, int i2) {
        this.A04 = ek0;
        this.A03 = interfaceC7278Ek4;
        this.A00 = interfaceC7275Ek1;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray<Runnable> sparseArray;
        try {
            InterfaceC7275Ek1 interfaceC7275Ek1 = this.A00;
            int i = this.A02;
            if (interfaceC7275Ek1.A72(i)) {
                sparseArray = this.A04.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
            } else {
                boolean zA00 = A00(i, 1);
                Ek0 ek0 = this.A04;
                if (!zA00) {
                    Object[] objArr = {Integer.valueOf(i)};
                    CFL cfl = AbstractC3422CMk.A00;
                    if (CFL.A02(cfl)) {
                        cfl.e(Ek0.class.getSimpleName(), C7384Etj.A0K("Could not prepare frame %d.", objArr, 1));
                    }
                }
                sparseArray = ek0.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
            }
        } catch (Throwable th) {
            SparseArray<Runnable> sparseArray2 = this.A04.A01;
            synchronized (sparseArray2) {
                sparseArray2.remove(this.A01);
                throw th;
            }
        }
    }
}
