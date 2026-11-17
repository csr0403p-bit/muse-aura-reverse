package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DTP<K, V> extends AtomicReference<DTW<V>> implements InterfaceC5064DTa<DTP<K, V>> {
    public final K key;
    public DTP<K, V> next;
    public DTP<K, V> prev;

    /* JADX WARN: Incorrect types in method signature: (TK;LX/DTW<TV;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public DTP(DTW dtw, Object obj) {
        super(dtw);
        this.key = obj;
    }
}
