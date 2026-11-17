package X;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DPE<E> implements Iterator<E> {
    public int A00;
    public int A01;
    public DPD A02;
    public boolean A03;
    public final InterfaceC5026DPa<E> A04;
    public final Iterator A05;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 > 0 || this.A05.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Preconditions.checkState(this.A03, "no calls to next() since the last call to remove()");
        if (this.A01 == 1) {
            this.A05.remove();
        } else {
            InterfaceC5026DPa<E> interfaceC5026DPa = this.A04;
            DPD dpd = this.A02;
            dpd.getClass();
            interfaceC5026DPa.remove(dpd.A01());
        }
        this.A01--;
        this.A03 = false;
    }

    public DPE(InterfaceC5026DPa multiset, Iterator entryIterator) {
        this.A04 = multiset;
        this.A05 = entryIterator;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        int iA00 = this.A00;
        if (iA00 == 0) {
            DPD dpd = (DPD) this.A05.next();
            this.A02 = dpd;
            iA00 = dpd.A00();
            this.A00 = iA00;
            this.A01 = iA00;
        }
        this.A00 = iA00 - 1;
        this.A03 = true;
        DPD dpd2 = this.A02;
        dpd2.getClass();
        return (E) dpd2.A01();
    }
}
