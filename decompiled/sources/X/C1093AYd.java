package X;

/* renamed from: X.AYd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1093AYd implements InterfaceC1095AYf {
    public final int A00;
    public final C1AC A01;
    public final C1AC A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1093AYd) {
                C1093AYd c1093AYd = (C1093AYd) obj;
                if (!this.A02.equals(c1093AYd.A02) || !this.A01.equals(c1093AYd.A01) || this.A00 != c1093AYd.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1095AYf
    public final int AYB(BLU blu, int i, long j) {
        C1AC c1ac = this.A01;
        int i2 = blu.A00;
        int i3 = blu.A03;
        return i3 + c1ac.A4A(0, i2 - i3) + (-this.A02.A4A(0, i)) + this.A00;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Vertical(menuAlignment=");
        sbA0x.append(this.A02);
        sbA0x.append(", anchorAlignment=");
        sbA0x.append(this.A01);
        sbA0x.append(", offset=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C1093AYd(C1AC c1ac, C1AC c1ac2, int i) {
        this.A02 = c1ac;
        this.A01 = c1ac2;
        this.A00 = i;
    }
}
