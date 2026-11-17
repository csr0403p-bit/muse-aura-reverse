package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Atc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1915Atc {
    public static final ATF<C1915Atc> A06 = new AuG();
    public final float A00;
    public final float A01;
    public final long A02;
    public final C2K7 A03;
    public final AXN A04;
    public final EnumC1820Arj A05;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MeasureInputs(density=");
        sbA0x.append(this.A04);
        sbA0x.append(", densityValue=");
        sbA0x.append(this.A00);
        sbA0x.append(", fontScale=");
        sbA0x.append(this.A01);
        sbA0x.append(", layoutDirection=");
        sbA0x.append(this.A05);
        sbA0x.append(", fontFamilyResolver=");
        sbA0x.append(this.A03);
        sbA0x.append(", constraints=");
        return AnonymousClass007.A0Z(Constraints.A08(this.A02), sbA0x);
    }

    public C1915Atc(C2K7 c2k7, AXN axn, EnumC1820Arj enumC1820Arj, long j) {
        this.A04 = axn;
        this.A05 = enumC1820Arj;
        this.A03 = c2k7;
        this.A02 = j;
        this.A00 = axn.AEm();
        this.A01 = axn.AFo();
    }
}
