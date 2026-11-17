package X;

/* loaded from: classes4.dex */
public final class AW9 {
    public long A00;
    public InterfaceC1327AhE A01;
    public AXN A02;
    public EnumC1820Arj A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AW9) {
                AW9 aw9 = (AW9) obj;
                if (!C7384Etj.areEqual(this.A02, aw9.A02) || this.A03 != aw9.A03 || !C7384Etj.areEqual(this.A01, aw9.A01) || this.A00 != aw9.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public static long A00(AW9 aw9) {
        long j = aw9.A00;
        aw9.A01.Ac2();
        return j;
    }

    public static void A02(AW9 aw9, InterfaceC1279AgP interfaceC1279AgP, long j) {
        aw9.A01.Abc();
        interfaceC1279AgP.Aeh(j);
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A02))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DrawParams(density=");
        sbA0x.append(this.A02);
        sbA0x.append(", layoutDirection=");
        sbA0x.append(this.A03);
        sbA0x.append(", canvas=");
        sbA0x.append(this.A01);
        sbA0x.append(", size=");
        return AnonymousClass007.A0Z(AWA.A04(this.A00), sbA0x);
    }

    public static InterfaceC1327AhE A01(AT3 at3) {
        return ((AaI) at3.AEq()).A02.A02.A01;
    }
}
