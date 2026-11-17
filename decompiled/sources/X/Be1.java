package X;

import android.util.Range;

/* loaded from: classes5.dex */
public final class Be1 extends Be3 {
    public final int A00;
    public final Range<Integer> A03;
    public final Range<Integer> A04;
    public final int A02 = -1;
    public final int A01 = -1;

    public Be1(Range range, Range range2, int i) {
        this.A03 = range;
        this.A04 = range2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Be3) {
                Be1 be1 = (Be1) ((Be3) obj);
                if (!this.A03.equals(be1.A03) || this.A02 != be1.A02 || this.A01 != be1.A01 || !this.A04.equals(be1.A04) || this.A00 != be1.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A08(this.A04, (((((this.A03.hashCode() ^ 1000003) * 1000003) ^ this.A02) * 1000003) ^ this.A01) * 1000003) ^ this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioSpec{bitrate=");
        sbA0x.append(this.A03);
        sbA0x.append(", sourceFormat=");
        sbA0x.append(this.A02);
        sbA0x.append(C8j2.A00(13));
        sbA0x.append(this.A01);
        sbA0x.append(", sampleRate=");
        sbA0x.append(this.A04);
        sbA0x.append(", channelCount=");
        return BV8.A0z(sbA0x, this.A00);
    }
}
