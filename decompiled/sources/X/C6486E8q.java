package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.E8q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6486E8q<K, V> extends AbstractQueue<E8b<K, V>> {
    public final E8b<K, V> A00 = new C6494E8y(this);

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI3 = e8b.AI3();
        while (e8bAI3 != e8b) {
            E8b<K, V> e8bAI32 = e8bAI3.AI3();
            E8k e8k = E8k.A01;
            e8bAI3.Adp(e8k);
            e8bAI3.AeD(e8k);
            e8bAI3 = e8bAI32;
        }
        e8b.Adp(e8b);
        e8b.AeD(e8b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        return AnonymousClass006.A1Z(((E8b) o).AI3(), E8k.A01);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        E8b<K, V> e8b = this.A00;
        return AnonymousClass002.A1Z(e8b.AI3(), e8b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E8b<K, V>> iterator() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI3 = e8b.AI3();
        if (e8bAI3 == e8b) {
            e8bAI3 = null;
        }
        return new E90(this, e8bAI3);
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object entry) {
        E8b<K, V> e8b = (E8b) entry;
        E8b<K, V> e8bAIz = e8b.AIz();
        E8b<K, V> e8bAI3 = e8b.AI3();
        e8bAIz.Adp(e8bAI3);
        e8bAI3.AeD(e8bAIz);
        E8b<K, V> e8b2 = this.A00;
        E8b<K, V> e8bAIz2 = e8b2.AIz();
        e8bAIz2.Adp(e8b);
        e8b.AeD(e8bAIz2);
        e8b.Adp(e8b2);
        e8b2.AeD(e8b);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object peek() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI3 = e8b.AI3();
        if (e8bAI3 == e8b) {
            return null;
        }
        return e8bAI3;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        E8b<K, V> e8b = this.A00;
        E8b<K, V> e8bAI3 = e8b.AI3();
        if (e8bAI3 == e8b) {
            return null;
        }
        remove(e8bAI3);
        return e8bAI3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        E8b e8b = (E8b) o;
        E8b<K, V> e8bAIz = e8b.AIz();
        E8b<K, V> e8bAI3 = e8b.AI3();
        e8bAIz.Adp(e8bAI3);
        e8bAI3.AeD(e8bAIz);
        E8k e8k = E8k.A01;
        e8b.Adp(e8k);
        e8b.AeD(e8k);
        return AnonymousClass006.A1Z(e8bAI3, e8k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        E8b<K, V> e8b = this.A00;
        int i = 0;
        for (E8b<K, V> e8bAI3 = e8b.AI3(); e8bAI3 != e8b; e8bAI3 = e8bAI3.AI3()) {
            i++;
        }
        return i;
    }
}
