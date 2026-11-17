package X;

import java.util.List;

/* renamed from: X.AHj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0907AHj {
    public static final Object[] A01 = new Object[0];
    public static final AbstractC0913AHp<Object> A00 = new C0912AHo(0);

    public static final void A00(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(FGI.A0Y("Index ", " is out of bounds. The list has ", " elements.", i, size));
        }
    }

    public static final void A01(List<?> list, int i, int i2) {
        StringBuilder sbA0y;
        String str;
        int size = list.size();
        if (i > i2) {
            throw C60O.A0i(FGI.A0Y("Indices are out of order. fromIndex (", ") is greater than toIndex (", ").", i, i2));
        }
        if (i < 0) {
            sbA0y = C60O.A0y("fromIndex (", i);
            str = ") is less than 0.";
        } else {
            if (i2 <= size) {
                return;
            }
            sbA0y = C60O.A0y("toIndex (", i2);
            sbA0y.append(") is more than than the list size (");
            sbA0y.append(size);
            str = ")";
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A0v(str, sbA0y));
    }
}
