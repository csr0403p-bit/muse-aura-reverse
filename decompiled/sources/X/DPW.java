package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedHashMultimap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DPW<V> implements Iterator<V> {
    public int A00;
    public LinkedHashMultimap.ValueEntry<K, V> A01;
    public DPY<K, V> A02;
    public final /* synthetic */ DPV A03;

    public DPW(final DPV this$1) {
        this.A03 = this$1;
        this.A02 = this$1.A02;
        this.A00 = this$1.A00;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        DPV dpv = this.A03;
        if (dpv.A00 == this.A00) {
            return AnonymousClass006.A1Z(this.A02, dpv);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        DPV dpv = this.A03;
        if (dpv.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        Preconditions.checkState(AnonymousClass002.A1X(this.A01), "no calls to next() since the last call to remove()");
        dpv.remove(this.A01.getValue());
        this.A00 = dpv.A00;
        this.A01 = null;
    }

    @Override // java.util.Iterator
    public final V next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        LinkedHashMultimap.ValueEntry<K, V> valueEntry = (LinkedHashMultimap.ValueEntry) this.A02;
        V value = valueEntry.getValue();
        this.A01 = valueEntry;
        DPY<K, V> dpy = valueEntry.successorInValueSet;
        dpy.getClass();
        this.A02 = dpy;
        return value;
    }
}
