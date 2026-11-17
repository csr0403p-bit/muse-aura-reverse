package X;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class Bf0 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[LOOP:0: B:9:0x0015->B:11:0x001b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2584Beg A00(X.InterfaceC2585Beh r3, X.InterfaceC2585Beh r4) {
        /*
            if (r3 != 0) goto L7
            if (r4 != 0) goto L25
            X.Beg r0 = X.C2584Beg.A01
            return r0
        L7:
            if (r4 != 0) goto L25
            X.Bee r2 = X.C2582Bee.A00()
        Ld:
            java.util.Set r0 = r3.APd()
            java.util.Iterator r1 = r0.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()
            X.BdI r0 = (X.AbstractC2531BdI) r0
            A01(r0, r4, r3, r2)
            goto L15
        L25:
            X.Bee r2 = X.C2582Bee.A01(r4)
            if (r3 == 0) goto L2c
            goto Ld
        L2c:
            X.Beg r0 = X.C2584Beg.A02(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bf0.A00(X.Beh, X.Beh):X.Beg");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Bee;LX/Beh;LX/Beh;LX/BdI<*>;)V */
    public static void A01(AbstractC2531BdI abstractC2531BdI, InterfaceC2585Beh interfaceC2585Beh, InterfaceC2585Beh interfaceC2585Beh2, C2582Bee c2582Bee) {
        BY1 by1AIG;
        Object objAbk;
        if (C6xC.A00(abstractC2531BdI, InterfaceC2551Bdc.A05)) {
            C2601Bez c2601Bez = (C2601Bez) interfaceC2585Beh2.Abl(abstractC2531BdI, null);
            C2601Bez c2601Bez2 = (C2601Bez) interfaceC2585Beh.Abl(abstractC2531BdI, null);
            by1AIG = interfaceC2585Beh2.AIG(abstractC2531BdI);
            objAbk = c2601Bez2;
            if (c2601Bez != null) {
                if (c2601Bez2 == null) {
                    objAbk = c2601Bez;
                } else {
                    Bf1 bf1 = c2601Bez2.A01;
                    C2549Bda c2549Bda = c2601Bez2.A02;
                    int i = c2601Bez2.A00;
                    Bf1 bf12 = c2601Bez.A01;
                    if (bf12 != null) {
                        bf1 = bf12;
                    }
                    C2549Bda c2549Bda2 = c2601Bez.A02;
                    if (c2549Bda2 != null) {
                        c2549Bda = c2549Bda2;
                    }
                    int i2 = c2601Bez.A00;
                    if (i2 != 0) {
                        i = i2;
                    }
                    objAbk = new C2601Bez(bf1, c2549Bda, i);
                }
            }
        } else {
            by1AIG = interfaceC2585Beh2.AIG(abstractC2531BdI);
            objAbk = interfaceC2585Beh2.Abk(abstractC2531BdI);
        }
        c2582Bee.ANk(abstractC2531BdI, by1AIG, objAbk);
    }
}
