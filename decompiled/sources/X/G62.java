package X;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class G62 {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/20Q<+TT;>;LX/20Z<-TT;>;LX/HtJ<-Ljava/lang/Throwable;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.HtJ r6, X.C20Q r7, X.C20Z r8) throws java.lang.Throwable {
        /*
            r3 = 17
            boolean r0 = r6 instanceof X.C8912FtU
            if (r0 == 0) goto L28
            r5 = r6
            X.FtU r5 = (X.C8912FtU) r5
            int r0 = r5.$t
            if (r0 != r3) goto L28
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r1 = r5.A04
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L32
            java.lang.Object r2 = r5.A03
            X.Hqv r2 = (X.C10543Hqv) r2
            goto L2e
        L28:
            X.FtU r5 = new X.FtU
            r5.<init>(r3, r6)
            goto L18
        L2e:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L53
            goto L51
        L32:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L37:
            X.Hqv r2 = X.C3cG.A10(r1)
            r0 = 2
            X.I0r r1 = new X.I0r     // Catch: java.lang.Throwable -> L53
            r1.<init>(r0, r8, r2)     // Catch: java.lang.Throwable -> L53
            r0 = 0
            r5.A01 = r0     // Catch: java.lang.Throwable -> L53
            r5.A02 = r0     // Catch: java.lang.Throwable -> L53
            r5.A03 = r2     // Catch: java.lang.Throwable -> L53
            r5.A00 = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r7.collect(r1, r5)     // Catch: java.lang.Throwable -> L53
            if (r0 != r4) goto L51
            return r4
        L51:
            r4 = 0
            return r4
        L53:
            r3 = move-exception
            T r2 = r2.element
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L61
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L61
            throw r3
        L61:
            X.78T r1 = r5.getContext()
            X.GQE r0 = X.HoC.A00
            X.78X r1 = r1.get(r0)
            X.HoC r1 = (X.HoC) r1
            if (r1 == 0) goto L82
            boolean r0 = r1.isCancelled()
            if (r0 == 0) goto L82
            java.util.concurrent.CancellationException r0 = r1.ADQ()
            if (r0 == 0) goto L82
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L82
            throw r3
        L82:
            if (r2 != 0) goto L85
            return r3
        L85:
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8d
            X.CU7.A01(r2, r3)
            throw r2
        L8d:
            X.CU7.A01(r3, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G62.A00(X.HtJ, X.20Q, X.20Z):java.lang.Object");
    }
}
