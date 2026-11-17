package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BYW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final C5704Dnm A06;
    public final Object A07;
    public final Object A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BYW byw = (BYW) obj;
                if (this.A02 != byw.A02 || this.A03 != byw.A03 || this.A05 != byw.A05 || this.A04 != byw.A04 || this.A00 != byw.A00 || this.A01 != byw.A01 || !C6xC.A00(this.A06, byw.A06) || !C6xC.A00(this.A08, byw.A08) || !C6xC.A00(this.A07, byw.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, Integer.valueOf(this.A02), this.A06, this.A07, Integer.valueOf(this.A03), Long.valueOf(this.A05), Long.valueOf(this.A04), Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("mediaItem=");
        sbA0x.append(this.A02);
        sbA0x.append(", period=");
        sbA0x.append(this.A03);
        sbA0x.append(", pos=");
        String strA0m = BV4.A0m(sbA0x, this.A05);
        int i = this.A00;
        if (i == -1) {
            return strA0m;
        }
        StringBuilder sbA0g = C3cG.A0g(strA0m);
        sbA0g.append(", contentPos=");
        sbA0g.append(this.A04);
        sbA0g.append(", adGroup=");
        sbA0g.append(i);
        sbA0g.append(", ad=");
        return BV4.A0l(sbA0g, this.A01);
    }

    public BYW(C5704Dnm c5704Dnm, Object obj, Object obj2, int i, int i2, int i3, int i4, long j, long j2) {
        this.A08 = obj;
        this.A02 = i;
        this.A06 = c5704Dnm;
        this.A07 = obj2;
        this.A03 = i2;
        this.A05 = j;
        this.A04 = j2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
