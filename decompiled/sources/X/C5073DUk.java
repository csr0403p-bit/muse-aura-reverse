package X;

import com.google.common.collect.MapMakerInternalMap;

/* renamed from: X.DUk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5073DUk<K, V> implements DUY<K, V, DV2<K, V>, MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
    public static final C5073DUk<?, ?> A00 = new C5073DUk<>();

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ A7K(DUZ segment, DUZ entry, MapMakerInternalMap.Segment newNext) {
        DV2 c5078DUt;
        DV2 dv2 = (DV2) segment;
        DV2 dv22 = (DV2) entry;
        K k = dv2.A01;
        int i = ((DUf) dv2).A00;
        if (dv22 == null) {
            c5078DUt = new DV2(k, i);
            c5078DUt.A00 = null;
        } else {
            c5078DUt = new C5078DUt(dv22, k, i);
        }
        c5078DUt.A00 = dv2.A00;
        return c5078DUt;
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength APS() {
        return MapMakerInternalMap.Strength.A01;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ DUZ AR8(DUZ segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        DV2 dv2 = (DV2) segment;
        if (dv2 != null) {
            return new C5078DUt(dv2, hash, next);
        }
        DV2 dv22 = new DV2(hash, next);
        dv22.A00 = null;
        return dv22;
    }

    @Override // X.DUY
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment ARF(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.StrongKeyStrongValueSegment(map, initialCapacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DUY
    public final /* bridge */ /* synthetic */ void Af9(DUZ segment, MapMakerInternalMap.Segment entry, Object value) {
        ((DV2) segment).A00 = value;
    }

    @Override // X.DUY
    public final MapMakerInternalMap.Strength AiG() {
        return MapMakerInternalMap.Strength.A01;
    }
}
