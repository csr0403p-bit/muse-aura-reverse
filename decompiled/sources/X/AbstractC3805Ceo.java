package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Ceo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3805Ceo extends AbstractC3806Cep implements Set {
    public transient AbstractC3804Cen A00;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (!containsAll(set)) {
                            return false;
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }
}
