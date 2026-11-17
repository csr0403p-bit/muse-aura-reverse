package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AGs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0891AGs<E> extends AbstractC0890AGr<E> implements Set<E>, BOA {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C7384Etj.A0Y(set, 1);
        if (size() == set.size()) {
            return containsAll(set);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }
}
