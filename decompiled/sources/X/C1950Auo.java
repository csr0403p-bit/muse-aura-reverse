package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.Auo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1950Auo extends Ab8<C1942Auf> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C1DN A03;
    public final ApQ A04;
    public final C1822Arm A05;
    public final C2K7 A06;
    public final List<C1733ApU<C1821Arl>> A07;
    public final G0U<List<AaC>, Unit> A08;
    public final G0U<C1964AvG, Unit> A09;
    public final G0U<C1958Aux, Unit> A0A;
    public final boolean A0B;
    public final AnonymousClass013 A0C;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1950Auo) {
                C1950Auo c1950Auo = (C1950Auo) obj;
                if (!C7384Etj.areEqual(this.A03, c1950Auo.A03) || !C7384Etj.areEqual(this.A04, c1950Auo.A04) || !C7384Etj.areEqual(this.A05, c1950Auo.A05) || !C7384Etj.areEqual(this.A07, c1950Auo.A07) || !C7384Etj.areEqual(this.A06, c1950Auo.A06) || this.A0A != c1950Auo.A0A || this.A09 != c1950Auo.A09 || this.A02 != c1950Auo.A02 || this.A0B != c1950Auo.A0B || this.A00 != c1950Auo.A00 || this.A01 != c1950Auo.A01 || this.A08 != c1950Auo.A08) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        ApQ apQ = this.A04;
        C1822Arm c1822Arm = this.A05;
        C2K7 c2k7 = this.A06;
        G0U<C1958Aux, Unit> g0u = this.A0A;
        int i = this.A02;
        boolean z = this.A0B;
        int i2 = this.A00;
        int i3 = this.A01;
        List<C1733ApU<C1821Arl>> list = this.A07;
        G0U<List<AaC>, Unit> g0u2 = this.A08;
        C1DN c1dn = this.A03;
        G0U<C1964AvG, Unit> g0u3 = this.A09;
        C1942Auf c1942Auf = new C1942Auf();
        c1942Auf.A06 = apQ;
        c1942Auf.A07 = c1822Arm;
        c1942Auf.A08 = c2k7;
        c1942Auf.A0C = g0u;
        c1942Auf.A02 = i;
        c1942Auf.A0D = z;
        c1942Auf.A00 = i2;
        c1942Auf.A01 = i3;
        c1942Auf.A09 = list;
        c1942Auf.A0A = g0u2;
        c1942Auf.A03 = null;
        c1942Auf.A05 = c1dn;
        c1942Auf.A0B = g0u3;
        return c1942Auf;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return ((((((((((C0KA.A01((((AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0E(this.A04))) + C60R.A01(this.A0A)) * 31) + this.A02) * 31, this.A0B) + this.A00) * 31) + this.A01) * 31) + C60R.A01(this.A07)) * 31) + C60R.A01(this.A08)) * 31 * 31) + C60R.A01(this.A03)) * 31) + C8j4.A0E(this.A09, 0);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1822Arm c1822Arm;
        C1942Auf c1942Auf = (C1942Auf) abstractC1439Aj8;
        C1DN c1dn = this.A03;
        C1822Arm c1822Arm2 = this.A05;
        boolean zAreEqual = C7384Etj.areEqual(c1dn, c1942Auf.A05);
        c1942Auf.A05 = c1dn;
        c1942Auf.A02((zAreEqual && (c1822Arm2 == (c1822Arm = c1942Auf.A07) || c1822Arm2.A02.A05(c1822Arm.A02))) ? false : true, c1942Auf.A04(this.A04), c1942Auf.A05(c1822Arm2, this.A06, this.A07, this.A01, this.A00, this.A02, this.A0B), c1942Auf.A03(null, this.A0A, this.A08, this.A09));
    }

    public C1950Auo(AnonymousClass013 anonymousClass013, C1DN c1dn, ApQ apQ, C1822Arm c1822Arm, C2K7 c2k7, List list, G0U g0u, G0U g0u2, G0U g0u3, int i, int i2, int i3, boolean z) {
        this.A04 = apQ;
        this.A05 = c1822Arm;
        this.A06 = c2k7;
        this.A0A = g0u;
        this.A02 = i;
        this.A0B = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = list;
        this.A08 = g0u2;
        this.A03 = c1dn;
        this.A0C = anonymousClass013;
        this.A09 = g0u3;
    }
}
