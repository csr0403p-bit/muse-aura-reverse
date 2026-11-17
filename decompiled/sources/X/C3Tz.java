package X;

/* renamed from: X.3Tz, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Tz extends AbstractC1748Apl {
    public C3TQ A00;

    @Override // X.AbstractC1748Apl
    public final C1Ny A00(final C1Ny c1Ny) {
        final C3TQ c3tq = this.A00;
        final C1Ny c1Ny2 = new C1Ny(c3tq) { // from class: X.3Ty
            public final C3TQ A00;

            @Override // X.C1Ny
            public final int ACy(AXN axn) {
                return axn.Abr(((C1DP) this.A00).A00);
            }

            @Override // X.C1Ny
            public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
                return axn.Abr(this.A00.A5k(enumC1820Arj));
            }

            @Override // X.C1Ny
            public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
                return axn.Abr(this.A00.A5n(enumC1820Arj));
            }

            @Override // X.C1Ny
            public final int ALn(AXN axn) {
                return axn.Abr(((C1DP) this.A00).A03);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C05283Ty) {
                    return C7384Etj.areEqual(((C05283Ty) obj).A00, this.A00);
                }
                return false;
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                C1DP c1dp = (C1DP) this.A00;
                float f = c1dp.A02;
                float f2 = c1dp.A03;
                float f3 = c1dp.A01;
                float f4 = c1dp.A00;
                StringBuilder sb = new StringBuilder("PaddingValues(");
                C1DG.A07(sb, f);
                sb.append(", ");
                C1DG.A07(sb, f2);
                sb.append(", ");
                C1DG.A07(sb, f3);
                sb.append(", ");
                return AnonymousClass007.A0Z(C1DG.A05(f4), sb);
            }

            {
                this.A00 = c3tq;
            }
        };
        return new C1Ny(c1Ny, c1Ny2) { // from class: X.1ET
            public final C1Ny A00;
            public final C1Ny A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C1ET) {
                        C1ET c1et = (C1ET) obj;
                        if (!C7384Etj.areEqual(c1et.A00, this.A00) || !c1et.A01.equals(this.A01)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // X.C1Ny
            public final int ACy(AXN axn) {
                return this.A00.ACy(axn) + this.A01.ACy(axn);
            }

            @Override // X.C1Ny
            public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
                return this.A00.AH1(axn, enumC1820Arj) + this.A01.AH1(axn, enumC1820Arj);
            }

            @Override // X.C1Ny
            public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
                return this.A00.AJo(axn, enumC1820Arj) + this.A01.AJo(axn, enumC1820Arj);
            }

            @Override // X.C1Ny
            public final int ALn(AXN axn) {
                return this.A00.ALn(axn) + this.A01.ALn(axn);
            }

            public final int hashCode() {
                return this.A00.hashCode() + AnonymousClass005.A0E(this.A01);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("(");
                sb.append(this.A00);
                sb.append(" + ");
                return AnonymousClass007.A0Z(this.A01, sb);
            }

            {
                this.A00 = c1Ny;
                this.A01 = c1Ny2;
            }
        };
    }
}
