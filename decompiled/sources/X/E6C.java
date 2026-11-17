package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E6C {
    public static final E6D A01;
    public static final E6C A02 = new E6C(new E6D[0]);
    public final E6D[] A00;

    static {
        E6D e6d = new E6D(new int[0], new long[0], new C5704Dnm[0], new String[0], -1);
        int[] iArr = e6d.A01;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = e6d.A02;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        A01 = new E6D(iArrCopyOf, jArrCopyOf, (C5704Dnm[]) Arrays.copyOf(e6d.A04, 0), (String[]) Arrays.copyOf(e6d.A05, 0), 0);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((E6C) obj).A00));
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AdPlaybackState(adsId=");
        sbA0x.append((Object) null);
        sbA0x.append(", adResumePositionUs=");
        sbA0x.append(0L);
        sbA0x.append(", adGroups=[");
        return AnonymousClass001.A0v("])", sbA0x);
    }

    public E6C(E6D[] e6dArr) {
        this.A00 = e6dArr;
    }
}
