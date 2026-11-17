package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class ERF<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ ERD A00;

    public ERF(ERD erd) {
        this.A00 = erd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            ERD erd = this.A00;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (key != null) {
                try {
                    ERE ereA00 = ERD.A00(erd, key, false);
                    if (ereA00 != null && C6xC.A00(ereA00.A06, entry.getValue())) {
                        return true;
                    }
                } catch (ClassCastException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new ERJ(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        ERD erd = this.A00;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        if (key == null) {
            return false;
        }
        try {
            ERE<K, V> ereA00 = ERD.A00(erd, key, false);
            if (ereA00 == null || !C6xC.A00(ereA00.A06, entry.getValue())) {
                return false;
            }
            erd.A05(ereA00, true);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size;
    }
}
