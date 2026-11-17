package X;

/* renamed from: X.AiE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1384AiE implements InterfaceC1497Ak4 {
    public final AbstractC1383AiD A00;

    @Override // X.InterfaceC1497Ak4
    public final long APm(InterfaceC1497Ak4 interfaceC1497Ak4, long j) {
        return APn(interfaceC1497Ak4, j, true);
    }

    private final long A00() {
        AbstractC1383AiD abstractC1383AiD = this.A00;
        AbstractC1383AiD abstractC1383AiDA01 = A01(abstractC1383AiD);
        return AWx.A04(APn(abstractC1383AiDA01.A04, 0L, true), abstractC1383AiD.A05.APn(abstractC1383AiDA01.A05, 0L, true));
    }

    public static final AbstractC1383AiD A01(AbstractC1383AiD abstractC1383AiD) {
        C1453AjM c1453AjMA0E = abstractC1383AiD.A05.A0P;
        while (true) {
            C1453AjM c1453AjMA0E2 = c1453AjMA0E.A0E();
            if (c1453AjMA0E2 == null || c1453AjMA0E2.A0B == null) {
                break;
            }
            C1453AjM c1453AjMA0E3 = c1453AjMA0E.A0E();
            C1453AjM c1453AjM = c1453AjMA0E3 != null ? c1453AjMA0E3.A0B : null;
            C7384Etj.A0X(c1453AjM);
            boolean z = c1453AjM.A0T;
            c1453AjMA0E = c1453AjMA0E.A0E();
            if (!z) {
                C7384Etj.A0X(c1453AjMA0E);
                c1453AjMA0E = c1453AjMA0E.A0B;
            }
            C7384Etj.A0X(c1453AjMA0E);
        }
        return AZE.A01(c1453AjMA0E.A0f.A04);
    }

    @Override // X.InterfaceC1497Ak4
    public final boolean AGi() {
        return ((AbstractC1424Ait) this.A00).A04;
    }

    @Override // X.InterfaceC1497Ak4
    public final long AKd() {
        AbstractC1383AiD abstractC1383AiD = this.A00;
        return AnonymousClass007.A0C(((AZE) abstractC1383AiD).A01, ((AZE) abstractC1383AiD).A00);
    }

    @Override // X.InterfaceC1497Ak4
    public final AaC APk(InterfaceC1497Ak4 interfaceC1497Ak4, boolean z) {
        return this.A00.A05.APk(interfaceC1497Ak4, z);
    }

    @Override // X.InterfaceC1497Ak4
    public final long APn(InterfaceC1497Ak4 interfaceC1497Ak4, long j, boolean z) {
        if (!(interfaceC1497Ak4 instanceof C1384AiE)) {
            AbstractC1383AiD abstractC1383AiDA01 = A01(this.A00);
            long jAPn = APn(abstractC1383AiDA01.A04, j, z);
            long j2 = abstractC1383AiDA01.A00;
            long jA04 = AWx.A04(jAPn, C8j5.A09((int) (j2 >> 32), AnonymousClass002.A09(j2)));
            InterfaceC1497Ak4 interfaceC1497Ak42 = abstractC1383AiDA01.A05;
            InterfaceC1497Ak4 interfaceC1497Ak4AIW = interfaceC1497Ak42.AIW();
            if (interfaceC1497Ak4AIW == null) {
                interfaceC1497Ak4AIW = interfaceC1497Ak42;
            }
            return AWx.A05(jA04, interfaceC1497Ak4AIW.APn(interfaceC1497Ak4, 0L, z));
        }
        AbstractC1383AiD abstractC1383AiD = ((C1384AiE) interfaceC1497Ak4).A00;
        AbstractC1387AiH abstractC1387AiH = abstractC1383AiD.A05;
        abstractC1387AiH.A0P.A0d.A01();
        AbstractC1383AiD abstractC1383AiD2 = this.A00;
        AbstractC1383AiD abstractC1383AiDA0l = abstractC1383AiD2.A05.A0m(abstractC1387AiH).A0l();
        if (abstractC1383AiDA0l != null) {
            boolean z2 = !z;
            long jA01 = C2ae.A01(C2ae.A02(abstractC1383AiD.A0i(abstractC1383AiDA0l, z2), AbstractC1017AQa.A00(j)), abstractC1383AiD2.A0i(abstractC1383AiDA0l, z2));
            return AnonymousClass005.A0L((int) (jA01 >> 32), AnonymousClass002.A09(jA01));
        }
        AbstractC1383AiD abstractC1383AiDA012 = A01(abstractC1383AiD);
        boolean z3 = !z;
        long jA02 = C2ae.A02(C2ae.A02(abstractC1383AiD.A0i(abstractC1383AiDA012, z3), abstractC1383AiDA012.A00), AbstractC1017AQa.A00(j));
        AbstractC1383AiD abstractC1383AiDA013 = A01(abstractC1383AiD2);
        long jA012 = C2ae.A01(jA02, C2ae.A02(abstractC1383AiD2.A0i(abstractC1383AiDA013, z3), abstractC1383AiDA013.A00));
        long jA0M = AnonymousClass005.A0M((int) (jA012 >> 32), AnonymousClass002.A09(jA012));
        AbstractC1387AiH abstractC1387AiH2 = abstractC1383AiDA013.A05.A09;
        C7384Etj.A0X(abstractC1387AiH2);
        AbstractC1387AiH abstractC1387AiH3 = abstractC1383AiDA012.A05.A09;
        C7384Etj.A0X(abstractC1387AiH3);
        return abstractC1387AiH2.APn(abstractC1387AiH3, jA0M, z);
    }

    @Override // X.InterfaceC1497Ak4
    public final long APo(long j) {
        return this.A00.A05.APo(AWx.A05(j, A00()));
    }

    @Override // X.InterfaceC1497Ak4
    public final long APq(long j) {
        return this.A00.A05.APq(AWx.A05(j, A00()));
    }

    @Override // X.InterfaceC1497Ak4
    public final long APr(long j) {
        return this.A00.A05.APr(AWx.A05(j, A00()));
    }

    @Override // X.InterfaceC1497Ak4
    public final long AcE(long j) {
        return AWx.A05(this.A00.A05.AcE(j), A00());
    }

    @Override // X.InterfaceC1497Ak4
    public final void AhI(InterfaceC1497Ak4 interfaceC1497Ak4, float[] fArr) {
        this.A00.A05.AhI(interfaceC1497Ak4, fArr);
    }

    @Override // X.InterfaceC1497Ak4
    public final void AhK(float[] fArr) {
        this.A00.A05.AhK(fArr);
    }

    @Override // X.InterfaceC1497Ak4
    public final long AiR(long j) {
        return AWx.A05(this.A00.A05.AiR(j), A00());
    }

    @Override // X.InterfaceC1497Ak4
    public final boolean isAttached() {
        return AZE.A03(this.A00.A05);
    }

    public C1384AiE(AbstractC1383AiD abstractC1383AiD) {
        this.A00 = abstractC1383AiD;
    }

    @Override // X.InterfaceC1497Ak4
    public final InterfaceC1497Ak4 AIW() {
        AbstractC1383AiD abstractC1383AiDA0l;
        if (!isAttached()) {
            ASP.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw F60.createAndThrow();
        }
        AbstractC1387AiH abstractC1387AiH = this.A00.A05.A09;
        if (abstractC1387AiH == null || (abstractC1383AiDA0l = abstractC1387AiH.A0l()) == null) {
            return null;
        }
        return abstractC1383AiDA0l.A04;
    }

    @Override // X.InterfaceC1497Ak4
    public final InterfaceC1497Ak4 AIa() {
        AbstractC1383AiD abstractC1383AiDA0l;
        if (!isAttached()) {
            ASP.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw F60.createAndThrow();
        }
        AbstractC1387AiH abstractC1387AiH = this.A00.A05.A0P.A0f.A04.A09;
        if (abstractC1387AiH == null || (abstractC1383AiDA0l = abstractC1387AiH.A0l()) == null) {
            return null;
        }
        return abstractC1383AiDA0l.A04;
    }
}
