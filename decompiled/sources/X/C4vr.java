package X;

/* renamed from: X.4vr, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4vr<T> implements C20Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ HzR<C2273BRq<Object>> A01;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    @Override // X.C20Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            r3 = 4
            boolean r0 = r9 instanceof X.AnonymousClass609
            if (r0 == 0) goto L52
            r6 = r9
            X.609 r6 = (X.AnonymousClass609) r6
            int r0 = r6.$t
            if (r0 != r3) goto L52
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L43
            if (r0 != r4) goto L58
            X.Hwg.A00(r1)
        L28:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L2b:
            X.Hwg.A00(r1)
            X.HzR<X.BRq<java.lang.Object>> r2 = r7.A01
            int r0 = r7.A00
            X.BRq r1 = new X.BRq
            r1.<init>(r0, r8)
            r0 = 0
            r6.A01 = r0
            r6.A00 = r3
            java.lang.Object r0 = r2.AcU(r1, r6)
            if (r0 != r5) goto L46
            return r5
        L43:
            X.Hwg.A00(r1)
        L46:
            r0 = 0
            r6.A01 = r0
            r6.A00 = r4
            java.lang.Object r0 = X.GBH.A00(r6)
            if (r0 != r5) goto L28
            return r5
        L52:
            X.609 r6 = new X.609
            r6.<init>(r7, r9, r3)
            goto L17
        L58:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4vr.emit(java.lang.Object, X.HtJ):java.lang.Object");
    }

    public C4vr(HzR<C2273BRq<Object>> hzR, int i) {
        this.A01 = hzR;
        this.A00 = i;
    }
}
