package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Eub, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7398Eub {
    public static <T> T A00(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw C8j3.A1D();
            }
            return (T) BV5.A0e(list);
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T A01(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sbA0f = C3cG.A0f(next, "expected one element but was: <");
        int i = 0;
        while (it.hasNext()) {
            C8j3.A1K(sbA0f);
            sbA0f.append(it.next());
            i++;
            if (i >= 4) {
                break;
            }
        }
        if (it.hasNext()) {
            sbA0f.append(", ...");
        }
        throw C60O.A0i(C8j3.A16(sbA0f, '>'));
    }
}
