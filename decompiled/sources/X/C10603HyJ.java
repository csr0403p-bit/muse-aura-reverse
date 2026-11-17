package X;

/* renamed from: X.HyJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10603HyJ {
    public static final C10603HyJ A00 = new C10603HyJ();
    public static volatile C10603HyJ A01;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0026, TRY_ENTER, TryCatch #1 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0012, B:13:0x0020, B:14:0x0022, B:15:0x0024), top: B:24:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00() {
        /*
            X.HyJ r0 = X.C10603HyJ.A01
            if (r0 != 0) goto L29
            java.lang.Class<X.HyJ> r3 = X.C10603HyJ.class
            monitor-enter(r3)
            X.HyJ r0 = X.C10603HyJ.A01     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L24
            java.lang.String r2 = "getEmptyRegistry"
            java.lang.Class r0 = X.AbstractC10615Hyx.A00     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L26
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L26
            X.HyJ r0 = (X.C10603HyJ) r0     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L26
            r1 = r0
        L1d:
            if (r1 == 0) goto L20
            goto L22
        L20:
            X.HyJ r1 = X.C10603HyJ.A00     // Catch: java.lang.Throwable -> L26
        L22:
            X.C10603HyJ.A01 = r1     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r0
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10603HyJ.A00():void");
    }
}
