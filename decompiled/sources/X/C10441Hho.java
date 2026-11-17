package X;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Hho, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10441Hho implements InterfaceC9854Giz<Object, Object> {
    public final int A00;
    public final AbstractC9870GjI A01;

    @Override // X.InterfaceC9854Giz
    public final Object A7E(Object obj) {
        if (obj == null) {
            return null;
        }
        switch (this.A00) {
            case 1:
                Set set = (Set) obj;
                int size = set.size();
                if (size == 1) {
                    return Collections.singleton(set.iterator().next());
                }
                throw BV5.A0S("Can not deserialize Singleton container from ", " entries", size);
            case 2:
                List list = (List) obj;
                int size2 = list.size();
                if (size2 == 1) {
                    return Collections.singletonList(C8j4.A0p(list));
                }
                throw BV5.A0S("Can not deserialize Singleton container from ", " entries", size2);
            case 3:
                Map map = (Map) obj;
                int size3 = map.size();
                if (size3 != 1) {
                    throw BV5.A0S("Can not deserialize Singleton container from ", " entries", size3);
                }
                Map.Entry entryA0l = C3cH.A0l(AnonymousClass002.A0n(map));
                return Collections.singletonMap(entryA0l.getKey(), entryA0l.getValue());
            case 4:
                return Collections.unmodifiableSet((Set) obj);
            case 5:
                return Collections.unmodifiableList((List) obj);
            case 6:
                return Collections.unmodifiableMap((Map) obj);
            case 7:
                return Collections.synchronizedSet((Set) obj);
            case 8:
                return Collections.synchronizedCollection((Collection) obj);
            case 9:
                return Collections.synchronizedList((List) obj);
            case 10:
                return Collections.synchronizedMap((Map) obj);
            default:
                return obj;
        }
    }

    @Override // X.InterfaceC9854Giz
    public final AbstractC9870GjI AGY(C9860Gj8 c9860Gj8) {
        return this.A01;
    }

    @Override // X.InterfaceC9854Giz
    public final AbstractC9870GjI AIN(C9860Gj8 c9860Gj8) {
        return this.A01;
    }

    public C10441Hho(AbstractC9870GjI abstractC9870GjI, int i) {
        this.A01 = abstractC9870GjI;
        this.A00 = i;
    }
}
