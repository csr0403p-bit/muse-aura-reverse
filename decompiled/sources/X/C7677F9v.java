package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.F9v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7677F9v implements FAL {
    public HashMap<String, Object> A00;
    public final FA0 A01;

    @Override // X.FAI
    public final boolean A76(String str) {
        C7384Etj.A0Y(str, 0);
        HashMap<String, Object> map = this.A00;
        if (map == null || !map.containsKey(str)) {
            return this.A01.A76(str);
        }
        return true;
    }

    @Override // X.FAI
    public final Object AMX(String str) {
        C7384Etj.A0Y(str, 0);
        HashMap<String, Object> map = this.A00;
        return (map == null || !map.containsKey(str)) ? this.A01.AMX(str) : map.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.FAI
    public final Map<String, Object> ACM() {
        Map map;
        FA0 fa0 = this.A01;
        Map<String, Object> map2 = fa0.A04.A01.A0A;
        if (map2.isEmpty()) {
            map = fa0.A00.A0A;
        } else {
            HashMap mapA0w = BV4.A0w(map2);
            mapA0w.putAll(fa0.A00.A0A);
            map = mapA0w;
        }
        HashMap<String, Object> map3 = this.A00;
        return map3 == null ? map : AbstractC7609F5w.A0z(map, map3);
    }

    @Override // X.FAL
    public final void Agi(Map<String, ? extends Object> map) {
        HashMap<String, Object> map2 = this.A00;
        if (map2 == null) {
            this.A00 = BV4.A0w(map);
        } else {
            map2.putAll(map);
        }
    }

    public C7677F9v(FA0 fa0) {
        this.A01 = fa0;
    }
}
