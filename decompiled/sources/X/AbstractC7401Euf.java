package X;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: X.Euf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7401Euf extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return F1I.A00(collection, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
