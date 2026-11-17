package X;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DOP<K, V> extends DOd<K, V> {
    public final /* synthetic */ DOR A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DOP(final DOR this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    @Override // X.DOd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        DOR dor = this.A00;
        if (!dor.containsKey(o)) {
            return false;
        }
        ((DOO) dor).A01.remove(o);
        return true;
    }

    @Override // X.AbstractC5014DOf, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        DOR dor = this.A00;
        Map<K, V> map = ((DOO) dor).A01;
        Predicate<? super Map.Entry<K, V>> predicate = ((DOO) dor).A00;
        Iterator itA0n = AnonymousClass002.A0n(map);
        boolean zA1Z = false;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (predicate.apply(entryA0l)) {
                zA1Z = BV8.A1Z(entryA0l.getKey(), collection, itA0n, zA1Z);
            }
        }
        return zA1Z;
    }

    @Override // X.AbstractC5014DOf, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        DOR dor = this.A00;
        Map<K, V> map = ((DOO) dor).A01;
        Predicate<? super Map.Entry<K, V>> predicate = ((DOO) dor).A00;
        Iterator itA0n = AnonymousClass002.A0n(map);
        boolean z = false;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (predicate.apply(entryA0l) && !collection.contains(entryA0l.getKey())) {
                itA0n.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC7483Exg.A00(this).toArray(tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC7483Exg.A00(this).toArray();
    }
}
