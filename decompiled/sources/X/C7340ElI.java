package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.ElI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7340ElI extends AbstractSet {
    public final /* synthetic */ AbstractC7339ElH A00;

    public C7340ElI(AbstractC7339ElH abstractC7339ElH) {
        this.A00 = abstractC7339ElH;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        AbstractC7339ElH abstractC7339ElH = this.A00;
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        abstractC7339ElH.A02(entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.A00.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7341ElJ(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.A00.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        AbstractC7339ElH abstractC7339ElH = this.A00;
        return abstractC7339ElH.A01.size() + abstractC7339ElH.A00;
    }
}
