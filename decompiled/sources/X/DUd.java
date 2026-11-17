package X;

import X.DUZ;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class DUd<K, V, E extends DUZ<K, V, E>> extends WeakReference<V> implements DUc<K, V, E> {
    public final E A00;

    @Override // X.DUc
    public final E AFH() {
        return this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TV;>;TV;TE;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public DUd(DUZ queue, Object referent, ReferenceQueue entry) {
        super(referent, entry);
        this.A00 = queue;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TV;>;TE;)LX/DUc<TK;TV;TE;>; */
    @Override // X.DUc
    public final DUc A7N(DUZ queue, ReferenceQueue entry) {
        return new DUd(queue, get(), entry);
    }
}
