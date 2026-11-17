package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DMV {
    public final int A00;
    public final int A01;
    public final DMW A02;
    public final C4983DKa A03;
    public final AtomicBoolean A04 = C60O.A1E();

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0014, B:7:0x0018, B:11:0x002c), top: B:17:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMV(int r4, int r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A01 = r4
            r3.A00 = r5
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C60O.A1E()
            r3.A04 = r0
            X.DKd r2 = X.C4983DKa.A01
            X.DKa r1 = X.C4983DKa.A02
            if (r1 != 0) goto L20
            monitor-enter(r2)
            X.DKa r1 = X.C4983DKa.A02     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L1f
            X.DKa r1 = new X.DKa     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            X.C4983DKa.A02 = r1     // Catch: java.lang.Throwable -> L31
        L1f:
            monitor-exit(r2)
        L20:
            r3.A03 = r1
            X.DMW r0 = new X.DMW
            r0.<init>(r3)
            r3.A02 = r0
            java.util.Set<X.DKb> r2 = r1.A00
            monitor-enter(r2)
            r2.add(r0)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)
            return
        L31:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMV.<init>(int, int):void");
    }
}
