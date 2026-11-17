package X;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.AGn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0886AGn {
    public static final void A01(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(FGI.A0Y("toIndex (", ") is greater than size (", ").", i, i2));
        }
    }

    public static void A02(AnchoredDraggableState anchoredDraggableState, G0U g0u) {
        AZz aZz = new AZz();
        g0u.invoke(aZz);
        List<T> list = aZz.A01;
        float[] fArr = aZz.A00;
        int size = list.size();
        A01(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        C7384Etj.A0U(fArrCopyOfRange);
        AnchoredDraggableState.A00(anchoredDraggableState, new C1150Acf(list, fArrCopyOfRange));
    }
}
