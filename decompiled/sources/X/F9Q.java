package X;

import android.os.Handler;
import android.util.Pair;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.instagram.common.bloks.BloksParseResult;
import com.instagram.common.lispy.lang.BloksScriptingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class F9Q {
    public static final Handler A07 = C60O.A02();
    public final C3094By7 A00;
    public final F9b A01;
    public final FBN A02;
    public final Object A03;
    public final Map<String, F9W> A04;
    public final Map<String, Set<String>> A05;
    public final Set<String> A06;

    public F9Q(C3094By7 c3094By7, F9b f9b, FBN fbn) {
        C7384Etj.A0Y(c3094By7, 2);
        this.A01 = f9b;
        this.A02 = fbn;
        this.A00 = c3094By7;
        this.A03 = C3cG.A0T();
        this.A04 = C3cG.A0j();
        this.A06 = C3cG.A0k();
        this.A05 = C3cG.A0j();
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/lang/String;LX/HsM;LX/F6D;)TT; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    public static final Object A00(F6D f6d, HsM hsM, String str) {
        FBB fbbA00 = 0;
        if (hsM == null) {
            return null;
        }
        try {
            fbbA00 = FDH.A00(Hj6.A02, hsM, f6d);
            return fbbA00;
        } catch (BloksScriptingException e) {
            FFI.A01(fbbA00, FGI.A0U("Exception when evaluating ", str, " for async component query."), e);
            return fbbA00;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.AGi] */
    public static final List A01(F9Q f9q, F6D f6d, HoL hoL, F9S f9s, Integer num) throws Exception {
        Map mapA0A;
        ?? A1F;
        Map map;
        LinkedHashMap linkedHashMapA0I;
        Set setA0g;
        Collection<F92> collectionValues;
        Integer num2 = num;
        if (!(hoL instanceof FAY)) {
            if (!(hoL instanceof Hnp)) {
                throw C3cG.A0q();
            }
            num2 = C79.A0C;
            String str = (String) A00(f6d, f9s.A00, AuraBloksDataProps.APP_ID);
            if (str == null) {
                str = "unknown";
            }
            FFI.A01(f6d.A02, FGI.A0U("Network request failed for component query with app id ", str, ". To find the server-side error trace, open Opes and filter to buenopaths containing that app id."), ((Hnp) hoL).A01);
        }
        Set set = f9s.A06;
        if (set == null) {
            set = A3q.A00;
        }
        for (Object obj : set) {
            if (!f9q.A06.contains(obj)) {
                Map map2 = f9q.A05;
                Object objA0k = map2.get(obj);
                if (objA0k == null) {
                    objA0k = C3cG.A0k();
                    map2.put(obj, objA0k);
                }
                String str2 = f9s.A04;
                ((Set) objA0k).add(str2);
                f9q.A04.put(str2, new F9W(hoL, f9s));
                return C0881AGi.A00;
            }
        }
        Set<String> set2 = f9q.A06;
        String str3 = f9s.A04;
        set2.add(str3);
        Map<String, F9W> map3 = f9q.A04;
        map3.remove(str3);
        Map mapA00 = Htg.A00(hoL, num2);
        if (hoL instanceof FAZ) {
            Map<String, F92> map4 = f9s.A05;
            if (map4 == null || (mapA0A = AGH.A0A(map4)) == null) {
                mapA0A = C9jH.A00;
            }
            Map<String, BloksParseResult> map5 = ((FAZ) hoL).A00.A00;
            HashMap mapA0u = BV4.A0u();
            Iterator itA0n = AnonymousClass002.A0n(mapA0A);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                F92 f92 = (F92) entryA0l.getValue();
                BloksParseResult bloksParseResult = map5.get(strA0t);
                if (bloksParseResult == null) {
                    int i = f92.A00;
                    C7648F8p c7648F8p = f92.A01;
                    StringBuilder sbA0x = C3cI.A0x("Missing ", strA0t);
                    sbA0x.append(" parseResult for target ");
                    sbA0x.append(i);
                    FFI.A01(null, AnonymousClass006.A0y(c7648F8p, ":", sbA0x), null);
                } else {
                    mapA0u.put(f92, bloksParseResult);
                }
            }
            C7648F8p c7648F8pA00 = f9s.A08 ? C7648F8p.A02.A00(AbstractC7694FAo.A00.incrementAndGet()) : null;
            ArrayList arrayListA11 = C60O.A11(mapA0u.size());
            Iterator itA0i = C3cG.A0i(mapA0u);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0i);
                BloksParseResult bloksParseResult2 = (BloksParseResult) entryA0l2.getValue();
                F92 f922 = (F92) entryA0l2.getKey();
                int i2 = f922.A00;
                FDW fdw = bloksParseResult2.A02;
                FDW fdwA00 = FAH.A00(null, new C7634F7r(fdw, c7648F8pA00), fdw);
                F9T f9t = bloksParseResult2.A01;
                List list = f9t.A06;
                Map<String, C7616F6s> map6 = f9t.A08;
                List<F97> list2 = f9t.A03;
                List<F9S> list3 = f9t.A02;
                C7384Etj.A0T(list3);
                ArrayList arrayListA0i = AnonymousClass003.A0i(list3);
                for (F9S f9s2 : list3) {
                    C7384Etj.A0X(fdwA00);
                    C7384Etj.A0X(f9s2);
                    Map<String, F92> map7 = f9s2.A05;
                    if (map7 != null) {
                        linkedHashMapA0I = AIW.A0I(map7);
                        Iterator itA0n2 = AnonymousClass002.A0n(map7);
                        while (itA0n2.hasNext()) {
                            Map.Entry entryA0l3 = C3cH.A0l(itA0n2);
                            Object key = entryA0l3.getKey();
                            FB7 fb7 = new FB7(new F6N(((F92) entryA0l3.getValue()).A02));
                            FB5.A00(fdwA00, fb7, 2);
                            FDW fdw2 = fb7.A00;
                            if (fdw2 == null) {
                                throw new Exception(FGI.A0M("Failed to find async component container for ", f9s2.A04));
                            }
                            String strA0E = fdw2.A0E();
                            C7384Etj.A0X(strA0E);
                            int i3 = fdw2.A04;
                            C7648F8p c7648F8p2 = fdw2.A09;
                            if (c7648F8p2 == null) {
                                c7648F8p2 = C7648F8p.A02;
                            }
                            linkedHashMapA0I.put(key, new F92(c7648F8p2, strA0E, i3));
                        }
                    } else {
                        linkedHashMapA0I = null;
                    }
                    arrayListA0i.add(new F9S(f9s2.A00, f9s2.A03, f9s2.A02, f9s2.A01, f9s2.A04, linkedHashMapA0I, f9s2.A06, f9s2.A07, f9s2.A08));
                }
                F9T f9t2 = new F9T(f9t.A00, f9t.A01, list, list2, arrayListA0i, f9t.A04, f9t.A05, map6, f9t.A09, f9t.A07);
                C7613F6p c7613F6p = new C7613F6p(i2);
                Pair pair = new Pair(new FA5(c7613F6p), new F8e(c7613F6p, Collections.singletonList(fdwA00)));
                Object obj2 = pair.first;
                C7384Etj.A0T(obj2);
                Object obj3 = pair.second;
                C7384Etj.A0T(obj3);
                F9U f9u = new F9U(new BloksParseResult(null, f9t2, fdwA00, null), (FAW) obj2, (FAS) obj3);
                HsM hsM = f9s.A02;
                if (hsM != null) {
                    Object objA00 = FDH.A00(Hj6.A02, hsM, F6D.A02(f6d, f922.A01));
                    C7384Etj.A0Z(objA00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    map = (Map) objA00;
                } else {
                    map = C9jH.A00;
                }
                ArrayList arrayListA112 = C60O.A11(map.size());
                Iterator itA0n3 = AnonymousClass002.A0n(map);
                while (itA0n3.hasNext()) {
                    Map.Entry entryA0l4 = C3cH.A0l(itA0n3);
                    String strA0t2 = C60O.A0t(entryA0l4);
                    if (c7648F8pA00 != null && c7648F8pA00.A01.length != 0) {
                        strA0t2 = AbstractC7647F8o.A02(strA0t2, AbstractC7647F8o.A00(c7648F8pA00, C79.A00));
                    }
                    arrayListA112.add(new F9V(new F8M(strA0t2, entryA0l4.getValue()), null));
                }
                String strA0M = FGI.A0M("query_info_", str3);
                C7648F8p c7648F8p3 = f922.A01;
                if (c7648F8p3 != null && c7648F8p3.A01.length != 0) {
                    strA0M = AbstractC7647F8o.A02(strA0M, AbstractC7647F8o.A00(c7648F8p3, C79.A00));
                }
                arrayListA11.add(AbstractC0878AGe.A0Q(new F9V(new F8M(strA0M, mapA00), f9u), arrayListA112));
            }
            A1F = Hr7.A1F(arrayListA11);
        } else {
            Map<String, F92> map8 = f9s.A05;
            if (map8 == null || (collectionValues = map8.values()) == null) {
                A1F = C0881AGi.A00;
            } else {
                A1F = AnonymousClass003.A0i(collectionValues);
                for (F92 f923 : collectionValues) {
                    String strA0M2 = FGI.A0M("query_info_", str3);
                    C7648F8p c7648F8p4 = f923.A01;
                    if (c7648F8p4 != null && c7648F8p4.A01.length != 0) {
                        strA0M2 = AbstractC7647F8o.A02(strA0M2, AbstractC7647F8o.A00(c7648F8p4, C79.A00));
                    }
                    A1F.add(new F9V(new F8M(strA0M2, mapA00), null));
                }
            }
        }
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(A1F);
        Map<String, Set<String>> map9 = f9q.A05;
        Set<String> set3 = map9.get(str3);
        if (set3 == null || (setA0g = AbstractC0878AGe.A0g(set3)) == null) {
            setA0g = A3q.A00;
        }
        Iterator it = setA0g.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            F9W f9w = map3.get(strA0j);
            if (f9w == null) {
                FFI.A01(null, FGI.A0U("Expected to find pending response for ", strA0j, " but found none."), null);
            } else {
                arrayListA0R.addAll(A01(f9q, f6d, f9w.A00, f9w.A01, num2));
                map9.remove(str3);
            }
        }
        return AbstractC0878AGe.A0X(arrayListA0R);
    }
}
