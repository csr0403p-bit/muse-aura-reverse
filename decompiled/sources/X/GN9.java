package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GN9 extends GNF {
    public final transient int A00;
    public final transient GN6 A01;
    public final transient Object[] A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value != null) {
            return BV7.A1X(value, this.A01.get(key), false);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public GN9(GN6 gn6, Object[] objArr, int i) {
        this.A01 = gn6;
        this.A02 = objArr;
        this.A00 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return A04().listIterator(0);
    }
}
