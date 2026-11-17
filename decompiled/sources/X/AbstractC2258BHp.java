package X;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.BHp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2258BHp {
    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<TK;+TV;>;TK;)TV; */
    public static final Object A0L(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder("Key ");
        sb.append(obj);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }
}
