package X;

import com.google.common.collect.MapMakerInternalMap;

/* loaded from: classes5.dex */
public final class DUi<K, V> implements DUY<K, V, C5080DUv<K, V>, MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
    public static final DUi<?, ?> A00 = new DUi<>();

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ A7K(DUZ segment, DUZ entry, MapMakerInternalMap.Segment newNext) {
        C5080DUv c5077DUs;
        MapMakerInternalMap.StrongKeyWeakValueSegment strongKeyWeakValueSegment = (MapMakerInternalMap.StrongKeyWeakValueSegment) newNext;
        C5080DUv c5080DUv = (C5080DUv) segment;
        C5080DUv c5080DUv2 = (C5080DUv) entry;
        if (c5080DUv.A00.get() == null) {
            return null;
        }
        K k = c5080DUv.A01;
        int i = ((DUf) c5080DUv).A00;
        if (c5080DUv2 == null) {
            c5077DUs = new C5080DUv(k, i);
            c5077DUs.A00 = MapMakerInternalMap.A07;
        } else {
            c5077DUs = new C5077DUs(c5080DUv2, k, i);
        }
        c5077DUs.A00 = c5080DUv.A00.A7N(c5077DUs, strongKeyWeakValueSegment.queueForValues);
        return c5077DUs;
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength APS() {
        return MapMakerInternalMap.Strength.A01;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ AR8(DUZ segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        C5080DUv c5080DUv = (C5080DUv) segment;
        if (c5080DUv != null) {
            return new C5077DUs(c5080DUv, hash, next);
        }
        C5080DUv c5080DUv2 = new C5080DUv(hash, next);
        c5080DUv2.A00 = MapMakerInternalMap.A07;
        return c5080DUv2;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment ARF(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.StrongKeyWeakValueSegment(map, initialCapacity);
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ void Af9(DUZ segment, MapMakerInternalMap.Segment entry, Object value) {
        C5080DUv c5080DUv = (C5080DUv) segment;
        DUc<K, V, C5080DUv<K, V>> dUc = c5080DUv.A00;
        c5080DUv.A00 = new DUd(c5080DUv, value, ((MapMakerInternalMap.StrongKeyWeakValueSegment) entry).queueForValues);
        dUc.clear();
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength AiG() {
        return MapMakerInternalMap.Strength.A02;
    }
}
