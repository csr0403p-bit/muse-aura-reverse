package X;

/* renamed from: X.Aed, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1206Aed extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1208Aeg, Aef {
    public static final C1207Aee A04 = new C1207Aee();
    public EnumC1108AYu A00;
    public C1145Aby A01;
    public InterfaceC1220Aey A02;
    public boolean A03;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.AcP r4, X.C1206Aed r5, int r6) {
        /*
            r0 = 5
            if (r6 == r0) goto L1e
            r0 = 6
            if (r6 == r0) goto L1e
            r0 = 3
            if (r6 == r0) goto L19
            r0 = 4
            if (r6 == r0) goto L19
            r0 = 1
            if (r6 == r0) goto L25
            r0 = 2
            if (r6 == r0) goto L25
            java.lang.String r0 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L19:
            X.AYu r2 = r5.A00
            X.AYu r1 = X.EnumC1108AYu.A03
            goto L22
        L1e:
            X.AYu r2 = r5.A00
            X.AYu r1 = X.EnumC1108AYu.A02
        L22:
            r0 = 1
            if (r2 == r1) goto L26
        L25:
            r0 = 0
        L26:
            r3 = 0
            if (r0 != 0) goto L41
            boolean r0 = A01(r5, r6)
            r2 = 1
            if (r0 == 0) goto L3c
            int r1 = r4.A00
            X.Aey r0 = r5.A02
            int r0 = r0.getItemCount()
            int r0 = r0 - r2
            if (r1 >= r0) goto L41
            return r2
        L3c:
            int r0 = r4.A01
            if (r0 <= 0) goto L41
            return r2
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1206Aed.A00(X.AcP, X.Aed, int):boolean");
    }

    public static final boolean A01(C1206Aed c1206Aed, int i) {
        if (!AnonymousClass002.A1Q(i, 1)) {
            if (AnonymousClass002.A1Q(i, 2)) {
                return true;
            }
            if (i != 5) {
                if (i != 6) {
                    if (i == 3) {
                        int iOrdinal = AbstractC1414Aij.A04(c1206Aed).A0G.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw C3cG.A0q();
                            }
                        }
                    } else {
                        if (i != 4) {
                            throw C3cG.A0Q("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int iOrdinal2 = AbstractC1414Aij.A04(c1206Aed).A0G.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                throw C3cG.A0q();
                            }
                        }
                    }
                }
                if (!c1206Aed.A03) {
                    return true;
                }
            }
            return c1206Aed.A03;
        }
        return false;
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(j);
        return AXY.A00(axy, azeAQW, 35, azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
