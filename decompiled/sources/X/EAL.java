package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class EAL {
    public static final EAL A04 = new EAL(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EAL) {
                EAL eal = (EAL) obj;
                if (this.A03 != eal.A03 || this.A01 != eal.A01 || this.A02 != eal.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioFormat[sampleRate=");
        sbA0x.append(this.A03);
        sbA0x.append(", channelCount=");
        sbA0x.append(this.A01);
        sbA0x.append(", encoding=");
        sbA0x.append(this.A02);
        return BV5.A0o(sbA0x);
    }

    public EAL(int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = Util.A0O(i3) ? Util.A01(i3) * i2 : -1;
    }
}
