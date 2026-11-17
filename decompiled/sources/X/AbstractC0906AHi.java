package X;

import java.util.List;

/* renamed from: X.AHi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0906AHi {
    public static final void A01(List<?> list, int i, int i2) {
        if (i > i2) {
            throw C60O.A0i(FGI.A0Y("Indices are out of order. fromIndex (", ") is greater than toIndex (", ").", i, i2));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(FGI.A0I("fromIndex (", i, ") is less than 0."));
        }
        if (i2 > list.size()) {
            throw new IndexOutOfBoundsException(C8j4.A0y("toIndex (", ") is more than than the list size (", i2, list.size()));
        }
    }

    public static final void A00(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(FGI.A0Y("Index ", " is out of bounds. The list has ", " elements.", i, size));
        }
    }
}
