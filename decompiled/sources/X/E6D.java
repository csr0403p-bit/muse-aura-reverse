package X;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E6D {
    public final int A00;
    public final int[] A01;
    public final long[] A02;

    @Deprecated
    public final Uri[] A03;
    public final C5704Dnm[] A04;
    public final String[] A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E6D e6d = (E6D) obj;
                if (this.A00 != e6d.A00 || !Arrays.equals(this.A04, e6d.A04) || !Arrays.equals(this.A01, e6d.A01) || !Arrays.equals(this.A02, e6d.A02) || !Arrays.equals(this.A05, e6d.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A00 * 31) - 1) * 31;
        int iA03 = BV6.A03(0L);
        return BV6.A0E(this.A05, (((((BV6.A0E(this.A04, (i + iA03) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02)) * 31) + iA03) * 31 * 31);
    }

    public E6D(int[] iArr, long[] jArr, C5704Dnm[] c5704DnmArr, String[] strArr, int i) {
        Uri uri;
        int length = iArr.length;
        int length2 = c5704DnmArr.length;
        int i2 = 0;
        C1G.A07(AnonymousClass002.A1Q(length, length2));
        this.A00 = i;
        this.A01 = iArr;
        this.A04 = c5704DnmArr;
        this.A02 = jArr;
        this.A03 = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.A03;
            if (i2 >= uriArr.length) {
                this.A05 = strArr;
                return;
            }
            C5704Dnm c5704Dnm = c5704DnmArr[i2];
            if (c5704Dnm == null) {
                uri = null;
            } else {
                C5568Dkm c5568Dkm = c5704Dnm.A03;
                c5568Dkm.getClass();
                uri = c5568Dkm.A01;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }
}
