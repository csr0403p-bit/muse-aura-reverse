package X;

/* loaded from: classes6.dex */
public final class G79 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final G72 A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G79) {
                G79 g79 = (G79) obj;
                if (!C7384Etj.areEqual(this.A04, g79.A04) || this.A03 != g79.A03 || this.A02 != g79.A02 || this.A01 != g79.A01 || this.A00 != g79.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass006.A0D(this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TokenInfo(type=");
        sbA0x.append(this.A04);
        sbA0x.append(", tokenStart=");
        sbA0x.append(this.A03);
        sbA0x.append(", tokenEnd=");
        sbA0x.append(this.A02);
        sbA0x.append(", rawIndex=");
        sbA0x.append(this.A01);
        sbA0x.append(", normIndex=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public G79(G72 g72, int i, int i2, int i3, int i4) {
        this.A04 = g72;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
