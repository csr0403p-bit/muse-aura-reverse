package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class Brz implements Iterator<Long>, BOA {
    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A18(C8j2.A00(0));
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Long next() {
        C3015Bs0 c3015Bs0 = (C3015Bs0) this;
        long j = c3015Bs0.A00;
        if (j != c3015Bs0.A02) {
            c3015Bs0.A00 = c3015Bs0.A03 + j;
        } else {
            if (!c3015Bs0.A01) {
                throw C8j3.A1D();
            }
            c3015Bs0.A01 = false;
        }
        return Long.valueOf(j);
    }
}
