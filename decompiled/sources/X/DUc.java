package X;

import X.DUZ;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public interface DUc<K, V, E extends DUZ<K, V, E>> {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TV;>;TE;)LX/DUc<TK;TV;TE;>; */
    DUc A7N(DUZ queue, ReferenceQueue entry);

    E AFH();

    void clear();

    V get();
}
