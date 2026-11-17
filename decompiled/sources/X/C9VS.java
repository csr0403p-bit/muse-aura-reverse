package X;

/* renamed from: X.9VS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VS extends C06G {
    public final C07399Vr A00;
    public final C07459Wa A01;
    public final C8sP A02;
    public final C9Va A03;
    public final C9Va A04;
    public final C9Vd A05;
    public final C9VT A06;
    public final C9WF A07;
    public final C9WF A08;
    public final BNO A09;
    public final C07389Vo A0A;
    public final C1he A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9VS) {
                C9VS c9vs = (C9VS) obj;
                if (!C7384Etj.areEqual(this.A06, c9vs.A06) || !C7384Etj.areEqual(this.A00, c9vs.A00) || !C7384Etj.areEqual(this.A0B, c9vs.A0B) || !C7384Etj.areEqual(this.A05, c9vs.A05) || !C7384Etj.areEqual(this.A0A, c9vs.A0A) || !C7384Etj.areEqual(this.A01, c9vs.A01) || !C7384Etj.areEqual(this.A07, c9vs.A07) || !C7384Etj.areEqual(this.A08, c9vs.A08) || !C7384Etj.areEqual(this.A04, c9vs.A04) || !C7384Etj.areEqual(this.A09, c9vs.A09) || !C7384Etj.areEqual(this.A03, c9vs.A03) || !C7384Etj.areEqual(this.A02, c9vs.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A09, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A08, AnonymousClass005.A0F(this.A07, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A0A, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A06))))))))))));
    }

    public C9VS(C07399Vr c07399Vr, C07459Wa c07459Wa, C8sP c8sP, C9Va c9Va, C9Va c9Va2, C9Vd c9Vd, C9VT c9vt, C9WF c9wf, C9WF c9wf2, BNO bno, C07389Vo c07389Vo, C1he c1he) {
        this.A06 = c9vt;
        this.A00 = c07399Vr;
        this.A0B = c1he;
        this.A05 = c9Vd;
        this.A0A = c07389Vo;
        this.A01 = c07459Wa;
        this.A07 = c9wf;
        this.A08 = c9wf2;
        this.A04 = c9Va;
        this.A09 = bno;
        this.A03 = c9Va2;
        this.A02 = c8sP;
    }

    public C9VS() {
        C9VT c9vt = new C9VT(null, null, null, null, null, null, null, null, null);
        C07399Vr c07399Vr = new C07399Vr(null, null, null, null);
        C1he c1he = new C1he(null);
        C0881AGi c0881AGi = C0881AGi.A00;
        C9Vd c9Vd = new C9Vd(c0881AGi);
        C07389Vo c07389Vo = new C07389Vo(c0881AGi);
        C07459Wa c07459Wa = new C07459Wa(null, null, c0881AGi, false, false);
        C9WF c9wf = new C9WF(c0881AGi, -1);
        C9WF c9wf2 = new C9WF(c0881AGi, -1);
        C9Va c9Va = new C9Va(c0881AGi);
        BNO bno = new BNO(c0881AGi);
        this(c07399Vr, c07459Wa, new C8sP(c0881AGi), c9Va, new C9Va(c0881AGi), c9Vd, c9vt, c9wf, c9wf2, bno, c07389Vo, c1he);
    }
}
