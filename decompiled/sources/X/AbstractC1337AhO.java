package X;

import java.util.List;

/* renamed from: X.AhO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1337AhO {
    public static final void A00(List<B6A> list, List<Float> list2) {
        int size = list.size();
        if (list2 == null) {
            if (size < 2) {
                throw C60O.A0i("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (size != list2.size()) {
            throw C60O.A0i("colors and colorStops arguments must have equal length.");
        }
    }
}
