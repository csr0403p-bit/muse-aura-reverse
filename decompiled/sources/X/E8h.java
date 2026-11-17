package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* loaded from: classes5.dex */
public final class E8h<K, V> extends SoftReference<V> implements E8d<K, V> {
    public final E8b<K, V> A00;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TV;>;TV;LX/E8b<TK;TV;>;)LX/E8d<TK;TV;>; */
    @Override // X.E8d
    public final E8d A7M(E8b queue, Object value, ReferenceQueue entry) {
        return new E8h(queue, value, entry);
    }

    @Override // X.E8d
    public final E8b<K, V> AFG() {
        return this.A00;
    }

    @Override // X.E8d
    public final int AMk() {
        return 1;
    }

    @Override // X.E8d
    public final boolean isActive() {
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TV;>;TV;LX/E8b<TK;TV;>;)V */
    public E8h(E8b queue, Object referent, ReferenceQueue entry) {
        super(referent, entry);
        this.A00 = queue;
    }
}
