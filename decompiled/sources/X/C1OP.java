package X;

/* renamed from: X.1OP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OP implements C1Ny {
    public final C1Ny A00;
    public final C1Ny A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1OP) {
                C1OP c1op = (C1OP) obj;
                if (!C7384Etj.areEqual(c1op.A00, this.A00) || !C7384Etj.areEqual(c1op.A01, this.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C1Ny
    public final int ACy(AXN axn) {
        return Math.max(this.A00.ACy(axn), this.A01.ACy(axn));
    }

    @Override // X.C1Ny
    public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
        return Math.max(this.A00.AH1(axn, enumC1820Arj), this.A01.AH1(axn, enumC1820Arj));
    }

    @Override // X.C1Ny
    public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
        return Math.max(this.A00.AJo(axn, enumC1820Arj), this.A01.AJo(axn, enumC1820Arj));
    }

    @Override // X.C1Ny
    public final int ALn(AXN axn) {
        return Math.max(this.A00.ALn(axn), this.A01.ALn(axn));
    }

    public final int hashCode() {
        return this.A00.hashCode() + AnonymousClass005.A0E(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.A00);
        sb.append(" \u222a ");
        return AnonymousClass007.A0Z(this.A01, sb);
    }

    public C1OP(C1Ny c1Ny, C1Ny c1Ny2) {
        this.A00 = c1Ny;
        this.A01 = c1Ny2;
    }

    public static C1OP A00(BFM bfm) {
        return new C1OP(C1743Apg.A01(bfm).A0C, C1743Apg.A01(bfm).A01);
    }
}
