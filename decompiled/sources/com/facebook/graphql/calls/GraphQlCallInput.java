package com.facebook.graphql.calls;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV6;
import X.BV8;
import X.C3339CFj;
import X.C3340CFk;
import X.C3341CFl;
import X.C3cH;
import X.C60O;
import X.C8j3;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@JsonSerialize(using = GraphQlCallInputSerializer.class)
/* loaded from: classes5.dex */
public abstract class GraphQlCallInput {
    public static final C3339CFj A02 = new C3339CFj();
    public C3339CFj A01 = A02;
    public C3341CFl A00 = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private Object A00(Object obj) {
        String string;
        if (obj == 0) {
            return null;
        }
        if (obj instanceof C3340CFk) {
            ArrayList<Object> arrayList = ((C3340CFk) obj).A00;
            if (arrayList.size() > 0 && (BV6.A0m(arrayList) instanceof C3341CFl)) {
                obj = C8j3.A19(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        obj.add(A00(arrayList.get(i)));
                    }
                }
            } else if (arrayList.size() <= 0 || !(BV6.A0m(arrayList) instanceof C3340CFk)) {
                obj = C8j3.A19(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Object obj2 = arrayList.get(i2);
                    if (obj2 == null) {
                        string = null;
                    } else if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                        obj.add(obj2);
                    } else {
                        string = obj2.toString();
                    }
                    obj.add(string);
                }
            } else {
                obj = C8j3.A19(arrayList);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (arrayList.get(i3) != null) {
                        obj.add(A00(arrayList.get(i3)));
                    }
                }
            }
        } else if (obj instanceof C3341CFl) {
            TreeMap treeMap = new TreeMap();
            A02((C3341CFl) obj, treeMap);
            return treeMap;
        }
        return obj;
    }

    private final void A01(C3340CFk c3340CFk, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                if (obj instanceof List) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = (List) it.next();
                        C3340CFk c3340CFkA02 = c3340CFk.A01.A02();
                        c3340CFk.A0C(c3340CFkA02);
                        A01(c3340CFkA02, list2);
                    }
                    return;
                }
                if (obj instanceof String) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C3340CFk.A00(c3340CFk, it2.next());
                    }
                    return;
                }
                if (obj instanceof Boolean) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C3340CFk.A00(c3340CFk, it3.next());
                    }
                    return;
                }
                if (obj instanceof Number) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        C3340CFk.A00(c3340CFk, it4.next());
                    }
                    return;
                }
                if (obj instanceof Enum) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        C3340CFk.A00(c3340CFk, it5.next().toString());
                    }
                    return;
                } else if (obj instanceof GraphQlCallInput) {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        c3340CFk.A0C(((GraphQlCallInput) it6.next()).A04());
                    }
                    return;
                } else {
                    if (!(obj instanceof Map)) {
                        throw C60O.A0i(BV8.A0x("List value type is not supported: ", obj));
                    }
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        Map<String, Object> map = (Map) it7.next();
                        C3341CFl c3341CFlA03 = c3340CFk.A01.A03();
                        c3340CFk.A0C(c3341CFlA03);
                        A03(c3341CFlA03, map);
                    }
                    return;
                }
            }
        }
    }

    private void A02(C3341CFl c3341CFl, Map<String, Object> map) {
        if (c3341CFl != null) {
            for (int i = 0; i < c3341CFl.A00; i++) {
                map.put(c3341CFl.A0D(i), A00(c3341CFl.A0C(i)));
            }
        }
    }

    public final C3341CFl A04() {
        C3341CFl c3341CFl = this.A00;
        if (c3341CFl != null) {
            return c3341CFl;
        }
        C3341CFl c3341CFlA03 = this.A01.A03();
        this.A00 = c3341CFlA03;
        return c3341CFlA03;
    }

    public final Map<String, Object> A05() {
        TreeMap treeMap = new TreeMap();
        A02(this.A00, treeMap);
        return treeMap;
    }

    private final void A03(C3341CFl c3341CFl, Map<String, Object> map) {
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            String value = entryA0l.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    value = AnonymousClass001.A1X(value) ? "true" : "false";
                } else if (!(value instanceof Number) && !(value instanceof String)) {
                    if (value instanceof Enum) {
                        value = value.toString();
                    } else if (value instanceof GraphQlCallInput) {
                        c3341CFl.A0E(((GraphQlCallInput) value).A04(), strA0t);
                    } else if (value instanceof List) {
                        A01(C3339CFj.A00(c3341CFl, strA0t), (List) value);
                    } else {
                        if (!(value instanceof Map)) {
                            throw C60O.A0i(BV8.A0x("Unexpected object value type ", value));
                        }
                        A03(C3339CFj.A01(c3341CFl, strA0t), (Map) value);
                    }
                }
                C3341CFl.A00(c3341CFl, value, strA0t);
            }
        }
    }

    public final void A06(String str) {
        C3341CFl c3341CFlA04 = A04();
        for (int i = 0; i < c3341CFlA04.A00; i++) {
            if (c3341CFlA04.A0D(i).equals(str)) {
                ArrayList<Object> arrayList = c3341CFlA04.A01;
                int i2 = i * 2;
                arrayList.remove(i2 + 1);
                arrayList.remove(i2);
                c3341CFlA04.A00--;
                return;
            }
        }
    }

    public final void A07(String str, Boolean bool) {
        C3341CFl.A00(A04(), bool, str);
    }

    public final void A08(String str, String str2) {
        C3341CFl.A00(A04(), str2, str);
    }

    public final void A09(String str, List list) {
        A01(C3339CFj.A00(A04(), str), list);
    }
}
