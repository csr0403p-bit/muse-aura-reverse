package X;

/* renamed from: X.3yZ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3yZ implements C20Q {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.C20Z<? super T> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            r6 = 1
            boolean r0 = r9 instanceof X.C60A
            if (r0 == 0) goto L27
            r5 = r9
            X.60A r5 = (X.C60A) r5
            int r0 = r5.$t
            if (r0 != r6) goto L27
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A03
            X.Hji r3 = X.EnumC10460Hji.A02
            r1 = r3
            int r0 = r5.A00
            if (r0 == 0) goto L39
            if (r0 != r6) goto L31
            java.lang.Object r2 = r5.A02
            X.HzP r2 = (X.HzP) r2
            goto L2d
        L27:
            X.60A r5 = new X.60A
            r5.<init>(r7, r9, r6)
            goto L17
        L2d:
            X.Hwg.A00(r4)     // Catch: java.lang.Throwable -> L5d
            goto L57
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L39:
            X.Hwg.A00(r4)
            X.78T r0 = r5.getContext()
            X.FWp r2 = new X.FWp
            r2.<init>(r0, r8)
            r0 = 0
            r5.A01 = r0     // Catch: java.lang.Throwable -> L5d
            r5.A02 = r2     // Catch: java.lang.Throwable -> L5d
            r5.A00 = r6     // Catch: java.lang.Throwable -> L5d
            X.3ul r7 = (X.C05663ul) r7     // Catch: java.lang.Throwable -> L5d
            X.G0V<X.20Z<? super T>, X.HtJ<? super kotlin.Unit>, java.lang.Object> r0 = r7.A00     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r0.invoke(r2, r5)     // Catch: java.lang.Throwable -> L5d
            if (r0 != r3) goto L57
            return r1
        L57:
            r2.releaseIntercepted()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L5d:
            r1 = move-exception
            r2.releaseIntercepted()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3yZ.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
