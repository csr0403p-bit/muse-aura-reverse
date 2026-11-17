package X;

/* renamed from: X.Bcr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2520Bcr extends AbstractC2509Bcf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2509Bcf) {
                C2520Bcr c2520Bcr = (C2520Bcr) ((AbstractC2509Bcf) obj);
                if (this.A03 != c2520Bcr.A03 || !this.A09.equals(c2520Bcr.A09) || this.A01 != c2520Bcr.A01 || this.A04 != c2520Bcr.A04 || this.A08 != c2520Bcr.A08 || this.A06 != c2520Bcr.A06 || this.A07 != c2520Bcr.A07 || this.A00 != c2520Bcr.A00 || this.A02 != c2520Bcr.A02 || this.A05 != c2520Bcr.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.A03 ^ 1000003) * 1000003) ^ this.A09.hashCode()) * 1000003) ^ this.A01) * 1000003) ^ this.A04) * 1000003) ^ this.A08) * 1000003) ^ this.A06) * 1000003) ^ this.A07) * 1000003) ^ this.A00) * 1000003) ^ this.A02) * 1000003) ^ this.A05;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoProfileProxy{codec=");
        sbA0x.append(this.A03);
        sbA0x.append(", mediaType=");
        sbA0x.append(this.A09);
        sbA0x.append(", bitrate=");
        sbA0x.append(this.A01);
        sbA0x.append(", frameRate=");
        sbA0x.append(this.A04);
        sbA0x.append(", width=");
        sbA0x.append(this.A08);
        sbA0x.append(", height=");
        sbA0x.append(this.A06);
        sbA0x.append(", profile=");
        sbA0x.append(this.A07);
        sbA0x.append(", bitDepth=");
        sbA0x.append(this.A00);
        sbA0x.append(", chromaSubsampling=");
        sbA0x.append(this.A02);
        sbA0x.append(", hdrFormat=");
        return BV8.A0z(sbA0x, this.A05);
    }

    public C2520Bcr(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A03 = i;
        if (str == null) {
            throw BV4.A0a("Null mediaType");
        }
        this.A09 = str;
        this.A01 = i2;
        this.A04 = i3;
        this.A08 = i4;
        this.A06 = i5;
        this.A07 = i6;
        this.A00 = i7;
        this.A02 = i8;
        this.A05 = i9;
    }
}
