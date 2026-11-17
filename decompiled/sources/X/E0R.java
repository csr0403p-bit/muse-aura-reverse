package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class E0R implements E0T {
    public final List<E0J> A00;

    @Override // X.E0T
    public final List<E0J> AEJ(long j) {
        return j >= 0 ? this.A00 : Collections.EMPTY_LIST;
    }

    @Override // X.E0T
    public final int AFO() {
        return 1;
    }

    @Override // X.E0T
    public final int AI2(long j) {
        return j < 0 ? 0 : -1;
    }

    public E0R(List<E0J> list) {
        this.A00 = list;
    }

    @Override // X.E0T
    public final long AFN(int i) {
        C1G.A07(AnonymousClass002.A1M(i));
        return 0L;
    }
}
