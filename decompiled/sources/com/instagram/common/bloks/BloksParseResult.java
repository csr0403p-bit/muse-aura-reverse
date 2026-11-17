package com.instagram.common.bloks;

import X.AIW;
import X.AbstractC7608F5v;
import X.AbstractC7691FAk;
import X.AnonymousClass003;
import X.BV4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7616F6s;
import X.C7648F8p;
import X.C79;
import X.C9jH;
import X.F61;
import X.F6D;
import X.F6K;
import X.F6N;
import X.F6w;
import X.F8L;
import X.F91;
import X.F92;
import X.F96;
import X.F97;
import X.F9S;
import X.F9T;
import X.FB5;
import X.FB7;
import X.FDW;
import X.FFI;
import X.FGI;
import X.Hj6;
import X.Hnz;
import X.HsM;
import X.Ht3;
import com.instagram.common.lispy.lang.BloksScriptingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class BloksParseResult {
    public final Ht3 A00;
    public final F9T A01;
    public final FDW A02;
    public final String mLoggingId;

    public static BloksParseResult A00(F6D f6d, FDW fdw) {
        Object bloksParseResult;
        if (fdw.A05 != 13901) {
            List list = Collections.EMPTY_LIST;
            return new BloksParseResult(null, fdw, new F6w(null, C9jH.A00), null, null, list, list, list, list, null, Collections.EMPTY_MAP, null, null);
        }
        HsM hsMA0Z = AbstractC7608F5v.A0Z(fdw);
        if (hsMA0Z == null) {
            throw C60O.A0i("ParseResultWrapper doesn't have a parse result!");
        }
        try {
            bloksParseResult = AbstractC7691FAk.A01(f6d, Hj6.A02, hsMA0Z, C79.A00);
            if (bloksParseResult == null) {
                throw C60O.A0i("ParseResultWrapper expression returned null parse result!");
            }
        } catch (BloksScriptingException e) {
            FFI.A01(f6d.A02, "Exception executing Parse Embedded expression", e);
            FDW fdw2 = new FDW(13320);
            List list2 = Collections.EMPTY_LIST;
            bloksParseResult = new BloksParseResult(null, fdw2, new F6w(null, C9jH.A00), null, null, list2, list2, list2, list2, null, Collections.EMPTY_MAP, null, null);
        }
        return (BloksParseResult) bloksParseResult;
    }

    public static BloksParseResult A01(Ht3 ht3, F61 f61, List list) {
        Map<String, C7616F6s> mapA02 = A02(f61.A08);
        FDW fdw = f61.A00;
        fdw.getClass();
        List<F6K> list2 = f61.A07;
        ArrayList arrayListA0h = C3cG.A0h();
        if (list2 != null) {
            arrayListA0h.addAll(list2);
        }
        if (list != null) {
            arrayListA0h.addAll(list);
        }
        List<F91> list3 = f61.A06;
        List<F96> list4 = f61.A09;
        if (list4 == null) {
            list4 = Collections.EMPTY_LIST;
        }
        F6w f6w = f61.A02;
        if (f6w == null) {
            f6w = new F6w(null, C9jH.A00);
        }
        List<F97> list5 = f61.A0A;
        if (list5 == null) {
            list5 = Collections.EMPTY_LIST;
        }
        Map<String, FDW> map = f61.A0K;
        List<F8L> list6 = f61.A0I;
        Integer num = f61.A05;
        Map<String, Object> map2 = f61.A0J;
        Hnz hnz = f61.A01;
        return new BloksParseResult(ht3, fdw, f6w, num, hnz != null ? hnz.A00 : null, arrayListA0h, list3, list4, list5, list6, mapA02, map, map2);
    }

    public static Map<String, C7616F6s> A02(List<C7616F6s> list) {
        if (list == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap mapA0v = BV4.A0v(list.size());
        for (C7616F6s c7616F6s : list) {
            mapA0v.put(c7616F6s.A01, c7616F6s);
        }
        return mapA0v;
    }

    public BloksParseResult(Ht3 ht3, F9T f9t, FDW fdw, String str) {
        this.A01 = f9t;
        this.A02 = fdw;
        this.A00 = ht3;
        this.mLoggingId = str;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/List<LX/F97;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>; */
    public static Map A03(List list, Map map) {
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap mapA0u = BV4.A0u();
        HashMap mapA0w = BV4.A0w(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F97 f97 = (F97) it.next();
            if (map.containsKey(f97.A01)) {
                mapA0u.put(f97.A00, mapA0w.remove(f97.A01));
            }
        }
        mapA0u.putAll(mapA0w);
        return mapA0u;
    }

    public BloksParseResult(Ht3 ht3, FDW fdw, F6w f6w, Integer num, String str, List list, List list2, List list3, List list4, List list5, Map map, Map map2, Map map3) throws Exception {
        ArrayList arrayListA0i;
        LinkedHashMap linkedHashMapA15;
        C7384Etj.A0Y(fdw, 0);
        if (list2 != null) {
            arrayListA0i = AnonymousClass003.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                F91 f91 = (F91) it.next();
                HashMap<String, String> map4 = f91.A07;
                if (map4 != null) {
                    linkedHashMapA15 = C60O.A15(AIW.A0H(map4.size()));
                    Iterator itA0i = C3cG.A0i(map4);
                    while (itA0i.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0i);
                        Object key = entryA0l.getKey();
                        FB7 fb7 = new FB7(new F6N((String) entryA0l.getValue()));
                        FB5.A00(fdw, fb7, 2);
                        FDW fdw2 = fb7.A00;
                        if (fdw2 != null) {
                            String strA0E = fdw2.A0E();
                            C7384Etj.A0X(strA0E);
                            int i = fdw2.A04;
                            C7648F8p c7648F8p = fdw2.A09;
                            if (c7648F8p == null) {
                                c7648F8p = C7648F8p.A02;
                            }
                            linkedHashMapA15.put(key, new F92(c7648F8p, strA0E, i));
                        } else {
                            throw new Exception(FGI.A0M("Failed to find async component container for ", f91.A06));
                        }
                    }
                } else {
                    linkedHashMapA15 = null;
                }
                String str2 = f91.A06;
                C7384Etj.A0U(str2);
                HsM hsM = f91.A00;
                C7384Etj.A0U(hsM);
                HsM hsM2 = f91.A03;
                HsM hsM3 = f91.A02;
                Set<String> set = f91.A08;
                HsM hsM4 = f91.A01;
                Boolean bool = f91.A04;
                C7384Etj.A0U(bool);
                boolean zBooleanValue = bool.booleanValue();
                Boolean bool2 = f91.A05;
                C7384Etj.A0U(bool2);
                arrayListA0i.add(new F9S(hsM, hsM2, hsM3, hsM4, str2, linkedHashMapA15, set, zBooleanValue, bool2.booleanValue()));
            }
        } else {
            arrayListA0i = null;
        }
        this(ht3, new F9T(f6w, num, list, list4, arrayListA0i, list3, list5, map, map2, map3), fdw, str);
    }
}
