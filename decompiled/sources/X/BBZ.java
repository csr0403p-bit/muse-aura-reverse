package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class BBZ {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(X.BBJ r6, java.lang.Integer r7, int r8) {
        /*
            boolean r0 = r6.A0F
            if (r0 != 0) goto L74
            int[] r2 = r6.A0G
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r6.A04
            int r1 = r1 - r0
            if (r1 == 0) goto L74
            java.util.ArrayList r4 = X.C3cG.A0h()
            if (r7 == 0) goto L6b
            int r0 = r7.intValue()
        L18:
            int r1 = X.BBJ.A02(r6, r8)
            int r3 = r1 * 5
            int[] r2 = r6.A0G
            int r1 = r2.length
            if (r3 >= r1) goto L67
            r5 = r2[r3]
        L25:
            if (r8 < 0) goto L76
            int r1 = X.BBJ.A02(r6, r8)
            int r1 = r1 * 5
            int r1 = r1 + 1
            r2 = r2[r1]
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r1
            if (r2 == 0) goto L64
            java.lang.Object r1 = r6.A0N(r8)
        L3a:
            r6.A0X(r8)
            r3 = 0
            java.lang.Object r2 = X.C78N.A00
            boolean r1 = X.C7384Etj.areEqual(r1, r2)
            if (r1 == 0) goto L4e
            X.AH3 r1 = new X.AH3
            r1.<init>(r5, r3)
            r4.add(r1)
        L4e:
            r6.A0M(r8)
            if (r0 < 0) goto L76
        L53:
            int[] r2 = r6.A0G
            int r1 = X.BBJ.A04(r6, r2, r0)
        L59:
            r8 = r0
            int r0 = X.BBJ.A02(r6, r0)
            int r0 = r0 * 5
            r5 = r2[r0]
            r0 = r1
            goto L25
        L64:
            java.lang.Object r1 = X.C78N.A00
            goto L3a
        L67:
            if (r0 >= 0) goto L53
            r1 = r0
            goto L59
        L6b:
            int r0 = r6.A08
            if (r0 >= 0) goto L18
            int r0 = X.BBJ.A04(r6, r2, r8)
            goto L18
        L74:
            X.AGi r4 = X.C0881AGi.A00
        L76:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBZ.A01(X.BBJ, java.lang.Integer, int):java.util.List");
    }

    public static final ArrayList A00(BBQ bbq, int i) {
        ArrayList arrayListA0h = C3cG.A0h();
        int[] iArr = bbq.A0C;
        int i2 = iArr[(i * 5) + 2];
        int i3 = i2;
        bbq.A03(i);
        if (i >= 0) {
            while (true) {
                Object objA00 = bbq.A0E(i) ? BBQ.A00(bbq, iArr, i) : C78N.A00;
                int i4 = iArr[i * 5];
                bbq.A0B.A03(i);
                if (C7384Etj.areEqual(objA00, C78N.A00)) {
                    arrayListA0h.add(new AH3(i4, null));
                }
                if (i2 < 0) {
                    break;
                }
                bbq.A03(i2);
                i2 = iArr[(i2 * 5) + 2];
                i = i3;
                i3 = i2;
            }
        }
        return arrayListA0h;
    }
}
