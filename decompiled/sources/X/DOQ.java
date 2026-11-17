package X;

import com.google.common.base.Predicate;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DOQ<K, V> extends DOO<K, V> {
    public final Predicate<? super K> A00;

    @Override // X.DOO, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        return ((DOO) this).A01.containsKey(key) && this.A00.apply(key);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<TK;TV;>;Lcom/google/common/base/Predicate<-TK;>;Lcom/google/common/base/Predicate<-Ljava/util/Map$Entry<TK;TV;>;>;)V */
    public DOQ(Predicate unfiltered, Predicate keyPredicate, Map entryPredicate) {
        super(keyPredicate, entryPredicate);
        this.A00 = unfiltered;
    }
}
