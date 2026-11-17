package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ERG<T> implements Iterator<T> {
    public int A00;
    public ERE<K, V> A01 = null;
    public ERE<K, V> A02;
    public final /* synthetic */ ERD A03;

    public ERG(ERD erd) {
        this.A03 = erd;
        this.A02 = erd.header.A02;
        this.A00 = erd.modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass006.A1Z(this.A02, this.A03.header);
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.A01;
        if (entry == null) {
            throw BV4.A0T();
        }
        ERD erd = this.A03;
        erd.A05(entry, true);
        this.A01 = null;
        this.A00 = erd.modCount;
    }
}
