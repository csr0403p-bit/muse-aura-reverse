package X;

import java.util.AbstractMap;
import java.util.LinkedHashMap;

/* renamed from: X.Hys, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10612Hys implements InterfaceC10617HzX {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.HxZ] */
    @Override // X.InterfaceC10617HzX
    public final HxZ AQa(Object obj, Object obj2) {
        HxZ hxZ;
        HxZ hxZ2 = (HxZ) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!hxZ2.isMutable) {
                if (hxZ2.isEmpty()) {
                    hxZ = new HxZ();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(hxZ2);
                    hxZ.isMutable = true;
                    hxZ = linkedHashMap;
                }
                hxZ2 = hxZ;
            }
            if (!hxZ2.isMutable) {
                throw C8j3.A17();
            }
            AbstractC7609F5w.A1R(abstractMap, hxZ2);
        }
        return hxZ2;
    }
}
