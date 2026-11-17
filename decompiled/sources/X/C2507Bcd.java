package X;

/* renamed from: X.Bcd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2507Bcd {
    public final int A00;
    public final int A01;
    public static final C2507Bcd A08 = new C2507Bcd(0, 0);
    public static final C2507Bcd A07 = new C2507Bcd(1, 8);
    public static final C2507Bcd A06 = new C2507Bcd(3, 10);
    public static final C2507Bcd A04 = new C2507Bcd(4, 10);
    public static final C2507Bcd A05 = new C2507Bcd(5, 10);
    public static final C2507Bcd A02 = new C2507Bcd(6, 10);
    public static final C2507Bcd A03 = new C2507Bcd(6, 8);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2507Bcd) {
                C2507Bcd c2507Bcd = (C2507Bcd) obj;
                if (this.A01 != c2507Bcd.A01 || this.A00 != c2507Bcd.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A01() {
        int i = this.A01;
        return (i == 0 || i == 2 || this.A00 == 0) ? false : true;
    }

    public final int hashCode() {
        return ((this.A01 ^ 1000003) * 1000003) ^ this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("DynamicRange@");
        BV4.A1N(sbA0x, System.identityHashCode(this));
        sbA0x.append("{encoding=");
        switch (this.A01) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sbA0x.append(str);
        sbA0x.append(", bitDepth=");
        return BV8.A0z(sbA0x, this.A00);
    }

    public C2507Bcd(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean A00() {
        return A01() && this.A01 != 1 && this.A00 == 10;
    }
}
