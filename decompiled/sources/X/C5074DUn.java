package X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.DUn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5074DUn<K, V> implements DUY<K, V, DV1<K, V>, MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
    public static final C5074DUn<?, ?> A00 = new C5074DUn<>();

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ A7K(DUZ segment, DUZ entry, MapMakerInternalMap.Segment newNext) {
        DV1 c5076DUq;
        MapMakerInternalMap.WeakKeyStrongValueSegment weakKeyStrongValueSegment = (MapMakerInternalMap.WeakKeyStrongValueSegment) newNext;
        DV1 dv1 = (DV1) segment;
        DV1 dv12 = (DV1) entry;
        K k = dv1.get();
        if (k == null) {
            return null;
        }
        int i = ((DUe) dv1).A00;
        ReferenceQueue<K> referenceQueue = weakKeyStrongValueSegment.queueForKeys;
        if (dv12 == null) {
            c5076DUq = new DV1(k, referenceQueue, i);
            c5076DUq.A00 = null;
        } else {
            c5076DUq = new C5076DUq(dv12, k, referenceQueue, i);
        }
        c5076DUq.A00 = dv1.A00;
        return c5076DUq;
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength APS() {
        return MapMakerInternalMap.Strength.A02;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ AR8(DUZ segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        DV1 dv1 = (DV1) segment;
        ReferenceQueue<K> referenceQueue = ((MapMakerInternalMap.WeakKeyStrongValueSegment) key).queueForKeys;
        if (dv1 != null) {
            return new C5076DUq(dv1, hash, referenceQueue, next);
        }
        DV1 dv12 = new DV1(hash, referenceQueue, next);
        dv12.A00 = null;
        return dv12;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment ARF(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.WeakKeyStrongValueSegment(map, initialCapacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DUY
    public final /* bridge */ /* synthetic */ void Af9(DUZ segment, MapMakerInternalMap.Segment entry, Object value) {
        ((DV1) segment).A00 = value;
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength AiG() {
        return MapMakerInternalMap.Strength.A01;
    }
}
