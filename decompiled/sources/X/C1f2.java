package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1f2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1f2 {
    public static void A00(Object obj, ArrayList arrayList) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            if (length > 0) {
                arrayList.ensureCapacity(arrayList.size() + length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                StringBuilder sb = new StringBuilder("Don't know how to spread ");
                sb.append(obj.getClass());
                throw new UnsupportedOperationException(sb.toString());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }
}
