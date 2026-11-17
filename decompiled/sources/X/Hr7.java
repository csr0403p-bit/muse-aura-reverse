package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Hr7 extends AbstractC0885AGm {
    public static final <T> int A1D(Iterable<? extends T> iterable, int i) {
        C7384Etj.A0Y(iterable, 0);
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList A1E(Iterable iterable) {
        C7384Etj.A0Y(iterable, 0);
        return new ArrayList(A1D(iterable, 10));
    }

    public static final <T> List<T> A1F(Iterable<? extends Iterable<? extends T>> iterable) {
        C7384Etj.A0Y(iterable, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next(), arrayListA0h);
        }
        return arrayListA0h;
    }

    public static int A1C(Iterable iterable) {
        int iA0H = AIW.A0H(A1D(iterable, 10));
        if (iA0H < 16) {
            return 16;
        }
        return iA0H;
    }

    public static List A1I(Iterable iterable, int i) {
        return AbstractC0878AGe.A0c(iterable, new C10634I0e(i));
    }

    public static ArrayList A1G(Collection collection, Object[] objArr) {
        return AbstractC0878AGe.A0P(Arrays.asList(objArr), collection);
    }

    public static List A1H(Iterable iterable) {
        return Collections.unmodifiableList(AbstractC0878AGe.A0X(iterable));
    }
}
