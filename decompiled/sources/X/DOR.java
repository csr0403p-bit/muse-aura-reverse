package X;

import com.google.common.base.Predicate;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DOR<K, V> extends DOO<K, V> {
    public final Set<Map.Entry<K, V>> A00;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<TK;TV;>;Lcom/google/common/base/Predicate<-Ljava/util/Map$Entry<TK;TV;>;>;)V */
    public DOR(Predicate unfiltered, Map entryPredicate) {
        super(unfiltered, entryPredicate);
        this.A00 = DNa.A02(((DOO) this).A00, entryPredicate.entrySet());
    }
}
