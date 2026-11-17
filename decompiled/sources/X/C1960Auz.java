package X;

/* renamed from: X.Auz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1960Auz {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final InterfaceC2006AwF A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1960Auz) {
                C1960Auz c1960Auz = (C1960Auz) obj;
                if (!this.A06.equals(c1960Auz.A06) || this.A05 != c1960Auz.A05 || this.A04 != c1960Auz.A04 || this.A03 != c1960Auz.A03 || this.A02 != c1960Auz.A02 || Float.compare(this.A01, c1960Auz.A01) != 0 || Float.compare(this.A00, c1960Auz.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final long A00(long j, boolean z) {
        if (z) {
            long j2 = Au3.A01;
            if (j == j2) {
                return j2;
            }
        }
        int iA0G = C8j3.A0G(j);
        int i = this.A05;
        return AbstractC1815ArZ.A00(iA0G + i, AnonymousClass002.A09(j) + i);
    }

    public final AaC A01(AaC aaC) {
        return aaC.A03(AnonymousClass007.A0A(0.0f, -this.A01));
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02((((((((AnonymousClass005.A0E(this.A06) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31, this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ParagraphInfo(paragraph=");
        sbA0x.append(this.A06);
        sbA0x.append(", startIndex=");
        sbA0x.append(this.A05);
        sbA0x.append(", endIndex=");
        sbA0x.append(this.A04);
        sbA0x.append(", startLineIndex=");
        sbA0x.append(this.A03);
        sbA0x.append(", endLineIndex=");
        sbA0x.append(this.A02);
        sbA0x.append(", top=");
        sbA0x.append(this.A01);
        sbA0x.append(", bottom=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1960Auz(InterfaceC2006AwF interfaceC2006AwF, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = interfaceC2006AwF;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = f;
        this.A00 = f2;
    }
}
