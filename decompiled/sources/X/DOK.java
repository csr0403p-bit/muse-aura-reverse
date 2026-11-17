package X;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DOK<K, V> extends AbstractC5024DOu<K, V>.Entries implements Set<Map.Entry<K, V>> {
    public final /* synthetic */ AbstractC5024DOu A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DOK(final AbstractC5024DOu this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return DNa.A03(obj, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return DNa.A00(this);
    }
}
