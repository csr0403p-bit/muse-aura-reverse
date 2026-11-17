package X;

/* loaded from: classes4.dex */
public final class Ao2 extends AoF {
    public static Ao2 A01;
    public C1958Aux A00;
    public static final Integer A03 = C79.A01;
    public static final Integer A02 = C79.A00;

    private final int A00(Integer num, int i) {
        C1958Aux c1958Aux = this.A00;
        if (c1958Aux == null) {
            C7384Etj.A0b("layoutResult");
            throw F60.createAndThrow();
        }
        int iA03 = c1958Aux.A03(i);
        C1958Aux c1958Aux2 = this.A00;
        if (c1958Aux2 == null) {
            C7384Etj.A0b("layoutResult");
            throw F60.createAndThrow();
        }
        Integer numA09 = c1958Aux2.A09(iA03);
        C1958Aux c1958Aux3 = this.A00;
        if (num != numA09) {
            if (c1958Aux3 != null) {
                return c1958Aux3.A03(i);
            }
            C7384Etj.A0b("layoutResult");
            throw F60.createAndThrow();
        }
        if (c1958Aux3 != null) {
            return c1958Aux3.A03.A0A(i, false) - 1;
        }
        C7384Etj.A0b("layoutResult");
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // X.InterfaceC1686AoP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] ABi(int r6) {
        /*
            r5 = this;
            int r0 = X.AoF.A01(r5)
            r4 = 0
            if (r0 <= 0) goto L65
            int r0 = X.AoF.A01(r5)
            if (r6 >= r0) goto L65
            X.Aux r0 = r5.A00
            java.lang.String r3 = "layoutResult"
            if (r6 >= 0) goto L1d
            if (r0 != 0) goto L38
            X.C7384Etj.A0b(r3)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1d:
            if (r0 != 0) goto L27
            X.C7384Etj.A0b(r3)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L27:
            X.Auv r0 = r0.A03
            int r1 = r0.A09(r6)
            java.lang.Integer r0 = X.Ao2.A03
            int r0 = r5.A00(r0, r1)
            int r2 = r1 + 1
            if (r0 != r6) goto L40
            goto L3f
        L38:
            r1 = 0
            X.Auv r0 = r0.A03
            int r1 = r0.A09(r1)
        L3f:
            r2 = r1
        L40:
            X.Aux r0 = r5.A00
            if (r0 != 0) goto L4c
            X.C7384Etj.A0b(r3)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L4c:
            X.Auv r0 = r0.A03
            int r0 = r0.A02
            if (r2 >= r0) goto L65
            java.lang.Integer r0 = X.Ao2.A03
            int r1 = r5.A00(r0, r2)
            java.lang.Integer r0 = X.Ao2.A02
            int r0 = r5.A00(r0, r2)
            int r0 = r0 + 1
            int[] r0 = r5.A03(r1, r0)
            return r0
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ao2.ABi(int):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // X.InterfaceC1686AoP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] AYK(int r5) {
        /*
            r4 = this;
            int r0 = X.AoF.A01(r4)
            r3 = 0
            if (r0 <= 0) goto L5a
            if (r5 <= 0) goto L5a
            int r1 = X.AoF.A01(r4)
            X.Aux r2 = r4.A00
            java.lang.String r0 = "layoutResult"
            if (r5 <= r1) goto L1d
            if (r2 != 0) goto L3a
            X.C7384Etj.A0b(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1d:
            if (r2 != 0) goto L27
            X.C7384Etj.A0b(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L27:
            X.Auv r0 = r2.A03
            int r1 = r0.A09(r5)
            java.lang.Integer r0 = X.Ao2.A02
            int r0 = r4.A00(r0, r1)
            int r0 = r0 + 1
            int r2 = r1 + (-1)
            if (r0 != r5) goto L45
            goto L44
        L3a:
            int r1 = X.AoF.A01(r4)
            X.Auv r0 = r2.A03
            int r1 = r0.A09(r1)
        L44:
            r2 = r1
        L45:
            if (r2 < 0) goto L5a
            java.lang.Integer r0 = X.Ao2.A03
            int r1 = r4.A00(r0, r2)
            java.lang.Integer r0 = X.Ao2.A02
            int r0 = r4.A00(r0, r2)
            int r0 = r0 + 1
            int[] r0 = r4.A03(r1, r0)
            return r0
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ao2.AYK(int):int[]");
    }
}
