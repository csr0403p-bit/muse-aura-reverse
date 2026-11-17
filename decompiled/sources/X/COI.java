package X;

import java.util.Comparator;

/* loaded from: classes5.dex */
public abstract class COI implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this instanceof COJ) {
            return ((COJ) this).zza.compare(obj2, obj);
        }
        if (this instanceof COH) {
            Comparable comparable = (Comparable) obj2;
            obj.getClass();
            if (obj == comparable) {
                return 0;
            }
            return comparable.compareTo(obj);
        }
        if (!(this instanceof COG)) {
            return ((COE) this).zza.compare(obj, obj2);
        }
        Comparable comparable2 = (Comparable) obj;
        comparable2.getClass();
        obj2.getClass();
        return comparable2.compareTo(obj2);
    }
}
