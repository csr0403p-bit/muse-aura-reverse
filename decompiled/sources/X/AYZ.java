package X;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AYZ implements AeE {
    public final int A00;
    public final long A01;
    public final InterfaceC1094AYe A02;
    public final InterfaceC1094AYe A03;
    public final InterfaceC1094AYe A04;
    public final InterfaceC1094AYe A05;
    public final InterfaceC1095AYf A06;
    public final InterfaceC1095AYf A07;
    public final InterfaceC1095AYf A08;
    public final InterfaceC1095AYf A09;
    public final InterfaceC1095AYf A0A;
    public final AXN A0B;
    public final G0V<BLU, BLU, Unit> A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AYZ) {
                AYZ ayz = (AYZ) obj;
                if (this.A01 != ayz.A01 || !this.A0B.equals(ayz.A0B) || this.A00 != ayz.A00 || !this.A0C.equals(ayz.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AYZ(AXN axn, G0V g0v, long j) {
        int iAbr = axn.Abr(48.0f);
        this.A01 = j;
        this.A0B = axn;
        this.A00 = iAbr;
        this.A0C = g0v;
        int iAbr2 = axn.Abr(AnonymousClass003.A03(j));
        C3TH c3th = C2VU.A02;
        this.A05 = new C1092AYc(c3th, c3th, iAbr2);
        C3TH c3th2 = C2VU.A01;
        this.A02 = new C1092AYc(c3th2, c3th2, iAbr2);
        this.A03 = new C1090AYa(C2VG.A00);
        this.A04 = new C1090AYa(C2VG.A01);
        int iAbr3 = axn.Abr(AnonymousClass004.A00(j));
        C1AC c1ac = C2VU.A05;
        C1AC c1ac2 = C2VU.A03;
        this.A09 = new C1093AYd(c1ac, c1ac2, iAbr3);
        this.A06 = new C1093AYd(c1ac2, c1ac, iAbr3);
        this.A08 = new C1093AYd(C2VU.A04, c1ac, iAbr3);
        this.A0A = new C1091AYb(c1ac, iAbr);
        this.A07 = new C1091AYb(c1ac2, iAbr);
    }

    @Override // X.AeE
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo11calculatePositionllwVHH4(BLU blu, long j, EnumC1820Arj enumC1820Arj, long j2) {
        int iAYA;
        int i;
        InterfaceC1094AYe interfaceC1094AYe = this.A05;
        int i2 = 0;
        InterfaceC1094AYe interfaceC1094AYe2 = this.A02;
        long jA00 = blu.A00();
        int i3 = (int) (j >> 32);
        List listAsList = Arrays.asList(interfaceC1094AYe, interfaceC1094AYe2, ((int) (jA00 >> 32)) < i3 / 2 ? this.A03 : this.A04);
        int size = listAsList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                iAYA = 0;
                break;
            }
            int i5 = (int) (j2 >> 32);
            iAYA = ((InterfaceC1094AYe) listAsList.get(i4)).AYA(blu, enumC1820Arj, i5, j);
            if (i4 == C60O.A00(listAsList) || (iAYA >= 0 && i5 + iAYA <= i3)) {
                break;
            }
            i4++;
        }
        int i6 = (int) (j & 4294967295L);
        List listAsList2 = Arrays.asList(this.A09, this.A06, this.A08, AnonymousClass002.A09(jA00) < i6 / 2 ? this.A0A : this.A07);
        int size2 = listAsList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            int i8 = (int) (j2 & 4294967295L);
            int iAYB = ((InterfaceC1095AYf) listAsList2.get(i7)).AYB(blu, i8, j);
            if (i7 == C60O.A00(listAsList2) || (iAYB >= (i = this.A00) && i8 + iAYB <= i6 - i)) {
                i2 = iAYB;
                break;
            }
        }
        long jA0S = C8j3.A0S(iAYA, i2);
        this.A0C.invoke(blu, C2Un.A01(jA0S, j2));
        return jA0S;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A0C, (AnonymousClass005.A0F(this.A0B, C3cI.A01(this.A01)) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DropdownMenuPositionProvider(contentOffset=");
        sbA0x.append((Object) AVe.A00(this.A01));
        sbA0x.append(", density=");
        sbA0x.append(this.A0B);
        sbA0x.append(", verticalMargin=");
        sbA0x.append(this.A00);
        sbA0x.append(", onPositionCalculated=");
        return AnonymousClass007.A0Z(this.A0C, sbA0x);
    }
}
