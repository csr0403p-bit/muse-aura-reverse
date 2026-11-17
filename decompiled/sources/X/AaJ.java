package X;

/* loaded from: classes4.dex */
public final class AaJ extends C16b {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C0zF A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AaJ) {
                AaJ aaJ = (AaJ) obj;
                if (this.A01 != aaJ.A01 || this.A00 != aaJ.A00 || this.A02 != aaJ.A02 || this.A03 != aaJ.A03 || !C7384Etj.areEqual(this.A04, aaJ.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public static AaJ A00(C0zF c0zF, float f, int i) {
        return new AaJ(c0zF, f, 4.0f, i, i);
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A02(C8j4.A04(this.A01), this.A00) + this.A02) * 31) + this.A03) * 31) + C60R.A01(this.A04);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Stroke(width=");
        sbA0x.append(this.A01);
        sbA0x.append(", miter=");
        sbA0x.append(this.A00);
        sbA0x.append(", cap=");
        int i = this.A02;
        sbA0x.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sbA0x.append(", join=");
        int i2 = this.A03;
        sbA0x.append((Object) (i2 == 0 ? "Miter" : i2 == 1 ? "Round" : "Bevel"));
        sbA0x.append(", pathEffect=");
        return AnonymousClass007.A0Z(this.A04, sbA0x);
    }

    public AaJ(C0zF c0zF, float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = c0zF;
    }
}
