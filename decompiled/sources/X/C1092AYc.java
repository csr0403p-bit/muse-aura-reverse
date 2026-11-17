package X;

/* renamed from: X.AYc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1092AYc implements InterfaceC1094AYe {
    public final int A00;
    public final C3TH A01;
    public final C3TH A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1092AYc) {
                C1092AYc c1092AYc = (C1092AYc) obj;
                if (!this.A02.equals(c1092AYc.A02) || !this.A01.equals(c1092AYc.A01) || this.A00 != c1092AYc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1094AYe
    public final int AYA(BLU blu, EnumC1820Arj enumC1820Arj, int i, long j) {
        C3TH c3th = this.A01;
        int i2 = blu.A02;
        int i3 = blu.A01;
        int iA4E = c3th.A4E(enumC1820Arj, 0, i2 - i3);
        int i4 = -this.A02.A4E(enumC1820Arj, 0, i);
        EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
        int i5 = this.A00;
        if (enumC1820Arj != enumC1820Arj2) {
            i5 = -i5;
        }
        return i3 + iA4E + i4 + i5;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Horizontal(menuAlignment=");
        sbA0x.append(this.A02);
        sbA0x.append(", anchorAlignment=");
        sbA0x.append(this.A01);
        sbA0x.append(", offset=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C1092AYc(C3TH c3th, C3TH c3th2, int i) {
        this.A02 = c3th;
        this.A01 = c3th2;
        this.A00 = i;
    }
}
