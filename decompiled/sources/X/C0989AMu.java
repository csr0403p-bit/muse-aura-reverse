package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AMu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0989AMu extends AbstractC0985AMq implements Iterator, BOA {
    /* JADX WARN: Type inference failed for: r0v2, types: [K, java.lang.Object] */
    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.A02;
        if (entry == 0) {
            throw new IllegalStateException();
        }
        A00();
        return entry.getKey();
    }
}
