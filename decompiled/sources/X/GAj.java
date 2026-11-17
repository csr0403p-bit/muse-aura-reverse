package X;

/* loaded from: classes6.dex */
public abstract class GAj {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R:Ljava/lang/Object;>(LX/GAk<-TT;>;ZTR;LX/G0V<-TR;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(java.lang.Object r2, X.G0V r3, X.GAk r4, boolean r5) throws java.lang.Throwable {
        /*
            r1 = 2
            boolean r0 = r3 instanceof X.AbstractC8884Fsp     // Catch: java.lang.Throwable -> L12 kotlinx.coroutines.DispatchException -> L54
            if (r0 != 0) goto La
            java.lang.Object r3 = X.C7Bm.A00(r2, r4, r3)     // Catch: java.lang.Throwable -> L12 kotlinx.coroutines.DispatchException -> L54
            goto L19
        La:
            X.C0862A6j.A02(r3, r1)     // Catch: java.lang.Throwable -> L12 kotlinx.coroutines.DispatchException -> L54
            java.lang.Object r3 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L12 kotlinx.coroutines.DispatchException -> L54
            goto L19
        L12:
            r1 = move-exception
            r0 = 0
            X.Hkl r3 = new X.Hkl
            r3.<init>(r1, r0)
        L19:
            X.Hji r1 = X.EnumC10460Hji.A02
            if (r3 == r1) goto L53
            java.lang.Object r2 = r4.A0D(r3)
            X.HrH r0 = X.AbstractC9251GBe.A04
            if (r2 == r0) goto L53
            r4.A0X()
            boolean r0 = r2 instanceof X.C10474Hkl
            if (r0 == 0) goto L4e
            if (r5 != 0) goto L4b
            r0 = r2
            X.Hkl r0 = (X.C10474Hkl) r0
            java.lang.Throwable r1 = r0.A00
            boolean r0 = r1 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L3e
            kotlinx.coroutines.TimeoutCancellationException r1 = (kotlinx.coroutines.TimeoutCancellationException) r1
            X.HoC r1 = r1.A00
            r0 = 0
            if (r1 == r4) goto L3f
        L3e:
            r0 = 1
        L3f:
            if (r0 != 0) goto L4b
            boolean r0 = r3 instanceof X.C10474Hkl
            if (r0 == 0) goto L52
            r2 = r3
            X.Hkl r2 = (X.C10474Hkl) r2
        L48:
            java.lang.Throwable r0 = r2.A00
            throw r0
        L4b:
            X.Hkl r2 = (X.C10474Hkl) r2
            goto L48
        L4e:
            java.lang.Object r3 = X.AbstractC9251GBe.A00(r2)
        L52:
            return r3
        L53:
            return r1
        L54:
            r3 = move-exception
            java.lang.Throwable r2 = r3.cause
            r1 = 0
            X.Hkl r0 = new X.Hkl
            r0.<init>(r2, r1)
            r4.A0R(r0)
            java.lang.Throwable r0 = r3.cause
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAj.A00(java.lang.Object, X.G0V, X.GAk, boolean):java.lang.Object");
    }
}
