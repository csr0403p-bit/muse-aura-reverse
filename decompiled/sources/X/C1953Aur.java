package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.Aur, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1953Aur extends Ab8<C1947Aul> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C1951Aup A03;
    public final C1DN A04;
    public final ApQ A05;
    public final C1822Arm A06;
    public final C2K7 A07;
    public final List<C1733ApU<C1821Arl>> A08;
    public final G0U<List<AaC>, Unit> A09;
    public final G0U<C1958Aux, Unit> A0A;
    public final boolean A0B;
    public final AnonymousClass013 A0C;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1953Aur) {
                C1953Aur c1953Aur = (C1953Aur) obj;
                if (!C7384Etj.areEqual(this.A04, c1953Aur.A04) || !C7384Etj.areEqual(this.A05, c1953Aur.A05) || !C7384Etj.areEqual(this.A06, c1953Aur.A06) || !C7384Etj.areEqual(this.A08, c1953Aur.A08) || !C7384Etj.areEqual(this.A07, c1953Aur.A07) || this.A0A != c1953Aur.A0A || this.A02 != c1953Aur.A02 || this.A0B != c1953Aur.A0B || this.A00 != c1953Aur.A00 || this.A01 != c1953Aur.A01 || this.A09 != c1953Aur.A09 || !C7384Etj.areEqual(this.A03, c1953Aur.A03)) {
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
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1822Arm c1822Arm;
        C1947Aul c1947Aul = (C1947Aul) abstractC1439Aj8;
        ApQ apQ = this.A05;
        C1822Arm c1822Arm2 = this.A06;
        List<C1733ApU<C1821Arl>> list = this.A08;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A0B;
        C2K7 c2k7 = this.A07;
        int i3 = this.A02;
        G0U<C1958Aux, Unit> g0u = this.A0A;
        G0U<List<AaC>, Unit> g0u2 = this.A09;
        C1951Aup c1951Aup = this.A03;
        C1DN c1dn = this.A04;
        C1942Auf c1942Auf = c1947Aul.A01;
        boolean zAreEqual = C7384Etj.areEqual(c1dn, c1942Auf.A05);
        c1942Auf.A05 = c1dn;
        c1942Auf.A02((zAreEqual && (c1822Arm2 == (c1822Arm = c1942Auf.A07) || c1822Arm2.A02.A05(c1822Arm.A02))) ? false : true, c1942Auf.A04(apQ), c1942Auf.A05(c1822Arm2, c2k7, list, i, i2, i3, z), c1942Auf.A03(c1951Aup, g0u, g0u2, null));
        c1947Aul.A00 = c1951Aup;
        AbstractC1339AhQ.A00(c1947Aul);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        ApQ apQ = this.A05;
        C1822Arm c1822Arm = this.A06;
        C2K7 c2k7 = this.A07;
        G0U<C1958Aux, Unit> g0u = this.A0A;
        int i = this.A02;
        boolean z = this.A0B;
        int i2 = this.A00;
        int i3 = this.A01;
        return new C1947Aul(this.A03, this.A04, apQ, c1822Arm, c2k7, this.A08, g0u, this.A09, i, i2, i3, z);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return ((((((((((C0KA.A01((((AnonymousClass005.A0F(this.A07, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0E(this.A05))) + C60R.A01(this.A0A)) * 31) + this.A02) * 31, this.A0B) + this.A00) * 31) + this.A01) * 31) + C60R.A01(this.A08)) * 31) + C60R.A01(this.A09)) * 31) + C60R.A01(this.A03)) * 31 * 31) + C8j4.A0E(this.A04, 0);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ApQ;LX/Arm;LX/2K7;LX/G0U<-LX/Aux;Lkotlin/Unit;>;IZIILjava/util/List<LX/ApU<LX/Arl;>;>;LX/G0U<-Ljava/util/List<LX/AaC;>;Lkotlin/Unit;>;LX/Aup;LX/1DN;LX/013;)V */
    public C1953Aur(AnonymousClass013 anonymousClass013, C1951Aup c1951Aup, C1DN c1dn, ApQ apQ, C1822Arm c1822Arm, C2K7 c2k7, List list, G0U g0u, G0U g0u2, int i, int i2, int i3, boolean z) {
        this.A05 = apQ;
        this.A06 = c1822Arm;
        this.A07 = c2k7;
        this.A0A = g0u;
        this.A02 = i;
        this.A0B = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A08 = list;
        this.A09 = g0u2;
        this.A03 = c1951Aup;
        this.A04 = c1dn;
        this.A0C = anonymousClass013;
    }
}
