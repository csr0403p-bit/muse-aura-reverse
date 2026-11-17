package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class CFJ {
    public static final CFJ A00 = new CFJ();

    public static final HashMap<String, String> A02(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        HashMap<String, String> mapA0u = BV4.A0u();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            C7384Etj.A0X(key);
            if (value == null) {
                mapA0u.put(A00(key), null);
            } else {
                mapA0u.put(A00(key), A00(value));
            }
        }
        return mapA0u;
    }

    public static final String A00(Object obj) {
        return obj instanceof Number ? obj.toString() : String.valueOf(obj);
    }

    private final void A05(C3340CFk c3340CFk, Object obj) {
        if (!(obj instanceof String) && !(obj instanceof Boolean)) {
            if (!(obj instanceof Number)) {
                if (obj instanceof List) {
                    C3340CFk c3340CFkA02 = c3340CFk.A01.A02();
                    c3340CFk.A0C(c3340CFkA02);
                    A03(this, c3340CFkA02, (List) obj);
                    return;
                } else if (!(obj instanceof Map)) {
                    C7384Etj.A0U(obj);
                    A05(c3340CFk, obj);
                    return;
                } else {
                    C3341CFl c3341CFlA03 = c3340CFk.A01.A03();
                    c3340CFk.A0C(c3341CFlA03);
                    A04(this, c3341CFlA03, (Map) obj);
                    return;
                }
            }
            obj = obj.toString();
        }
        C3340CFk.A00(c3340CFk, obj);
    }

    @Deprecated(message = "")
    public static final String A01(Map<?, ?> map) {
        StringBuilder sbA0x = C60O.A0x("{");
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            sbA0x.append(key);
            sbA0x.append(":");
            sbA0x.append(value);
            sbA0x.append(",");
        }
        return BV7.A11(sbA0x);
    }

    public static final void A03(CFJ cfj, C3340CFk c3340CFk, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cfj.A05(c3340CFk, it.next());
        }
    }

    public static final void A04(CFJ cfj, C3341CFl c3341CFl, Map map) {
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA00 = A00(entryA0l.getKey());
            Object value = entryA0l.getValue();
            if (value == null) {
                value = null;
            } else if (value instanceof Map) {
                A04(cfj, C3339CFj.A01(c3341CFl, strA00), (Map) value);
            } else if (!(value instanceof String)) {
                if (value instanceof Number) {
                    value = value.toString();
                } else if (!(value instanceof Boolean)) {
                    if (value instanceof List) {
                        A03(cfj, C3339CFj.A00(c3341CFl, strA00), (List) value);
                    } else {
                        String strA0a = AnonymousClass007.A0a("Couldn't handle", value.getClass());
                        if (CFL.A01()) {
                            CFK.A02.e(CFJ.class.getSimpleName(), strA0a);
                        }
                    }
                }
            }
            C3341CFl.A00(c3341CFl, value, strA00);
        }
    }
}
