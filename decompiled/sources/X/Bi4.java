package X;

import android.util.Size;

/* loaded from: classes5.dex */
public final class Bi4 extends BiX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Size A03;
    public final BiM<AbstractC2816Blt> A04;
    public final BiM<Bi7> A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BiX) {
                Bi4 bi4 = (Bi4) ((BiX) obj);
                if (!this.A03.equals(bi4.A03) || this.A00 != bi4.A00 || this.A01 != bi4.A01 || this.A06 != bi4.A06 || this.A02 != bi4.A02 || !this.A05.equals(bi4.A05) || !this.A04.equals(bi4.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public Bi4(Size size, BiM biM, BiM biM2, int i, int i2, boolean z) {
        if (size == null) {
            throw BV4.A0a("Null size");
        }
        this.A03 = size;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        this.A02 = 35;
        this.A05 = biM;
        this.A04 = biM2;
    }

    public final int hashCode() {
        return BV6.A09(this.A04, BV6.A08(this.A05, (((((((((((this.A03.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ this.A01) * 1000003) ^ BV7.A02(this.A06 ? 1 : 0)) * 1000003) * 1000003) * 1000003) ^ this.A02) * 1000003));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("In{size=");
        sbA0x.append(this.A03);
        sbA0x.append(", inputFormat=");
        sbA0x.append(this.A00);
        sbA0x.append(", outputFormat=");
        sbA0x.append(this.A01);
        sbA0x.append(", virtualCamera=");
        sbA0x.append(this.A06);
        sbA0x.append(", imageReaderProxyProvider=");
        sbA0x.append((Object) null);
        sbA0x.append(", postviewSize=");
        sbA0x.append((Object) null);
        sbA0x.append(", postviewImageFormat=");
        sbA0x.append(this.A02);
        sbA0x.append(", requestEdge=");
        sbA0x.append(this.A05);
        sbA0x.append(", errorEdge=");
        return BV8.A0v(this.A04, sbA0x);
    }
}
