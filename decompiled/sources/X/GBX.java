package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public class GBX<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(GBX.class, Object.class, "_cur$volatile");
    public volatile /* synthetic */ Object _cur$volatile;

    public final int A00() {
        long j = GBY.A05.get(A00.get(this));
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final E A01() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            GBY gby = (GBY) atomicReferenceFieldUpdater.get(this);
            E e = (E) gby.A03();
            if (e != GBY.A04) {
                return e;
            }
            AbstractC5217DdT.A00(this, gby, GBY.A01(gby, GBY.A00(gby)), atomicReferenceFieldUpdater);
        }
    }

    public final boolean A02(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            GBY gby = (GBY) atomicReferenceFieldUpdater.get(this);
            int iA02 = gby.A02(e);
            if (iA02 == 0) {
                return true;
            }
            if (iA02 != 1) {
                return false;
            }
            AbstractC5217DdT.A00(this, gby, GBY.A01(gby, GBY.A00(gby)), atomicReferenceFieldUpdater);
        }
    }
}
