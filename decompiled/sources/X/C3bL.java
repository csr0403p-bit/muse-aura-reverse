package X;

/* renamed from: X.3bL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bL implements C20Z {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C3bL(Object obj, InterfaceC05161qu<Boolean> interfaceC05161qu, AOP<EnumC04711Bv> aop, C1BO<? extends G0V<? super EnumC04711Bv, ? super EnumC04711Bv, Boolean>> c1bo) {
        this.$t = c1bo;
        this.A00 = interfaceC05161qu;
        this.A01 = obj;
        this.A02 = aop;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[RETURN] */
    @Override // X.C20Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(T r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            int r0 = r7.$t
            if (r0 == 0) goto L7b
            r6 = 2
            boolean r0 = r9 instanceof X.C3be
            if (r0 == 0) goto L30
            r5 = r9
            X.3be r5 = (X.C3be) r5
            int r0 = r5.$t
            if (r0 != r6) goto L30
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r5.A00 = r2
        L1b:
            java.lang.Object r1 = r5.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 3
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto Lad
            if (r0 == r6) goto L60
            if (r0 == r3) goto Lad
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.3be r5 = new X.3be
            r5.<init>(r7, r9, r6)
            goto L1b
        L36:
            X.Hwg.A00(r1)
            java.lang.Object r0 = r7.A00
            X.F1F r0 = (X.F1F) r0
            boolean r0 = r0.element
            if (r0 == 0) goto L51
            java.lang.Object r1 = r7.A02
            X.20Z r1 = (X.C20Z) r1
            r0 = 0
            r5.A01 = r0
            r5.A00 = r2
        L4a:
            java.lang.Object r0 = r1.emit(r8, r5)
            if (r0 != r4) goto Lb0
            return r4
        L51:
            java.lang.Object r0 = r7.A01
            X.G0V r0 = (X.G0V) r0
            r5.A01 = r8
            r5.A00 = r6
            java.lang.Object r1 = r0.invoke(r8, r5)
            if (r1 != r4) goto L65
            return r4
        L60:
            java.lang.Object r8 = r5.A01
            X.Hwg.A00(r1)
        L65:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto Lb0
            java.lang.Object r0 = r7.A00
            X.F1F r0 = (X.F1F) r0
            r0.element = r2
            java.lang.Object r1 = r7.A02
            X.20Z r1 = (X.C20Z) r1
            r0 = 0
            r5.A01 = r0
            r5.A00 = r3
            goto L4a
        L7b:
            boolean r0 = X.AnonymousClass001.A1X(r8)
            java.lang.Object r4 = r7.A00
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r7.A02
            X.1BO r0 = (X.C1BO) r0
            java.lang.Object r3 = r0.getValue()
            X.G0V r3 = (X.G0V) r3
            java.lang.Object r2 = r7.A01
            X.AOP r2 = (X.AOP) r2
            X.AOH<S> r0 = r2.A02
            java.lang.Object r1 = r0.A09()
            androidx.compose.runtime.MutableState r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r3.invoke(r1, r0)
            boolean r0 = X.AnonymousClass001.A1X(r0)
        La7:
            androidx.compose.runtime.MutableState.A09(r0, r4)
            goto Lb0
        Lab:
            r0 = 0
            goto La7
        Lad:
            X.Hwg.A00(r1)
        Lb0:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3bL.emit(java.lang.Object, X.HtJ):java.lang.Object");
    }
}
