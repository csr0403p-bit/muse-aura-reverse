package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3bI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bI implements Comparator {
    public final int $t;

    public C3bI(int i) {
        this.$t = i;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Comparable comparable;
        Comparable comparable2;
        switch (this.$t) {
            case 0:
            case 1:
                comparable = (Integer) ((Map.Entry) t).getKey();
                comparable2 = (Integer) ((Map.Entry) t2).getKey();
                break;
            case 2:
            case 3:
                comparable = (Long) ((Map.Entry) t).getKey();
                comparable2 = (Long) ((Map.Entry) t2).getKey();
                break;
            default:
                return 0;
        }
        return AbstractC7536F0j.A00(comparable, comparable2);
    }
}
