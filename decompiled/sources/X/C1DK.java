package X;

/* renamed from: X.1DK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DK implements C1Ny {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1DK) && this.A00 == ((C1DK) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(0);
        sb.append(", top=");
        sb.append(0);
        sb.append(", right=");
        sb.append(0);
        sb.append(", bottom=");
        sb.append(this.A00);
        return AnonymousClass006.A0z(sb);
    }

    public C1DK(int i) {
        this.A00 = i;
    }

    @Override // X.C1Ny
    public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
        return 0;
    }

    @Override // X.C1Ny
    public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
        return 0;
    }

    @Override // X.C1Ny
    public final int ACy(AXN axn) {
        return this.A00;
    }

    @Override // X.C1Ny
    public final int ALn(AXN axn) {
        return 0;
    }
}
