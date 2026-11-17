package X;

/* loaded from: classes4.dex */
public final class AW7 {
    public static final AW7 A08 = AW2.A00(0.0f, 0.0f, 0.0f, 0.0f, 0);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AW7) {
                AW7 aw7 = (AW7) obj;
                if (Float.compare(this.A01, aw7.A01) != 0 || Float.compare(this.A03, aw7.A03) != 0 || Float.compare(this.A02, aw7.A02) != 0 || Float.compare(this.A00, aw7.A00) != 0 || this.A06 != aw7.A06 || this.A07 != aw7.A07 || this.A05 != aw7.A05 || this.A04 != aw7.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A04, AnonymousClass006.A06(this.A05, AnonymousClass006.A06(this.A07, AnonymousClass006.A06(this.A06, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A01), this.A03), this.A02), this.A00)))));
    }

    public final String toString() {
        StringBuilder sbA0x;
        String strA00;
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A05;
        long j4 = this.A04;
        String strA0k = FGI.A0k(AW8.A00(this.A01), ", ", AW8.A00(this.A03), ", ", AW8.A00(this.A02), ", ", AW8.A00(this.A00));
        if (AnonymousClass002.A1M((j > j2 ? 1 : (j == j2 ? 0 : -1))) && j2 == j3 && j3 == j4) {
            float fA03 = AnonymousClass003.A03(j);
            float fA00 = AnonymousClass004.A00(j);
            sbA0x = C60O.A0x("RoundRect(rect=");
            if (fA03 == fA00) {
                sbA0x.append(strA0k);
                sbA0x.append(", radius=");
                strA00 = AW8.A00(fA03);
            } else {
                sbA0x.append(strA0k);
                sbA0x.append(", x=");
                AW8.A01(sbA0x, fA03);
                sbA0x.append(", y=");
                strA00 = AW8.A00(fA00);
            }
            sbA0x.append(strA00);
        } else {
            sbA0x = C3cI.A0x("RoundRect(rect=", strA0k);
            sbA0x.append(", topLeft=");
            sbA0x.append((Object) A00(j));
            sbA0x.append(", topRight=");
            sbA0x.append((Object) A00(j2));
            sbA0x.append(", bottomRight=");
            sbA0x.append((Object) A00(j3));
            sbA0x.append(", bottomLeft=");
            sbA0x.append((Object) A00(j4));
        }
        return C8j3.A16(sbA0x, ')');
    }

    public AW7(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
    }

    public static String A00(long j) {
        StringBuilder sbA0x;
        String strA00;
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        if (fA03 == fA00) {
            sbA0x = C60O.A0x("CornerRadius.circular(");
            strA00 = AW8.A00(fA03);
        } else {
            sbA0x = C60O.A0x("CornerRadius.elliptical(");
            AW8.A01(sbA0x, fA03);
            C8j3.A1K(sbA0x);
            strA00 = AW8.A00(fA00);
        }
        sbA0x.append(strA00);
        return C8j3.A16(sbA0x, ')');
    }
}
