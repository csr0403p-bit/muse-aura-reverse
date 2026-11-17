package X;

import androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: X.Dxm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6202Dxm {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Timeline A06;
    public final Timeline A07;
    public final Dy6 A08;
    public final Dy6 A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6202Dxm c6202Dxm = (C6202Dxm) obj;
                if (this.A04 != c6202Dxm.A04 || this.A01 != c6202Dxm.A01 || this.A03 != c6202Dxm.A03 || this.A00 != c6202Dxm.A00 || this.A02 != c6202Dxm.A02 || this.A05 != c6202Dxm.A05 || !C6xC.A00(this.A07, c6202Dxm.A07) || !C6xC.A00(this.A09, c6202Dxm.A09) || !C6xC.A00(this.A06, c6202Dxm.A06) || !C6xC.A00(this.A08, c6202Dxm.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05)});
    }

    public C6202Dxm(Timeline timeline, Timeline timeline2, Dy6 dy6, Dy6 dy62, int i, int i2, long j, long j2, long j3, long j4) {
        this.A04 = j;
        this.A07 = timeline;
        this.A01 = i;
        this.A09 = dy6;
        this.A03 = j2;
        this.A06 = timeline2;
        this.A00 = i2;
        this.A08 = dy62;
        this.A02 = j3;
        this.A05 = j4;
    }
}
