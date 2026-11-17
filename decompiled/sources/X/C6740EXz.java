package X;

import java.io.IOException;

/* renamed from: X.EXz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6740EXz extends AbstractC6735EXt<Object> {
    public static final EYY A02 = new F4K(EY7.A01, 1);
    public final EYC A00;
    public final EY0 A01;

    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, Object obj) throws IOException {
        if (obj == null) {
            c6733EXr.A0B();
            return;
        }
        AbstractC6735EXt abstractC6735EXtA00 = C6753EYn.A00(this.A00, obj.getClass());
        if (!(abstractC6735EXtA00 instanceof C6740EXz)) {
            abstractC6735EXtA00.write(c6733EXr, obj);
        } else {
            c6733EXr.A08();
            c6733EXr.A0A();
        }
    }

    public C6740EXz(EYC eyc, EY0 ey0) {
        this.A00 = eyc;
        this.A01 = ey0;
    }

    private Object A00(EY1 ey1, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 5) {
            return ey1.A0V();
        }
        if (iIntValue == 6) {
            return this.A01.AZR(ey1);
        }
        if (iIntValue == 7) {
            return Boolean.valueOf(ey1.A0d());
        }
        if (iIntValue != 8) {
            throw BV5.A0U("Unexpected token: ", EY2.A00(num));
        }
        ey1.A0a();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0027 A[SYNTHETIC] */
    @Override // X.AbstractC6735EXt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object read(X.EY1 r8) throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            java.lang.Integer r2 = r8.A0R()
            int r1 = r2.intValue()
            r0 = 0
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L13
            java.lang.Object r6 = r7.A00(r8, r2)
        L12:
            return r6
        L13:
            r8.A0X()
            X.ERD r6 = new X.ERD
            r6.<init>()
            goto L23
        L1c:
            r8.A0W()
            java.util.ArrayList r6 = X.C3cG.A0h()
        L23:
            java.util.ArrayDeque r5 = X.BV4.A0s()
        L27:
            boolean r0 = r8.A0c()
            if (r0 == 0) goto L74
            boolean r0 = r6 instanceof java.util.Map
            if (r0 == 0) goto L72
            java.lang.String r4 = r8.A0U()
        L35:
            java.lang.Integer r3 = r8.A0R()
            int r1 = r3.intValue()
            r0 = 0
            if (r1 == r0) goto L60
            r0 = 2
            if (r1 == r0) goto L68
            r2 = 0
            java.lang.Object r0 = r7.A00(r8, r3)
        L48:
            boolean r1 = r6 instanceof java.util.List
            if (r1 == 0) goto L59
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
        L52:
            if (r2 == 0) goto L27
            r5.addLast(r6)
            r6 = r0
            goto L27
        L59:
            r1 = r6
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r4, r0)
            goto L52
        L60:
            r8.A0W()
            java.util.ArrayList r0 = X.C3cG.A0h()
            goto L70
        L68:
            r8.A0X()
            X.ERD r0 = new X.ERD
            r0.<init>()
        L70:
            r2 = 1
            goto L48
        L72:
            r4 = 0
            goto L35
        L74:
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L86
            r8.A0Y()
        L7b:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L12
            java.lang.Object r6 = r5.removeLast()
            goto L27
        L86:
            r8.A0Z()
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6740EXz.read(X.EY1):java.lang.Object");
    }
}
