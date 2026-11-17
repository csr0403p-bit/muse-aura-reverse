package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.AtP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1904AtP extends AN8 {
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public long A02 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public C1958Aux A03;
    public Au3 A04;
    public C1822Arm A05;
    public C2K7 A06;
    public EnumC1820Arj A07;
    public CharSequence A08;
    public List<C1733ApU<C1OS>> A09;
    public boolean A0A;
    public boolean A0B;

    @Override // X.AN8
    public final AN8 A01() {
        return new C1904AtP();
    }

    @Override // X.AN8
    public final void A03(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        C1904AtP c1904AtP = (C1904AtP) an8;
        this.A08 = c1904AtP.A08;
        this.A09 = c1904AtP.A09;
        this.A04 = c1904AtP.A04;
        this.A05 = c1904AtP.A05;
        this.A0A = c1904AtP.A0A;
        this.A0B = c1904AtP.A0B;
        this.A00 = c1904AtP.A00;
        this.A01 = c1904AtP.A01;
        this.A07 = c1904AtP.A07;
        this.A06 = c1904AtP.A06;
        this.A02 = c1904AtP.A02;
        this.A03 = c1904AtP.A03;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CacheRecord(visualText=");
        sbA0x.append((Object) this.A08);
        sbA0x.append(", annotations=");
        sbA0x.append(this.A09);
        sbA0x.append(", composition=");
        sbA0x.append(this.A04);
        sbA0x.append(", textStyle=");
        sbA0x.append(this.A05);
        sbA0x.append(", singleLine=");
        sbA0x.append(this.A0A);
        sbA0x.append(", softWrap=");
        sbA0x.append(this.A0B);
        sbA0x.append(", densityValue=");
        sbA0x.append(this.A00);
        sbA0x.append(", fontScale=");
        sbA0x.append(this.A01);
        sbA0x.append(", layoutDirection=");
        sbA0x.append(this.A07);
        sbA0x.append(", fontFamilyResolver=");
        sbA0x.append(this.A06);
        sbA0x.append(", constraints=");
        sbA0x.append((Object) Constraints.A08(this.A02));
        sbA0x.append(", layoutResult=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }
}
