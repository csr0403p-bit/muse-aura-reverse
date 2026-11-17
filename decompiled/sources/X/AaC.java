package X;

/* loaded from: classes4.dex */
public final class AaC {
    public static final AaC A04 = new AaC(0.0f, 0.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AaC) {
                AaC aaC = (AaC) obj;
                if (Float.compare(this.A01, aaC.A01) != 0 || Float.compare(this.A03, aaC.A03) != 0 || Float.compare(this.A02, aaC.A02) != 0 || Float.compare(this.A00, aaC.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final long A00() {
        float f = this.A01;
        float f2 = f + ((this.A02 - f) / 2.0f);
        float f3 = this.A03;
        return AnonymousClass005.A0J(f2, f3 + ((this.A00 - f3) / 2.0f));
    }

    public final long A01() {
        return AnonymousClass005.A0J(this.A02 - this.A01, this.A00 - this.A03);
    }

    public final AaC A02(float f, float f2) {
        return C8j3.A0f(this.A01 + f, this.A03 + f2, this.A02 + f, this.A00 + f2);
    }

    public final AaC A03(long j) {
        float f = this.A01;
        float fA03 = AnonymousClass003.A03(j);
        float f2 = this.A03;
        float fA00 = AnonymousClass004.A00(j);
        return C8j3.A0f(f + fA03, f2 + fA00, this.A02 + fA03, this.A00 + fA00);
    }

    public final AaC A04(AaC aaC) {
        return C8j3.A0f(Math.max(this.A01, aaC.A01), Math.max(this.A03, aaC.A03), Math.min(this.A02, aaC.A02), Math.min(this.A00, aaC.A00));
    }

    public final boolean A05() {
        return C8j3.A1Q((this.A01 > this.A02 ? 1 : (this.A01 == this.A02 ? 0 : -1))) | (this.A03 >= this.A00);
    }

    public final boolean A07(AaC aaC) {
        return C8j3.A1R((this.A01 > aaC.A02 ? 1 : (this.A01 == aaC.A02 ? 0 : -1))) & C8j3.A1R((aaC.A01 > this.A02 ? 1 : (aaC.A01 == this.A02 ? 0 : -1))) & C8j3.A1R((this.A03 > aaC.A00 ? 1 : (this.A03 == aaC.A00 ? 0 : -1))) & (aaC.A03 < this.A00);
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A01), this.A03), this.A02), this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Rect.fromLTRB(");
        AW8.A01(sbA0x, this.A01);
        sbA0x.append(", ");
        AW8.A01(sbA0x, this.A03);
        sbA0x.append(", ");
        AW8.A01(sbA0x, this.A02);
        sbA0x.append(", ");
        AW8.A01(sbA0x, this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public AaC(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }

    public final boolean A06(long j) {
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        return C8j3.A1Q((fA03 > this.A01 ? 1 : (fA03 == this.A01 ? 0 : -1))) & C8j3.A1R((fA03 > this.A02 ? 1 : (fA03 == this.A02 ? 0 : -1))) & C8j3.A1Q((fA00 > this.A03 ? 1 : (fA00 == this.A03 ? 0 : -1))) & (fA00 < this.A00);
    }
}
