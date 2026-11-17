package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class GQ8 {
    public final int A00;
    public final List<GQA> A01;

    public final GQA A00() {
        GQA gqaRemove;
        List<GQA> list = this.A01;
        synchronized (list) {
            gqaRemove = !list.isEmpty() ? list.remove(C60O.A00(list)) : null;
        }
        if (gqaRemove == null) {
            return new GQA();
        }
        Arrays.fill(gqaRemove.A00, 0L);
        return gqaRemove;
    }

    public final void A01(GQA gqa) {
        Arrays.fill(gqa.A00, 0L);
        List<GQA> list = this.A01;
        synchronized (list) {
            if (list.size() < this.A00) {
                list.add(gqa);
            }
        }
    }

    public GQ8(int i) {
        this.A00 = i;
        this.A01 = C60O.A11(i);
    }
}
