package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.LinkedHashMultimap;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DOt<V> extends AbstractCollection<V> {
    public final /* synthetic */ AbstractC5024DOu A00;

    public DOt(final AbstractC5024DOu this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        Iterator itA10 = BV5.A10(this.A00.A4n());
        while (itA10.hasNext()) {
            if (((Collection) itA10.next()).contains(o)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        AbstractMapBasedMultimap abstractMapBasedMultimap = (AbstractMapBasedMultimap) this.A00;
        return abstractMapBasedMultimap instanceof LinkedHashMultimap ? new F4E(new F5P((LinkedHashMultimap) abstractMapBasedMultimap), 1) : new C5012DNz(abstractMapBasedMultimap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
