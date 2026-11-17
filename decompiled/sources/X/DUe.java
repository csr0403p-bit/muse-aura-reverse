package X;

import X.DUZ;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public abstract class DUe<K, V, E extends DUZ<K, V, E>> extends WeakReference<K> implements DUZ<K, V, E> {
    public final int A00;

    @Override // X.DUZ
    public final int AGA() {
        return this.A00;
    }

    @Override // X.DUZ
    public E AHz() {
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TK;>;TK;I)V */
    public DUe(Object queue, ReferenceQueue key, int hash) {
        super(queue, key);
        this.A00 = hash;
    }

    @Override // X.DUZ
    public final K getKey() {
        return get();
    }
}
