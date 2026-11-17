package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class B0p extends AbstractC2181B0z {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C1EQ A0A;
    public final C1EQ A0B;
    public final String A0C;
    public final List<AbstractC8825Fld> A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                B0p b0p = (B0p) obj;
                if (!C7384Etj.areEqual(this.A0C, b0p.A0C) || !C7384Etj.areEqual(this.A0A, b0p.A0A) || this.A00 != b0p.A00 || !C7384Etj.areEqual(this.A0B, b0p.A0B) || this.A01 != b0p.A01 || this.A03 != b0p.A03 || this.A08 != b0p.A08 || this.A09 != b0p.A09 || this.A02 != b0p.A02 || this.A06 != b0p.A06 || this.A04 != b0p.A04 || this.A05 != b0p.A05 || this.A07 != b0p.A07 || !C7384Etj.areEqual(this.A0D, b0p.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02((((AnonymousClass005.A02(AnonymousClass005.A02((AnonymousClass005.A02((AnonymousClass005.A0F(this.A0D, AnonymousClass001.A0G(this.A0C)) + C60R.A01(this.A0A)) * 31, this.A00) + C8j4.A0E(this.A0B, 0)) * 31, this.A01), this.A03) + this.A08) * 31) + this.A09) * 31, this.A02), this.A06), this.A04), this.A05) + this.A07;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/List<+LX/Fld;>;ILX/1EQ;FLX/1EQ;FFIIFFFF)V */
    public B0p(C1EQ c1eq, C1EQ c1eq2, String str, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3) {
        this.A0C = str;
        this.A0D = list;
        this.A07 = i;
        this.A0A = c1eq;
        this.A00 = f;
        this.A0B = c1eq2;
        this.A01 = f2;
        this.A03 = f3;
        this.A08 = i2;
        this.A09 = i3;
        this.A02 = f4;
        this.A06 = f5;
        this.A04 = f6;
        this.A05 = f7;
    }
}
