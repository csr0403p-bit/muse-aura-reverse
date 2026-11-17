package androidx.glance.session;

/* loaded from: classes3.dex */
public abstract class TimerScopeKt {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/77f;LX/G0V<-LX/77Q;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.InterfaceC066377f r5, X.HtJ r6, X.G0V r7) {
        /*
            r2 = 2
            boolean r0 = r6 instanceof X.C8iO
            if (r0 == 0) goto Ld
            r0 = r6
            X.8iO r0 = (X.C8iO) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r2) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2c
            r4 = r6
            X.8iO r4 = (X.C8iO) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r4.A00 = r2
        L1e:
            java.lang.Object r2 = r4.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L57
            java.lang.Object r7 = r4.A01
            goto L32
        L2c:
            X.8iO r4 = new X.8iO
            r4.<init>(r6)
            goto L1e
        L32:
            X.Hwg.A00(r2)     // Catch: androidx.glance.session.TimeoutCancellationException -> L4c
            return r2
        L36:
            X.Hwg.A00(r2)
            r4.A01 = r7     // Catch: androidx.glance.session.TimeoutCancellationException -> L4c
            r4.A00 = r0     // Catch: androidx.glance.session.TimeoutCancellationException -> L4c
            r2 = 0
            r1 = 28
            X.BUC r0 = new X.BUC     // Catch: androidx.glance.session.TimeoutCancellationException -> L4c
            r0.<init>(r7, r5, r2, r1)     // Catch: androidx.glance.session.TimeoutCancellationException -> L4c
            java.lang.Object r0 = X.Hxb.A00(r0, r4)     // Catch: androidx.glance.session.TimeoutCancellationException -> L4c
            if (r0 != r3) goto L56
            return r3
        L4c:
            r2 = move-exception
            int r1 = r2.block
            int r0 = r7.hashCode()
            if (r1 != r0) goto L5b
            r0 = 0
        L56:
            return r0
        L57:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        L5b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.TimerScopeKt.A00(X.77f, X.HtJ, X.G0V):java.lang.Object");
    }
}
