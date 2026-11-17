package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class HyV extends C06G {
    public final EnumC10621Hzf A00;
    public final HsM A01;
    public final HsM A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List<Hs8> A08;
    public final List<String> A09;
    public final Map<String, String> A0A;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractMap, java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public HyV(Hj6 hj6) {
        HsM hsM;
        Object objA0s;
        String str;
        List listA10 = AbstractC7609F5w.A10(hj6, 1);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listA10);
        for (Object obj : listA10) {
            try {
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (!(obj instanceof String) || (str = (String) obj) == null) {
                throw BV5.A0O(obj, "Invalid value: ");
            }
            objA0s = Hs8.valueOf(str.toUpperCase(Locale.ROOT));
            if ((objA0s instanceof C10571Hud) || objA0s == null) {
                objA0s = Hs8.A02;
            }
            arrayListA0m.add(objA0s);
        }
        String strA0r = AbstractC7609F5w.A0r(hj6, 2);
        List listA102 = AbstractC7609F5w.A10(hj6, 3);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(listA102);
        for (Object obj2 : listA102) {
            C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.String");
            arrayListA0m2.add(obj2);
        }
        String strA0r2 = AbstractC7609F5w.A0r(hj6, 4);
        String strA0r3 = AbstractC7609F5w.A0r(hj6, 5);
        ?? A0y = A0y(hj6);
        String strA0h = BV4.A0h("catalog_type", A0y(hj6));
        EnumC10621Hzf enumC10621HzfValueOf = (strA0h == null || (enumC10621HzfValueOf = EnumC10621Hzf.valueOf(strA0h)) == null) ? EnumC10621Hzf.A02 : enumC10621HzfValueOf;
        String strA0r4 = AbstractC7609F5w.A0r(hj6, 7);
        HsM hsMA0B = C7384Etj.A0B(hj6.A01, 8);
        try {
            hsM = (HsM) hj6.A01[9];
        } catch (Exception unused) {
            hsM = null;
        }
        AnonymousClass005.A12(strA0r, strA0r2, strA0r3, 1);
        C7384Etj.A0Y(strA0r4, 7);
        this.A08 = arrayListA0m;
        this.A06 = strA0r;
        this.A09 = arrayListA0m2;
        this.A05 = strA0r2;
        this.A04 = strA0r3;
        this.A0A = A0y;
        this.A00 = enumC10621HzfValueOf;
        this.A03 = strA0r4;
        this.A01 = hsMA0B;
        this.A02 = hsM;
        String strA0h2 = BV4.A0h("session_id", A0y);
        this.A07 = (strA0h2 == null || C7BY.A0j(strA0h2)) ? null : strA0h2;
    }

    public static final Map<String, String> A0y(Hj6 hj6) {
        Set setEntrySet = ((Map) AbstractC7608F5v.A0j(hj6, 6)).entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(setEntrySet));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            Object key = entryA0l.getKey();
            C7384Etj.A0Z(key, "null cannot be cast to non-null type kotlin.String");
            Object value = entryA0l.getValue();
            C7384Etj.A0Z(value, "null cannot be cast to non-null type kotlin.String");
            linkedHashMapA15.put(key, value);
        }
        return linkedHashMapA15;
    }
}
