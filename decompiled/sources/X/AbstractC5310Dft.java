package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dft, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5310Dft<K, V> extends Dg2<K, V> implements Iterator<Map.Entry<K, V>> {
    public C5307Dfq<K, V> A00;
    public C5307Dfq<K, V> A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass002.A1X(this.A01);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C5307Dfq<K, V> c5307Dfq = this.A01;
        C5307Dfq<K, V> c5307Dfq2 = this.A00;
        this.A01 = (c5307Dfq == c5307Dfq2 || c5307Dfq2 == null) ? null : this instanceof C5316Dfz ? c5307Dfq.A01 : c5307Dfq.A00;
        return c5307Dfq;
    }
}
