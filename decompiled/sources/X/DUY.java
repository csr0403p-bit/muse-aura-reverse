package X;

import X.DUZ;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap.Segment;

/* loaded from: classes5.dex */
public interface DUY<K, V, E extends DUZ<K, V, E>, S extends MapMakerInternalMap.Segment<K, V, E, S>> {
    /* JADX WARN: Incorrect types in method signature: (TS;TE;TE;)TE; */
    DUZ A7K(DUZ segment, DUZ entry, MapMakerInternalMap.Segment newNext);

    MapMakerInternalMap.Strength APS();

    /* JADX WARN: Incorrect types in method signature: (TS;TK;ITE;)TE; */
    DUZ AR8(DUZ segment, MapMakerInternalMap.Segment key, Object hash, int next);

    S ARF(MapMakerInternalMap<K, V, E, S> map, int initialCapacity);

    /* JADX WARN: Incorrect types in method signature: (TS;TE;TV;)V */
    void Af9(DUZ segment, MapMakerInternalMap.Segment entry, Object value);

    MapMakerInternalMap.Strength AiG();

    static void A00(DUZ duz, MapMakerInternalMap.Segment segment, Object obj) {
        segment.modCount++;
        segment.map.A05.Af9(duz, segment, obj);
    }
}
