package X;

import android.util.Range;

/* loaded from: classes5.dex */
public final class Bd8 extends AbstractC2440BbT {
    public final int A00;
    public final Range<Integer> A01;
    public final Range<Integer> A02;
    public final C2439BbS A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2440BbT) {
                Bd8 bd8 = (Bd8) ((AbstractC2440BbT) obj);
                if (!this.A03.equals(bd8.A03) || !this.A02.equals(bd8.A02) || !this.A01.equals(bd8.A01) || this.A00 != bd8.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A08(this.A01, BV6.A08(this.A02, (this.A03.hashCode() ^ 1000003) * 1000003)) ^ this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoSpec{qualitySelector=");
        sbA0x.append(this.A03);
        sbA0x.append(", frameRate=");
        sbA0x.append(this.A02);
        sbA0x.append(", bitrate=");
        sbA0x.append(this.A01);
        sbA0x.append(", aspectRatio=");
        return BV8.A0z(sbA0x, this.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BbS;Landroid/util/Range<Ljava/lang/Integer;>;Landroid/util/Range<Ljava/lang/Integer;>;I)V */
    public Bd8(Range range, Range range2, C2439BbS c2439BbS, int i) {
        this.A03 = c2439BbS;
        this.A02 = range;
        this.A01 = range2;
        this.A00 = i;
    }
}
