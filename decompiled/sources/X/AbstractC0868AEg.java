package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AEg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0868AEg {
    public static final List<Float> A01(List<Float> list, List<Float> list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayListA11 = C60O.A11(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayListA11.add(Float.valueOf(AnonymousClass003.A01(f, C8j4.A03(list, Math.min(i, C60O.A00(list))), C8j4.A03(list2, Math.min(i, C60O.A00(list2))))));
        }
        return arrayListA11;
    }

    public static final List<B6A> A00(List<B6A> list, List<B6A> list2, float f) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayListA11 = C60O.A11(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayListA11.add(C60P.A04(HxS.A03(C8j4.A0P(list, Math.min(i, C60O.A00(list))), C8j4.A0P(list2, Math.min(i, C60O.A00(list2))), f)));
        }
        return arrayListA11;
    }
}
