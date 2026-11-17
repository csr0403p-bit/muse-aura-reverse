package X;

/* renamed from: X.AYb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1091AYb implements InterfaceC1095AYf {
    public final int A00;
    public final C1AC A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1091AYb) {
                C1091AYb c1091AYb = (C1091AYb) obj;
                if (!this.A01.equals(c1091AYb.A01) || this.A00 != c1091AYb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Vertical(alignment=");
        sbA0x.append(this.A01);
        sbA0x.append(", margin=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C1091AYb(C1AC c1ac, int i) {
        this.A01 = c1ac;
        this.A00 = i;
    }

    @Override // X.InterfaceC1095AYf
    public final int AYB(BLU blu, int i, long j) {
        int iA09 = AnonymousClass002.A09(j);
        int i2 = this.A00;
        return i >= iA09 - (i2 * 2) ? C2VU.A04.A4A(i, iA09) : ATD.A04(this.A01.A4A(i, iA09), i2, (iA09 - i2) - i);
    }
}
