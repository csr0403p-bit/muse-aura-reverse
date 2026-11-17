package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Exg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7483Exg {
    public static ArrayList A00(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        ArrayList arrayList = new ArrayList();
        A01(arrayList, it);
        return arrayList;
    }

    public static <T> boolean A01(Collection<T> addTo, Iterator<? extends T> iterator) {
        iterator.getClass();
        boolean zAdd = false;
        while (iterator.hasNext()) {
            zAdd |= addTo.add(iterator.next());
        }
        return zAdd;
    }
}
