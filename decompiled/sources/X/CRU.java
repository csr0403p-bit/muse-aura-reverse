package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public final class CRU<K, V> {
    public final long A00;
    public final HashMap<K, EHU<V>> A01 = BV4.A0v(16);
    public final ConcurrentHashMap<K, Object> A02 = C60O.A1C();
    public final ReentrantReadWriteLock A03 = new ReentrantReadWriteLock();

    public CRU(TimeUnit timeUnit) {
        this.A00 = TimeUnit.NANOSECONDS.convert(1L, timeUnit);
    }
}
