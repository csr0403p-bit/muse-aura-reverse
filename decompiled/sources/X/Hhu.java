package X;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class Hhu<T> {
    public final HsC<ArrayList<T>> A01 = new C3111Bya(10);
    public final DQZ<T, ArrayList<T>> A00 = new DQZ<>(0);
    public final ArrayList<T> A02 = C3cG.A0h();
    public final HashSet<T> A03 = C60O.A13();

    public static void A00(Hhu hhu, Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw BV4.A0c("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList<T> arrayList2 = hhu.A00.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                A00(hhu, arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
