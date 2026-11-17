package X;

import android.util.Size;

/* loaded from: classes5.dex */
public final class Bd7 extends BdF {
    public final int A01;
    public final int A03;
    public final int A04;
    public final Size A05;
    public final BWz A06;
    public final Bd6 A07;
    public final String A08;
    public final int A02 = 2130708361;
    public final int A00 = 1;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BdF) {
                Bd7 bd7 = (Bd7) ((BdF) obj);
                if (!this.A08.equals(bd7.A08) || this.A04 != bd7.A04 || !this.A06.equals(bd7.A06) || !this.A05.equals(bd7.A05) || this.A02 != bd7.A02 || !this.A07.equals(bd7.A07) || this.A03 != bd7.A03 || this.A00 != bd7.A00 || this.A01 != bd7.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((BV6.A08(this.A07, (BV6.A08(this.A05, BV6.A08(this.A06, (((this.A08.hashCode() ^ 1000003) * 1000003) ^ this.A04) * 1000003)) ^ this.A02) * 1000003) ^ this.A03) * 1000003) ^ this.A00) * 1000003) ^ this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoEncoderConfig{mimeType=");
        sbA0x.append(this.A08);
        sbA0x.append(", profile=");
        sbA0x.append(this.A04);
        sbA0x.append(", inputTimebase=");
        sbA0x.append(this.A06);
        sbA0x.append(AbstractC7606F5t.A00(21));
        sbA0x.append(this.A05);
        sbA0x.append(", colorFormat=");
        sbA0x.append(this.A02);
        sbA0x.append(", dataSpace=");
        sbA0x.append(this.A07);
        sbA0x.append(", frameRate=");
        sbA0x.append(this.A03);
        sbA0x.append(", IFrameInterval=");
        sbA0x.append(this.A00);
        sbA0x.append(", bitrate=");
        return BV8.A0z(sbA0x, this.A01);
    }

    public Bd7(Size size, BWz bWz, Bd6 bd6, String str, int i, int i2, int i3) {
        this.A08 = str;
        this.A04 = i;
        this.A06 = bWz;
        this.A05 = size;
        this.A07 = bd6;
        this.A03 = i2;
        this.A01 = i3;
    }
}
