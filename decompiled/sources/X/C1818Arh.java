package X;

/* renamed from: X.Arh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1818Arh implements C1OS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C1830Aru A05;
    public final C1804ArN A06;
    public final C1810ArU A07;
    public final As2 A08;

    public final C1818Arh A01(C1818Arh c1818Arh) {
        if (c1818Arh == null) {
            return this;
        }
        int i = c1818Arh.A02;
        int i2 = c1818Arh.A03;
        long j = c1818Arh.A04;
        C1810ArU c1810ArU = c1818Arh.A07;
        return AbstractC1816Arf.A00(this, c1818Arh.A05, c1818Arh.A06, c1810ArU, c1818Arh.A08, i, i2, c1818Arh.A01, c1818Arh.A00, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1818Arh) {
                C1818Arh c1818Arh = (C1818Arh) obj;
                if (this.A02 == c1818Arh.A02 && this.A03 == c1818Arh.A03) {
                    long j = this.A04;
                    long j2 = c1818Arh.A04;
                    C1813ArX[] c1813ArXArr = C1809ArT.A02;
                    if (j != j2 || !C7384Etj.areEqual(this.A07, c1818Arh.A07) || !C7384Etj.areEqual(this.A05, c1818Arh.A05) || !C7384Etj.areEqual(this.A06, c1818Arh.A06) || this.A01 != c1818Arh.A01 || this.A00 != c1818Arh.A00 || !C7384Etj.areEqual(this.A08, c1818Arh.A08)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C1818Arh c1818Arh, StringBuilder sb) {
        sb.append((Object) C1YL.A01(c1818Arh.A02));
        sb.append(", textDirection=");
        sb.append((Object) C1819Ari.A00(c1818Arh.A03));
        sb.append(", lineHeight=");
        sb.append((Object) C1809ArT.A02(c1818Arh.A04));
        sb.append(", textIndent=");
        sb.append(c1818Arh.A07);
        sb.append(", platformStyle=");
    }

    public final int hashCode() {
        int i = ((this.A02 * 31) + this.A03) * 31;
        long j = this.A04;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        return ((((((((((C60R.A00(j, i) + C60R.A01(this.A07)) * 31) + C60R.A01(this.A05)) * 31) + C60R.A01(this.A06)) * 31) + this.A01) * 31) + this.A00) * 31) + C8j4.A0E(this.A08, 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ParagraphStyle(textAlign=");
        A00(this, sbA0x);
        C1811ArV.A01(this, this.A05, sbA0x);
        return AnonymousClass007.A0Z(this.A08, sbA0x);
    }

    public C1818Arh(C1830Aru c1830Aru, C1804ArN c1804ArN, C1810ArU c1810ArU, As2 as2, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = j;
        this.A07 = c1810ArU;
        this.A05 = c1830Aru;
        this.A06 = c1804ArN;
        this.A01 = i3;
        this.A00 = i4;
        this.A08 = as2;
        if (j != C1809ArT.A01) {
            float fA00 = C1809ArT.A00(j);
            if (fA00 < 0.0f) {
                throw new IllegalStateException(FGI.A0F("lineHeight can't be negative (", ')', fA00));
            }
        }
    }
}
