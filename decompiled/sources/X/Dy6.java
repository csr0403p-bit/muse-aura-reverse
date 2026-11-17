package X;

import androidx.media3.common.Timeline;

/* loaded from: classes5.dex */
public final class Dy6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public Dy6(Object obj, long j) {
        this(obj, -1, -1, -1, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Dy6) {
                Dy6 dy6 = (Dy6) obj;
                if (!this.A04.equals(dy6.A04) || this.A00 != dy6.A00 || this.A01 != dy6.A01 || this.A03 != dy6.A03 || this.A02 != dy6.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(E6B e6b, Timeline timeline, Dy6 dy6) {
        timeline.A0B(e6b, dy6.A04);
    }

    public final Dy6 A01(Object obj) {
        if (this.A04.equals(obj)) {
            return this;
        }
        return new Dy6(obj, this.A00, this.A01, this.A02, this.A03);
    }

    public final int hashCode() {
        return ((((((BV8.A09(this.A04) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03)) * 31) + this.A02;
    }

    public Dy6(Object obj, long j, int i) {
        this(obj, -1, -1, i, j);
    }

    public Dy6(Object obj, int i, int i2, int i3, long j) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }
}
