package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class Ce7 {
    public static SparseArray<Ce5> A00 = BV4.A0B();
    public static HashMap<Ce5, Integer> A01;

    public static int A00(Ce5 ce5) {
        Number numberA0j = BV6.A0j(ce5, A01);
        if (numberA0j != null) {
            return numberA0j.intValue();
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("PriorityMapping is missing known Priority value ", ce5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HashMap<Ce5, Integer> mapA0u = BV4.A0u();
        A01 = mapA0u;
        C8j4.A1O(Ce5.DEFAULT, mapA0u, 0);
        C8j4.A1O(Ce5.VERY_LOW, A01, 1);
        C8j4.A1O(Ce5.HIGHEST, A01, 2);
        Iterator itA0y = BV5.A0y(A01);
        while (itA0y.hasNext()) {
            Object next = itA0y.next();
            A00.append(AnonymousClass001.A0F(A01.get(next)), next);
        }
    }
}
