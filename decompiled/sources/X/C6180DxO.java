package X;

import java.util.Arrays;

/* renamed from: X.DxO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6180DxO {
    public static final C6180DxO A07 = new C6180DxO(null, 1, 2, 3, -1, -1);
    public static final C6180DxO A08 = new C6180DxO(null, 1, 1, 2, -1, -1);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final byte[] A06;

    public static int A00(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int A01(int i) {
        if (i != 1) {
            if (i == 4) {
                return 10;
            }
            if (i == 13) {
                return 2;
            }
            if (i == 16) {
                return 6;
            }
            if (i == 18) {
                return 7;
            }
            if (i != 6 && i != 7) {
                return -1;
            }
        }
        return 3;
    }

    public static String A02(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? FGI.A0H("Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6180DxO c6180DxO = (C6180DxO) obj;
                if (this.A03 != c6180DxO.A03 || this.A02 != c6180DxO.A02 || this.A04 != c6180DxO.A04 || !Arrays.equals(this.A06, c6180DxO.A06) || this.A05 != c6180DxO.A05 || this.A01 != c6180DxO.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A03(C6180DxO c6180DxO) {
        if (c6180DxO == null) {
            return false;
        }
        int i = c6180DxO.A04;
        return i == 7 || i == 6;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((527 + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) + Arrays.hashCode(this.A06)) * 31) + this.A05) * 31) + this.A01;
        this.A00 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ColorInfo(");
        int i = this.A03;
        sbA0x.append(i != -1 ? i != 6 ? i != 1 ? i != 2 ? FGI.A0H("Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space");
        sbA0x.append(", ");
        int i2 = this.A02;
        sbA0x.append(i2 != -1 ? i2 != 1 ? i2 != 2 ? FGI.A0H("Undefined color range ", i2) : "Limited range" : "Full range" : "Unset color range");
        sbA0x.append(", ");
        sbA0x.append(A02(this.A04));
        sbA0x.append(", ");
        sbA0x.append(AnonymousClass002.A1X(this.A06));
        sbA0x.append(", ");
        int i3 = this.A05;
        sbA0x.append(i3 != -1 ? FGI.A08(i3, "bit Luma") : "NA");
        sbA0x.append(", ");
        int i4 = this.A01;
        sbA0x.append(i4 != -1 ? FGI.A08(i4, "bit Chroma") : "NA");
        return BV7.A10(sbA0x);
    }

    public C6180DxO(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A06 = bArr;
        this.A05 = i4;
        this.A01 = i5;
    }
}
