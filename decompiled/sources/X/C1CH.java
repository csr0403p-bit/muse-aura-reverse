package X;

/* renamed from: X.1CH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CH implements C1Ny {
    public final C1Ny A00;
    public final C1Ny A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1CH) {
                C1CH c1ch = (C1CH) obj;
                if (!C7384Etj.areEqual(c1ch.A01, this.A01) || !C7384Etj.areEqual(c1ch.A00, this.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C1Ny
    public final int ACy(AXN axn) {
        int iACy = this.A01.ACy(axn) - this.A00.ACy(axn);
        if (iACy < 0) {
            return 0;
        }
        return iACy;
    }

    @Override // X.C1Ny
    public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
        int iAH1 = this.A01.AH1(axn, enumC1820Arj) - this.A00.AH1(axn, enumC1820Arj);
        if (iAH1 < 0) {
            return 0;
        }
        return iAH1;
    }

    @Override // X.C1Ny
    public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
        int iAJo = this.A01.AJo(axn, enumC1820Arj) - this.A00.AJo(axn, enumC1820Arj);
        if (iAJo < 0) {
            return 0;
        }
        return iAJo;
    }

    @Override // X.C1Ny
    public final int ALn(AXN axn) {
        int iALn = this.A01.ALn(axn) - this.A00.ALn(axn);
        if (iALn < 0) {
            return 0;
        }
        return iALn;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.A01);
        sb.append(" - ");
        return AnonymousClass007.A0Z(this.A00, sb);
    }

    public C1CH(C1Ny c1Ny, C1Ny c1Ny2) {
        this.A01 = c1Ny;
        this.A00 = c1Ny2;
    }
}
