package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.E2k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6358E2k extends AbstractC6398E4a {
    public final long A00;
    public final List<C6358E2k> A01;
    public final List<C6419E4v> A02;

    public final C6358E2k A00(int i) {
        List<C6358E2k> list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C6358E2k c6358E2k = list.get(i2);
            if (((AbstractC6398E4a) c6358E2k).A00 == i) {
                return c6358E2k;
            }
        }
        return null;
    }

    public final C6419E4v A01(int i) {
        List<C6419E4v> list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C6419E4v c6419E4v = list.get(i2);
            if (((AbstractC6398E4a) c6419E4v).A00 == i) {
                return c6419E4v;
            }
        }
        return null;
    }

    @Override // X.AbstractC6398E4a
    public final String toString() {
        return FGI.A0h(AbstractC6398E4a.A00(super.A00), " leaves: ", Arrays.toString(this.A02.toArray()), " containers: ", Arrays.toString(this.A01.toArray()));
    }

    public C6358E2k(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = C3cG.A0h();
        this.A01 = C3cG.A0h();
    }
}
