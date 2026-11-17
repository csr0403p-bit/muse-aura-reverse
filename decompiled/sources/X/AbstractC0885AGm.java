package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.AGm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0885AGm extends AIM {
    public static final int A0w(Comparable comparable, List list, int i) {
        int i2 = 0;
        A15(list.size(), i);
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iA00 = AbstractC7536F0j.A00((Comparable) list.get(i4), comparable);
            if (iA00 < 0) {
                i2 = i4 + 1;
            } else {
                if (iA00 <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final <T> ArrayList<T> A0x(T... tArr) {
        return new ArrayList<>(new A5v(tArr, true));
    }

    public static final <T> List<T> A0y(T... tArr) {
        return new ArrayList(new A5v(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> A10(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size == 1 ? Collections.singletonList(list.get(0)) : list : C0881AGi.A00;
    }

    public static final <T> List<T> A11(T... tArr) {
        C7384Etj.A0Y(tArr, 0);
        return tArr.length > 0 ? Arrays.asList(tArr) : C0881AGi.A00;
    }

    public static final ADq A12(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        return new ADq(0, collection.size() - 1);
    }

    public static final void A15(int i, int i2) {
        if (0 > i2) {
            throw new IllegalArgumentException(FGI.A0Y("fromIndex (", ") is greater than toIndex (", ").", 0, i2));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(FGI.A0Y("toIndex (", ") is greater than size (", ").", i2, i));
        }
    }

    public static final <T> List<T> A0z(T t) {
        return t != null ? Collections.singletonList(t) : C0881AGi.A00;
    }

    public static final void A13() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void A14() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void A16(Object obj, List list, int i) {
        AbstractC06907md.A04(list, new BSG(obj, i));
    }
}
