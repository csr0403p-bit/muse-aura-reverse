package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class E8o<K, V> extends AbstractQueue<E8b<K, V>> {
    public final E8b<K, V> A00 = new E8n(this);

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI4 = e8b.AI4();
        while (e8bAI4 != e8b) {
            E8b<K, V> e8bAI42 = e8bAI4.AI4();
            E8k e8k = E8k.A01;
            e8bAI4.Adq(e8k);
            e8bAI4.AeE(e8k);
            e8bAI4 = e8bAI42;
        }
        e8b.Adq(e8b);
        e8b.AeE(e8b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        return AnonymousClass006.A1Z(((E8b) o).AI4(), E8k.A01);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        E8b<K, V> e8b = this.A00;
        return AnonymousClass002.A1Z(e8b.AI4(), e8b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E8b<K, V>> iterator() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI4 = e8b.AI4();
        if (e8bAI4 == e8b) {
            e8bAI4 = null;
        }
        return new C6495E8z(this, e8bAI4);
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object entry) {
        E8b<K, V> e8b = (E8b) entry;
        E8b<K, V> e8bAJ0 = e8b.AJ0();
        E8b<K, V> e8bAI4 = e8b.AI4();
        e8bAJ0.Adq(e8bAI4);
        e8bAI4.AeE(e8bAJ0);
        E8b<K, V> e8b2 = this.A00;
        E8b<K, V> e8bAJ02 = e8b2.AJ0();
        e8bAJ02.Adq(e8b);
        e8b.AeE(e8bAJ02);
        e8b.Adq(e8b2);
        e8b2.AeE(e8b);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object peek() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI4 = e8b.AI4();
        if (e8bAI4 == e8b) {
            return null;
        }
        return e8bAI4;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI4 = e8b.AI4();
        if (e8bAI4 == e8b) {
            return null;
        }
        remove(e8bAI4);
        return e8bAI4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        E8b e8b = (E8b) o;
        E8b<K, V> e8bAJ0 = e8b.AJ0();
        E8b<K, V> e8bAI4 = e8b.AI4();
        e8bAJ0.Adq(e8bAI4);
        e8bAI4.AeE(e8bAJ0);
        E8k e8k = E8k.A01;
        e8b.Adq(e8k);
        e8b.AeE(e8k);
        return AnonymousClass006.A1Z(e8bAI4, e8k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        E8b<K, V> e8b = this.A00;
        int i = 0;
        for (E8b<K, V> e8bAI4 = e8b.AI4(); e8bAI4 != e8b; e8bAI4 = e8bAI4.AI4()) {
            i++;
        }
        return i;
    }
}
