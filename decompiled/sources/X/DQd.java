package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DQd<K, V> extends DQZ<K, V> implements Map<K, V> {

    /* JADX WARN: Incorrect inner types in field signature: LX/DQd<TK;TV;>.EntrySet; */
    public C5040DQc A00;

    /* JADX WARN: Incorrect inner types in field signature: LX/DQd<TK;TV;>.KeySet; */
    public DQe A01;

    /* JADX WARN: Incorrect inner types in field signature: LX/DQd<TK;TV;>.ValueCollection; */
    public C5038DQa A02;

    public DQd() {
        super(0);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C5040DQc c5040DQc = this.A00;
        if (c5040DQc != null) {
            return c5040DQc;
        }
        C5040DQc c5040DQc2 = new C5040DQc(this);
        this.A00 = c5040DQc2;
        return c5040DQc2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        DQe dQe = this.A01;
        if (dQe != null) {
            return dQe;
        }
        DQe dQe2 = new DQe(this);
        this.A01 = dQe2;
        return dQe2;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C5038DQa c5038DQa = this.A02;
        if (c5038DQa != null) {
            return c5038DQa;
        }
        C5038DQa c5038DQa2 = new C5038DQa(this);
        this.A02 = c5038DQa2;
        return c5038DQa2;
    }

    public final boolean A0B(Collection<?> collection) {
        int size = size();
        for (int i = size - 1; i >= 0; i--) {
            if (!collection.contains(A05(i))) {
                A06(i);
            }
        }
        return size != size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        A09(size() + map.size());
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            put(entryA0l.getKey(), entryA0l.getValue());
        }
    }
}
