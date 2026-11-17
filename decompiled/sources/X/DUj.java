package X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public final class DUj<K, V> implements DUY<K, V, C5079DUu<K, V>, MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
    public static final DUj<?, ?> A00 = new DUj<>();

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ A7K(DUZ segment, DUZ entry, MapMakerInternalMap.Segment newNext) {
        MapMakerInternalMap.WeakKeyWeakValueSegment weakKeyWeakValueSegment = (MapMakerInternalMap.WeakKeyWeakValueSegment) newNext;
        C5079DUu c5079DUu = (C5079DUu) segment;
        C5079DUu c5079DUu2 = (C5079DUu) entry;
        K k = c5079DUu.get();
        C5079DUu c5075DUp = null;
        if (k != null && c5079DUu.A00.get() != null) {
            int i = ((DUe) c5079DUu).A00;
            ReferenceQueue<K> referenceQueue = weakKeyWeakValueSegment.queueForKeys;
            if (c5079DUu2 == null) {
                c5075DUp = new C5079DUu(k, referenceQueue, i);
                c5075DUp.A00 = MapMakerInternalMap.A07;
            } else {
                c5075DUp = new C5075DUp(c5079DUu2, k, referenceQueue, i);
            }
            c5075DUp.A00 = c5079DUu.A00.A7N(c5075DUp, weakKeyWeakValueSegment.queueForValues);
        }
        return c5075DUp;
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength APS() {
        return MapMakerInternalMap.Strength.A02;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ AR8(DUZ segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        C5079DUu c5079DUu = (C5079DUu) segment;
        ReferenceQueue<K> referenceQueue = ((MapMakerInternalMap.WeakKeyWeakValueSegment) key).queueForKeys;
        if (c5079DUu != null) {
            return new C5075DUp(c5079DUu, hash, referenceQueue, next);
        }
        C5079DUu c5079DUu2 = new C5079DUu(hash, referenceQueue, next);
        c5079DUu2.A00 = MapMakerInternalMap.A07;
        return c5079DUu2;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment ARF(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.WeakKeyWeakValueSegment(map, initialCapacity);
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ void Af9(DUZ segment, MapMakerInternalMap.Segment entry, Object value) {
        C5079DUu c5079DUu = (C5079DUu) segment;
        DUc<K, V, C5079DUu<K, V>> dUc = c5079DUu.A00;
        c5079DUu.A00 = new DUd(c5079DUu, value, ((MapMakerInternalMap.WeakKeyWeakValueSegment) entry).queueForValues);
        dUc.clear();
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength AiG() {
        return MapMakerInternalMap.Strength.A02;
    }
}
