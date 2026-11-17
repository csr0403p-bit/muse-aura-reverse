package com.facebook.aura.json;

import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.G0U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class WireEnumOptionsKt {
    public static final <T> List<T> wireEnumOptions(List<String> list, T t, List<? extends T> list2, G0U<? super String, ? extends T> g0u) {
        AnonymousClass005.A11(t, list2, g0u, 1);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                T tInvoke = g0u.invoke(it.next());
                if (tInvoke != null) {
                    arrayList.add(tInvoke);
                }
            }
            List<? extends T> listA0X = AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList));
            if (listA0X != null) {
                list2 = (List<T>) listA0X;
            }
        }
        return list2.contains(t) ? (List<T>) list2 : AbstractC0878AGe.A0Q(t, list2);
    }
}
