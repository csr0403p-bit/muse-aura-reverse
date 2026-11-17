package X;

/* loaded from: classes6.dex */
public final class G86 {
    public char A00;
    public int A01 = -1;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final G72 A06;

    public G86(G72 g72, char c, int i, int i2, boolean z, boolean z2) {
        this.A06 = g72;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G86) {
                G86 g86 = (G86) obj;
                if (!this.A06.equals(g86.A06) || this.A05 != g86.A05 || this.A04 != g86.A04 || this.A03 != g86.A03 || this.A02 != g86.A02 || this.A00 != g86.A00 || this.A01 != g86.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C0KA.A01(C0KA.A01((((AnonymousClass005.A0E(this.A06) + this.A05) * 31) + this.A04) * 31, this.A03), this.A02) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Info(tokenType=");
        sbA0x.append(this.A06);
        sbA0x.append(", position=");
        sbA0x.append(this.A05);
        sbA0x.append(", length=");
        sbA0x.append(this.A04);
        sbA0x.append(", canOpen=");
        sbA0x.append(this.A03);
        sbA0x.append(", canClose=");
        sbA0x.append(this.A02);
        sbA0x.append(", marker=");
        sbA0x.append(this.A00);
        sbA0x.append(", closerIndex=");
        return C8j5.A0X(sbA0x, this.A01);
    }
}
