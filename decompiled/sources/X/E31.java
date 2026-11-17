package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class E31 {
    public final E33 A00 = new E33(new F5Y(this, 2));
    public final InterfaceC5563Dkg[] A01;
    public final List<C6154Dwx> A02;

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC6413E4p r8, X.E4I r9) {
        /*
            r7 = this;
            r4 = 0
        L1:
            X.Dkg[] r3 = r7.A01
            int r0 = r3.length
            if (r4 >= r0) goto L6b
            r9.A03()
            X.E4I.A02(r9)
            int r1 = r9.A00
            r0 = 3
            X.Dkg r2 = r8.AhC(r1, r0)
            java.util.List<X.Dwx> r0 = r7.A02
            java.lang.Object r5 = r0.get(r4)
            X.Dwx r5 = (X.C6154Dwx) r5
            java.lang.String r6 = r5.A0b
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 == 0) goto L2f
        L2e:
            r1 = 1
        L2f:
            java.lang.String r0 = "Invalid closed caption MIME type provided: "
            java.lang.String r0 = X.FGI.A0M(r0, r6)
            X.C1G.A09(r1, r0)
            java.lang.String r0 = r5.A0Y
            if (r0 == 0) goto L65
            java.lang.String r0 = r5.A0Y
        L3e:
            X.Dx5 r1 = X.C6162Dx5.A00()
            r1.A0W = r0
            java.lang.String r0 = "video/mp2t"
            r1.A05(r0)
            r1.A06(r6)
            int r0 = r5.A0M
            r1.A0K = r0
            java.lang.String r0 = r5.A0a
            r1.A0Y = r0
            int r0 = r5.A03
            r1.A02 = r0
            java.util.List<byte[]> r0 = r5.A0c
            r1.A0a = r0
            X.InterfaceC5563Dkg.A00(r1, r2)
            r3[r4] = r2
            int r4 = r4 + 1
            goto L1
        L65:
            X.E4I.A02(r9)
            java.lang.String r0 = r9.A01
            goto L3e
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E31.A00(X.E4p, X.E4I):void");
    }

    public E31(List list) {
        this.A02 = list;
        this.A01 = new InterfaceC5563Dkg[list.size()];
    }
}
