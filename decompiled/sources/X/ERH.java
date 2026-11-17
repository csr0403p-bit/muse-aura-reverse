package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class ERH<K> extends AbstractSet<K> {
    public final /* synthetic */ ERD A00;

    public ERH(ERD erd) {
        this.A00 = erd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new ERI(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ERD erd = this.A00;
        if (obj == null) {
            return false;
        }
        try {
            ERE ereA00 = ERD.A00(erd, obj, false);
            if (ereA00 == null) {
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
