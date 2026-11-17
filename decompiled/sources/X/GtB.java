package X;

/* loaded from: classes6.dex */
public final class GtB extends Gt9 {
    public boolean A00;

    private final boolean A06(Gt4 gt4) {
        if (gt4 != null && (gt4 instanceof Gt3)) {
            Gt3 gt3 = (Gt3) gt4;
            if (!AbstractC7608F5v.A1X("br", gt3)) {
                int i = gt3.A02.A00;
                if ((i & 4) == 0) {
                    if ((i & 1) == 0) {
                        if (!(((Gt4) gt3).A01 instanceof Gt8)) {
                            Gt3 gt3A0a = gt3.A0a();
                            int i2 = 0;
                            while (gt3A0a != null) {
                                if ((gt3A0a.A02.A00 & 4) == 0 && (gt3A0a.A02.A00 & 1) != 0) {
                                    gt3A0a = gt3A0a.A0E();
                                    i2++;
                                    if (i2 >= 5) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A07(Gt4 gt4) {
        if (gt4 != null && gt4 != this.A02 && !this.A00 && !A00(gt4)) {
            if (!A06(gt4)) {
                Gt4 gt4A0I = gt4;
                do {
                    gt4A0I = gt4A0I.A0I();
                } while (A00(gt4A0I));
                if (!A06(gt4A0I)) {
                    Gt3 gt3 = gt4.A01;
                    if (A06(gt3) && (gt3.A02.A00 & 8) == 0) {
                        Gt4 gt4A0G = gt3.A0G();
                        int i = 0;
                        while (true) {
                            if (gt4A0G != null) {
                                if (gt4A0G instanceof C10262GtH) {
                                    gt4A0G = gt4A0G.A0H();
                                    i++;
                                    if (i >= 5) {
                                        break;
                                    }
                                } else if (gt4A0I == null || (!(gt4A0I instanceof C10262GtH) && (A06(gt4A0I) || !(gt4A0I instanceof Gt3)))) {
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean A00(Gt4 gt4) {
        return (gt4 instanceof C10262GtH) && Gt5.A08(((GtD) gt4).A0T());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // X.Gt9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C10262GtH r4, int r5, int r6) {
        /*
            r3 = this;
            boolean r0 = r3.A00
            if (r0 != 0) goto L57
            r5 = r5 | 4
            X.Gt3 r0 = r4.A01
            boolean r0 = r3.A06(r0)
            if (r0 == 0) goto L3c
            X.Gt4 r2 = r4.A0I()
            X.Gt4 r1 = r4.A0H()
            boolean r0 = r2 instanceof X.Gt3
            if (r0 == 0) goto L20
            boolean r0 = r3.A06(r2)
            if (r0 == 0) goto L2e
        L20:
            if (r2 == 0) goto L2c
            boolean r0 = r2 instanceof X.C10262GtH
            if (r0 != 0) goto L2e
            boolean r0 = r3.A07(r2)
            if (r0 == 0) goto L2e
        L2c:
            r5 = r5 | 8
        L2e:
            if (r1 == 0) goto L3a
            boolean r0 = r1 instanceof X.C10262GtH
            if (r0 != 0) goto L5b
            boolean r0 = r3.A07(r1)
            if (r0 == 0) goto L5b
        L3a:
            r5 = r5 | 16
        L3c:
            java.lang.String r0 = r4.A0T()
            boolean r0 = X.Gt5.A08(r0)
            if (r0 != 0) goto L57
            X.Gt3 r0 = r4.A01
            boolean r0 = r3.A06(r0)
            if (r0 == 0) goto L57
            boolean r0 = r3.A07(r4)
            if (r0 == 0) goto L57
            r3.A01(r6)
        L57:
            super.A05(r4, r5, r6)
            return
        L5b:
            boolean r0 = A00(r1)
            if (r0 == 0) goto L66
            X.Gt4 r1 = r1.A0H()
            goto L5b
        L66:
            boolean r0 = r1 instanceof X.C10262GtH
            if (r0 == 0) goto L3c
            java.lang.String r1 = r1.A08()
            r0 = 0
            int r0 = r1.codePointAt(r0)
            boolean r0 = X.Gt5.A07(r0)
            if (r0 == 0) goto L3c
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GtB.A05(X.GtH, int, int):void");
    }

    public GtB(Hy9 hy9, C10532Hqa c10532Hqa, Gt4 gt4) {
        super(hy9, c10532Hqa, gt4);
        this.A00 = false;
        while (gt4 != null) {
            if ((gt4 instanceof Gt3) && (((Gt3) gt4).A02.A00 & 64) != 0) {
                this.A00 = true;
                return;
            }
            gt4 = gt4.A01;
        }
    }

    @Override // X.Gt9
    public final void A03(Gt3 gt3, int i) {
        if (A07(gt3)) {
            A01(i);
        }
        super.A03(gt3, i);
        if (gt3 == null || (gt3.A02.A00 & 64) == 0) {
            return;
        }
        this.A00 = true;
    }

    @Override // X.Gt9
    public final void A04(GtD gtD, int i) {
        if (A07(gtD)) {
            A01(i);
        }
        super.A04(gtD, i);
    }
}
