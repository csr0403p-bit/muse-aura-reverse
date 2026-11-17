package X;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class CU3 extends CU4 {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // X.CU4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.Throwable> A00(java.lang.Throwable r5) {
        /*
            r4 = this;
            r3 = 0
            X.C7384Etj.A0Y(r5, r3)
            r2 = 19
            java.lang.Integer r0 = X.CU2.A00
            if (r0 == 0) goto L11
            int r1 = r0.intValue()
            r0 = 0
            if (r1 < r2) goto L12
        L11:
            r0 = 1
        L12:
            if (r0 == 0) goto L2e
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r0 = "getSuppressed"
            r1 = 0
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r1)     // Catch: java.lang.Exception -> L24
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L24
            java.lang.Throwable[] r0 = (java.lang.Throwable[]) r0     // Catch: java.lang.Exception -> L24
            goto L26
        L24:
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
        L26:
            X.C7384Etj.A0U(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
        L2e:
            java.util.List r0 = super.A00(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CU3.A00(java.lang.Throwable):java.util.List");
    }

    public CU3(int i) {
    }

    @Override // X.CU4
    public final void A01(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AnonymousClass003.A0u(th, th2);
        Integer num = CU2.A00;
        if (num == null || num.intValue() >= 19) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } else {
            super.A01(th, th2);
        }
    }

    public CU3() {
    }
}
