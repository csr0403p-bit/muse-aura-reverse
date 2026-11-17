package X;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.TreeMultiset;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes5.dex */
public final class DPi<E> extends DPZ<E> {
    public final /* synthetic */ DPj A00;

    public DPi(final DPj this$0) {
        this.A00 = this$0;
    }

    @Override // X.DPZ, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        DPj dPj = this.A00;
        return dPj instanceof TreeMultiset ? new F4E(new F5P((TreeMultiset) dPj, 2), 2) : new C5033DPs((AbstractMapBasedMultiset) dPj);
    }
}
