package X;

import androidx.media3.common.util.Util;
import java.util.Collections;
import java.util.List;

/* renamed from: X.E0d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6306E0d implements E0T {
    public final long[] A00;
    public final E0J[] A01;

    @Override // X.E0T
    public final long AFN(int i) {
        C1G.A07(C8j3.A1Q(i));
        long[] jArr = this.A00;
        C1G.A07(i < jArr.length);
        return jArr[i];
    }

    @Override // X.E0T
    public final List<E0J> AEJ(long j) {
        E0J e0j;
        int iA08 = Util.A08(this.A00, j, false);
        return (iA08 == -1 || (e0j = this.A01[iA08]) == null) ? Collections.EMPTY_LIST : Collections.singletonList(e0j);
    }

    @Override // X.E0T
    public final int AFO() {
        return this.A00.length;
    }

    @Override // X.E0T
    public final int AI2(long j) {
        long[] jArr = this.A00;
        int iA07 = Util.A07(jArr, j, false);
        if (iA07 >= jArr.length) {
            return -1;
        }
        return iA07;
    }

    public C6306E0d(long[] jArr, E0J[] e0jArr) {
        this.A01 = e0jArr;
        this.A00 = jArr;
    }
}
