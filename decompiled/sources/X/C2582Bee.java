package X;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.Bee, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2582Bee extends C2584Beg implements InterfaceC2583Bef {
    public static final BY1 A00 = BY1.OPTIONAL;

    public static C2582Bee A00() {
        return new C2582Bee(new TreeMap(C2584Beg.A02));
    }

    public static C2582Bee A01(InterfaceC2585Beh interfaceC2585Beh) {
        TreeMap treeMap = new TreeMap(C2584Beg.A02);
        for (AbstractC2531BdI<?> abstractC2531BdI : interfaceC2585Beh.APd()) {
            Set<BY1> setAJ7 = interfaceC2585Beh.AJ7(abstractC2531BdI);
            ArrayMap arrayMap = new ArrayMap();
            for (BY1 by1 : setAJ7) {
                arrayMap.put(by1, interfaceC2585Beh.Abm(abstractC2531BdI, by1));
            }
            treeMap.put(abstractC2531BdI, arrayMap);
        }
        return new C2582Bee(treeMap);
    }

    @Override // X.InterfaceC2583Bef
    public final <ValueT> void ANk(AbstractC2531BdI<ValueT> abstractC2531BdI, BY1 by1, ValueT valuet) {
        BY1 by12;
        TreeMap<AbstractC2531BdI<?>, Map<BY1, Object>> treeMap = this.A00;
        Map<BY1, Object> map = treeMap.get(abstractC2531BdI);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(abstractC2531BdI, arrayMap);
            arrayMap.put(by1, valuet);
            return;
        }
        Object objMin = Collections.min(map.keySet());
        if (C6xC.A00(map.get(objMin), valuet) || objMin != (by12 = BY1.REQUIRED) || by1 != by12) {
            map.put(by1, valuet);
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Option values conflicts: ");
        sbA0x.append(((C2530BdH) abstractC2531BdI).A02);
        sbA0x.append(", existing value (");
        sbA0x.append(objMin);
        sbA0x.append(")=");
        sbA0x.append(map.get(objMin));
        sbA0x.append(", conflicting (");
        sbA0x.append(by1);
        throw BV5.A0P(valuet, ")=", sbA0x);
    }

    @Override // X.InterfaceC2583Bef
    public final <ValueT> void ANl(AbstractC2531BdI<ValueT> abstractC2531BdI, ValueT valuet) {
        ANk(abstractC2531BdI, A00, valuet);
    }
}
