package X;

import X.F6L;
import com.instagram.common.lispy.lang.BloksScriptingException;
import com.instagram.common.lispy.lang.UnsupportedFunctionException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Hj5<T extends F6L> implements Htq<T> {
    public final Htq<T> A00;

    /* JADX WARN: Incorrect types in method signature: (LX/HyR;LX/Hj6;TT;)Ljava/lang/Object; */
    @Override // X.Htq
    public final Object AAu(Hj6 hj6, F6L f6l, HyR hyR) {
        Collection collectionKeySet;
        C7384Etj.A0Y(hyR, 0);
        C7384Etj.A0Y(f6l, 2);
        if (hyR instanceof C5216DdS) {
            int i = ((C5216DdS) hyR).A00;
            int i2 = 0;
            if (i == 17585) {
                Object[] objArr = hj6.A01;
                List list = (List) objArr[0];
                HsM hsM = (HsM) BV6.A0n(objArr, 1);
                Object objA00 = hj6.A01[2];
                if (list != null) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C9115Fyg c9115FygA02 = C9115Fyg.A02(objA00);
                        c9115FygA02.A06(list.get(i3), 1);
                        try {
                            objA00 = FDH.A00(C9115Fyg.A03(c9115FygA02, Integer.valueOf(i3), 2), hsM, f6l);
                        } catch (BloksScriptingException e) {
                            throw BV4.A0e(e);
                        }
                    }
                }
                return objA00;
            }
            if (i == 18332) {
                return HoH.A00(Math.log(AbstractC7610F5x.A02(hj6, 0)));
            }
            if (i == 19599) {
                Map map = (Map) AbstractC7608F5v.A0j(hj6, 0);
                HsM hsM2 = (HsM) AbstractC7608F5v.A0j(hj6, 1);
                HashMap mapA0u = BV4.A0u();
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    Object key = entryA0l.getKey();
                    Object value = entryA0l.getValue();
                    try {
                        if (HoH.A01(FDH.A00(C9115Fyg.A03(C9115Fyg.A02(key), value, 1), hsM2, f6l))) {
                            mapA0u.put(key, value);
                        }
                    } catch (BloksScriptingException e2) {
                        throw BV4.A0e(e2);
                    }
                }
                return mapA0u;
            }
            if (i == 19601) {
                collectionKeySet = ((Map) AbstractC7608F5v.A0j(hj6, 0)).keySet();
            } else {
                if (i == 19604) {
                    HashMap mapA0u2 = BV4.A0u();
                    int i4 = hj6.A00;
                    while (i2 < i4) {
                        Map map2 = (Map) hj6.A01[i2];
                        if (map2 != null) {
                            mapA0u2.putAll(map2);
                        }
                        i2++;
                    }
                    return mapA0u2;
                }
                if (i == 19610) {
                    collectionKeySet = ((Map) AbstractC7608F5v.A0j(hj6, 0)).values();
                } else {
                    if (i == 20230) {
                        return Boolean.valueOf(C7BY.A0q(AbstractC7609F5w.A0r(hj6, 0), AbstractC7609F5w.A0r(hj6, 1), false));
                    }
                    if (i == 20238) {
                        Object[] objArr2 = hj6.A01;
                        String str = (String) objArr2[0];
                        Object obj = objArr2[1];
                        C7384Etj.A0Z(obj, C8j2.A00(73));
                        List list2 = (List) obj;
                        StringBuilder sbA0w = C60O.A0w();
                        if (str == null) {
                            throw C60O.A0i("delimiter must not be null");
                        }
                        int size2 = list2.size();
                        while (i2 < size2) {
                            String strA0n = C60Q.A0n(list2, i2);
                            if (strA0n == null) {
                                throw C60O.A0i("element must not be null");
                            }
                            sbA0w.append(strA0n);
                            if (i2 < AbstractC7607F5u.A0J(list2, 1)) {
                                sbA0w.append(str);
                            }
                            i2++;
                        }
                        return sbA0w.toString();
                    }
                    if (i == 20257) {
                        Object obj2 = hj6.A01[0];
                        C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str2 = (String) obj2;
                        Object obj3 = hj6.A01[1];
                        C7384Etj.A0Z(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj3;
                        C7384Etj.A0Y(str2, 0);
                        C7384Etj.A0Y(str3, 1);
                        return Boolean.valueOf(str2.startsWith(str3));
                    }
                    if (i == 20263) {
                        long jA0U = AbstractC7610F5x.A0U(hj6, 0);
                        long jA0M = AbstractC7610F5x.A0M(hj6, 1);
                        if (jA0M < 2 || jA0M > 36) {
                            throw C60O.A0i("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                        }
                        int i5 = (int) jA0M;
                        if (2 > i5 || i5 >= 37) {
                            StringBuilder sbA0y = C60O.A0y("radix ", i5);
                            sbA0y.append(" was not in valid range ");
                            throw C60O.A0i(C8j3.A14(AbstractC7607F5u.A1C(2, 36), sbA0y));
                        }
                        String string = Long.toString(jA0U, i5);
                        C7384Etj.A0U(string);
                        return string;
                    }
                    if (i == 18335) {
                        return HoH.A00(Math.pow(AbstractC7610F5x.A02(hj6, 0), AbstractC7610F5x.A02(hj6, 1)));
                    }
                    if (i == 18336) {
                        return HoH.A00(Math.sqrt(AbstractC7610F5x.A02(hj6, 0)));
                    }
                    if (i == 20259) {
                        Object obj4 = hj6.A01[0];
                        C7384Etj.A0Z(obj4, "null cannot be cast to non-null type kotlin.String");
                        return AnonymousClass001.A0u((String) obj4);
                    }
                    if (i == 20260) {
                        Object obj5 = hj6.A01[0];
                        C7384Etj.A0Z(obj5, "null cannot be cast to non-null type kotlin.String");
                        return ((String) obj5).toUpperCase(Locale.ROOT);
                    }
                }
            }
            return BV4.A0t(collectionKeySet);
        }
        Htq<T> htq = this.A00;
        if (htq != null) {
            return htq.AAu(hj6, f6l, hyR);
        }
        throw new UnsupportedFunctionException(AnonymousClass007.A0a("unknown function ", hyR));
    }

    public Hj5(Htq<T> htq) {
        this.A00 = htq;
    }
}
