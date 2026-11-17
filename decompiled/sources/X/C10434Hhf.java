package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hhf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10434Hhf {
    public String A00;
    public List<Object> A01;
    public Map<String, Object> A02;
    public boolean A03;
    public boolean A04;
    public final C10434Hhf A05;

    public static final void A00(C10434Hhf c10434Hhf, Object obj) {
        String str = c10434Hhf.A00;
        str.getClass();
        c10434Hhf.A00 = null;
        if (c10434Hhf.A04) {
            A01(c10434Hhf, obj, str);
            return;
        }
        Map mapA0j = c10434Hhf.A02;
        if (mapA0j == null) {
            mapA0j = C3cG.A0j();
            c10434Hhf.A02 = mapA0j;
        }
        mapA0j.put(str, obj);
    }

    public static void A01(C10434Hhf c10434Hhf, Object obj, String str) {
        Object obj2;
        Map<String, Object> map = c10434Hhf.A02;
        if (map == null) {
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            c10434Hhf.A02 = linkedHashMapA0j;
            linkedHashMapA0j.put(str, obj);
            return;
        }
        Object objPut = map.put(str, obj);
        if (objPut != null) {
            if (objPut instanceof List) {
                ((List) objPut).add(obj);
                obj2 = objPut;
            } else {
                ArrayList arrayListA0u = BV5.A0u(objPut);
                arrayListA0u.add(obj);
                obj2 = arrayListA0u;
            }
            c10434Hhf.A02.put(str, obj2);
        }
    }

    public C10434Hhf(C10434Hhf c10434Hhf) {
        this.A05 = c10434Hhf;
        this.A03 = false;
        this.A04 = false;
    }

    public C10434Hhf(C10434Hhf c10434Hhf, boolean z) {
        this.A05 = c10434Hhf;
        this.A03 = true;
        this.A04 = z;
    }
}
