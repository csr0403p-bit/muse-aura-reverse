package X;

import X.DUZ;

/* loaded from: classes5.dex */
public abstract class DUf<K, V, E extends DUZ<K, V, E>> implements DUZ<K, V, E> {
    public final int A00;
    public final K A01;

    @Override // X.DUZ
    public final int AGA() {
        return this.A00;
    }

    @Override // X.DUZ
    public E AHz() {
        return null;
    }

    @Override // X.DUZ
    public final K getKey() {
        return this.A01;
    }

    public DUf(K key, int hash) {
        this.A01 = key;
        this.A00 = hash;
    }
}
