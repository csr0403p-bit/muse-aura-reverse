package X;

/* loaded from: classes5.dex */
public final class EYG implements EYY {
    public final EYQ A00;

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    @Override // X.EYY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> X.AbstractC6735EXt<T> create(X.EYC r8, X.C6753EYn<T> r9) {
        /*
            r7 = this;
            java.lang.reflect.Type r6 = r9.A02
            java.lang.Class<? super T> r5 = r9.A01
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r0 = r1.isAssignableFrom(r5)
            if (r0 != 0) goto Le
            r3 = 0
            return r3
        Le:
            java.lang.Class<java.util.Properties> r0 = java.util.Properties.class
            boolean r0 = r0.isAssignableFrom(r5)
            r4 = 1
            r3 = 0
            r2 = 2
            if (r0 == 0) goto L4e
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
        L1d:
            r2[r3] = r0
            r2[r4] = r0
        L21:
            r1 = r2[r3]
            r3 = r2[r4]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 == r0) goto L4b
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 == r0) goto L4b
            X.EXt r0 = X.C6753EYn.A00(r8, r1)
        L31:
            X.EYL r2 = new X.EYL
            r2.<init>(r8, r0, r1)
            X.EXt r0 = X.C6753EYn.A00(r8, r3)
            X.EYL r1 = new X.EYL
            r1.<init>(r8, r0, r3)
            X.EYQ r0 = r7.A00
            X.EXx r0 = r0.A01(r9)
            X.EXs r3 = new X.EXs
            r3.<init>(r2, r1, r0, r7)
            return r3
        L4b:
            X.EXt<java.lang.Boolean> r0 = X.EYB.A07
            goto L31
        L4e:
            java.lang.reflect.Type r1 = X.AbstractC6754EYo.A02(r5, r1, r6)
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L5d
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r2 = r1.getActualTypeArguments()
            goto L21
        L5d:
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYG.create(X.EYC, X.EYn):X.EXt");
    }

    public EYG(EYQ eyq) {
        this.A00 = eyq;
    }
}
