package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Ask, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1870Ask {
    public final int A00;
    public final int A01;
    public final long A02;
    public final ApQ A03;
    public final C1822Arm A04;
    public final C2K7 A05;
    public final AXN A06;
    public final EnumC1820Arj A07;
    public final List<C1733ApU<C1821Arl>> A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1870Ask) {
                C1870Ask c1870Ask = (C1870Ask) obj;
                if (!C7384Etj.areEqual(this.A03, c1870Ask.A03) || !C7384Etj.areEqual(this.A04, c1870Ask.A04) || !C7384Etj.areEqual(this.A08, c1870Ask.A08) || this.A00 != c1870Ask.A00 || this.A09 != c1870Ask.A09 || this.A01 != c1870Ask.A01 || !C7384Etj.areEqual(this.A06, c1870Ask.A06) || this.A07 != c1870Ask.A07 || !C7384Etj.areEqual(this.A05, c1870Ask.A05) || this.A02 != c1870Ask.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public static int A00(C1958Aux c1958Aux) {
        return c1958Aux.A04.A03.length();
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A02, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A07, AnonymousClass005.A0F(this.A06, (C0KA.A01((AnonymousClass005.A0F(this.A08, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0E(this.A03))) + this.A00) * 31, this.A09) + this.A01) * 31))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextLayoutInput(text=");
        sbA0x.append((Object) this.A03);
        sbA0x.append(", style=");
        sbA0x.append(this.A04);
        sbA0x.append(", placeholders=");
        sbA0x.append(this.A08);
        sbA0x.append(", maxLines=");
        sbA0x.append(this.A00);
        sbA0x.append(", softWrap=");
        sbA0x.append(this.A09);
        sbA0x.append(", overflow=");
        int i = this.A01;
        sbA0x.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sbA0x.append(", density=");
        sbA0x.append(this.A06);
        sbA0x.append(", layoutDirection=");
        sbA0x.append(this.A07);
        sbA0x.append(", fontFamilyResolver=");
        sbA0x.append(this.A05);
        sbA0x.append(", constraints=");
        return AnonymousClass007.A0Z(Constraints.A08(this.A02), sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ApQ;LX/Arm;Ljava/util/List<LX/ApU<LX/Arl;>;>;IZILX/AXN;LX/Arj;LX/2K7;J)V */
    public C1870Ask(ApQ apQ, C1822Arm c1822Arm, C2K7 c2k7, AXN axn, EnumC1820Arj enumC1820Arj, List list, int i, int i2, long j, boolean z) {
        this.A03 = apQ;
        this.A04 = c1822Arm;
        this.A08 = list;
        this.A00 = i;
        this.A09 = z;
        this.A01 = i2;
        this.A06 = axn;
        this.A07 = enumC1820Arj;
        this.A05 = c2k7;
        this.A02 = j;
    }
}
