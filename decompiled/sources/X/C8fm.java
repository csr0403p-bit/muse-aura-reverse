package X;

/* renamed from: X.8fm, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C8fm {
    /* JADX WARN: Incorrect types in method signature: (LX/HyO<*>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.HtJ r5, kotlin.jvm.functions.Function0 r6, X.HyO r7) {
        /*
            r1 = 2
            boolean r0 = r5 instanceof X.C8iQ
            if (r0 == 0) goto L27
            r4 = r5
            X.8iQ r4 = (X.C8iQ) r4
            int r0 = r4.$t
            if (r0 != r1) goto L27
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.A01 = r2
        L17:
            java.lang.Object r1 = r4.A04
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A01
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L31
            java.lang.Object r6 = r4.A03
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            goto L2d
        L27:
            X.8iQ r4 = new X.8iQ
            r4.<init>(r5)
            goto L17
        L2d:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L68
            goto L62
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r1)
            X.78T r1 = r4.getContext()
            X.GQE r0 = X.HoC.A00
            X.78X r0 = r1.get(r0)
            if (r0 != r7) goto L6d
            r4.A02 = r7     // Catch: java.lang.Throwable -> L68
            r4.A03 = r6     // Catch: java.lang.Throwable -> L68
            r0 = 0
            r4.A00 = r0     // Catch: java.lang.Throwable -> L68
            r4.A01 = r2     // Catch: java.lang.Throwable -> L68
            X.GBL r2 = X.C7Bm.A04(r4)     // Catch: java.lang.Throwable -> L68
            r1 = 6
            X.8i5 r0 = new X.8i5     // Catch: java.lang.Throwable -> L68
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L68
            r7.AO4(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r2.A0F()     // Catch: java.lang.Throwable -> L68
            if (r0 != r3) goto L62
            return r3
        L62:
            r6.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L68:
            r0 = move-exception
            r6.invoke()
            throw r0
        L6d:
            java.lang.String r0 = "awaitClose() can only be invoked from the producer context"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8fm.A00(X.HtJ, kotlin.jvm.functions.Function0, X.HyO):java.lang.Object");
    }
}
