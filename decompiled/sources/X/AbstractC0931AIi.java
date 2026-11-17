package X;

import java.util.Map;

/* renamed from: X.AIi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0931AIi {
    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<TK;+TV;>;Ljava/util/Map$Entry<+TK;+TV;>;)Z */
    public static final boolean A00(Map.Entry entry, Map map) {
        C7384Etj.A0Y(map, 0);
        Object obj = map.get(entry.getKey());
        Object value = entry.getValue();
        return obj != null ? obj.equals(value) : value == null && map.containsKey(entry.getKey());
    }
}
