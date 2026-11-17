package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class BHL extends AbstractC0882AGj {
    public static final <T> List<T> A1B(List<? extends T> list) {
        C7384Etj.A0Y(list, 0);
        return new C0893AGu(list);
    }

    public static final int A19(List<?> list, int i) {
        if (i >= 0 && i <= C60O.A00(list)) {
            return C60O.A00(list) - i;
        }
        StringBuilder sbA0y = C60O.A0y("Element index ", i);
        sbA0y.append(" must be in range [");
        sbA0y.append(new ADq(0, C60O.A00(list)));
        throw new IndexOutOfBoundsException(AnonymousClass001.A0v("].", sbA0y));
    }

    public static final int A1A(List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbA0y = C60O.A0y("Position index ", i);
        sbA0y.append(" must be in range [");
        sbA0y.append(new ADq(0, list.size()));
        throw new IndexOutOfBoundsException(AnonymousClass001.A0v("].", sbA0y));
    }
}
