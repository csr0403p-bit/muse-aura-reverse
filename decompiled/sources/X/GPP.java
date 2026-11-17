package X;

/* loaded from: classes6.dex */
public abstract class GPP {
    public static final GPS A00(GOU gou, GPR gpr, String str) {
        String str2;
        String str3;
        C7384Etj.A0Y(gou, 0);
        if (gpr != null) {
            str2 = gpr.A05;
            str3 = gpr.A06;
        } else {
            str2 = null;
            str3 = null;
        }
        return new GPS(gou, gpr != null ? gpr.A00 : null, A01(gou, gpr, new Hm8(str2, str3), str));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C10606Hye A01(X.GOU r23, X.GPR r24, X.Hm8 r25, java.lang.String r26) {
        /*
            r0 = 3
            r9 = r25
            X.C7384Etj.A0Y(r9, r0)
            r6 = r24
            if (r24 == 0) goto Le
            java.lang.String r10 = r6.A04
            if (r10 != 0) goto L12
        Le:
            java.lang.String r10 = r23.AKi()
        L12:
            java.lang.String r11 = r23.AKi()
            java.lang.String r12 = r23.AJ2()
            long r16 = r23.AJ3()
            java.lang.String r13 = r23.AJ4()
            java.util.List r0 = r23.ALF()
            if (r0 != 0) goto L2a
            X.AGi r0 = X.C0881AGi.A00
        L2a:
            java.util.ArrayList r15 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r8 = r0.iterator()
        L32:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r5 = r8.next()
            X.GPO r5 = (X.GPO) r5
            r4 = 0
            if (r6 == 0) goto L6c
            X.Hlu r0 = r6.A01
            if (r0 == 0) goto L6c
            java.util.List<X.HmS> r0 = r0.A00
            if (r0 == 0) goto L6c
            java.util.Iterator r3 = r0.iterator()
        L4d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.HmS r0 = (X.HmS) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r5.A04
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L4d
        L64:
            X.HmS r2 = (X.HmS) r2
            if (r2 == 0) goto L6c
            java.lang.String r4 = r2.A01
            if (r4 != 0) goto L6e
        L6c:
            java.lang.String r4 = ""
        L6e:
            java.lang.String r7 = r5.A03
            long r0 = r5.A02
            java.lang.String r3 = r5.A05
            java.lang.Integer r19 = X.C79.A00
            java.lang.String r2 = "Day"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9e
            java.lang.Integer r19 = X.C79.A01
            java.lang.String r2 = "Week"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9e
            java.lang.Integer r19 = X.C79.A0C
            java.lang.String r2 = "Month"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9e
            java.lang.Integer r19 = X.C79.A0K
            java.lang.String r2 = "Year"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9e
            java.lang.Integer r19 = X.C79.A0P
        L9e:
            int r3 = r5.A01
            int r5 = r5.A00
            X.Hyb r2 = new X.Hyb
            r18 = r2
            r20 = r4
            r21 = r7
            r22 = r3
            r23 = r5
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r15.add(r2)
            goto L32
        Lb8:
            r2 = r4
            goto L64
        Lba:
            X.Hye r8 = new X.Hye
            r14 = r26
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GPP.A01(X.GOU, X.GPR, X.Hm8, java.lang.String):X.Hye");
    }
}
