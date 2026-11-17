package X;

/* renamed from: X.AYa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1090AYa implements InterfaceC1094AYe {
    public final C3TH A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1090AYa) && this.A00.equals(((C1090AYa) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Horizontal(alignment=");
        sbA0x.append(this.A00);
        sbA0x.append(", margin=");
        return C8j5.A0X(sbA0x, 0);
    }

    public C1090AYa(C3TH c3th) {
        this.A00 = c3th;
    }

    @Override // X.InterfaceC1094AYe
    public final int AYA(BLU blu, EnumC1820Arj enumC1820Arj, int i, long j) {
        int iA0G = C8j3.A0G(j);
        return i >= iA0G ? C2VU.A00.A4E(enumC1820Arj, i, iA0G) : ATD.A04(this.A00.A4E(enumC1820Arj, i, iA0G), 0, iA0G - i);
    }
}
