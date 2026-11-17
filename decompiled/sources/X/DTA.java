package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DTA<K> extends E8S<K, V>.AbstractCacheSet<K> {
    public final /* synthetic */ E8S A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTA(final E8S this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    public final boolean contains(Object o) {
        return this.A00.containsKey(o);
    }

    public final Iterator<K> iterator() {
        return new DT9(this.A00);
    }

    public final boolean remove(Object o) {
        return AnonymousClass002.A1X(this.A00.remove(o));
    }
}
