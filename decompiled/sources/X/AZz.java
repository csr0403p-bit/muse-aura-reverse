package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class AZz<T> {
    public float[] A00;
    public final List<T> A01 = C3cG.A0h();

    public final void A00(T t, float f) {
        List<T> list = this.A01;
        list.add(t);
        if (this.A00.length < list.size()) {
            float[] fArrCopyOf = Arrays.copyOf(this.A00, list.size() + 2);
            C7384Etj.A0U(fArrCopyOf);
            this.A00 = fArrCopyOf;
        }
        this.A00[C60O.A00(list)] = f;
    }

    public AZz() {
        float[] fArr = new float[5];
        int i = 0;
        do {
            fArr[i] = Float.NaN;
            i++;
        } while (i < 5);
        this.A00 = fArr;
    }
}
