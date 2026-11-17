package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DJr implements DKD {
    public final List<DKD> A00 = C3cG.A0h();
    public final int A01;

    @Override // X.DKD
    public final boolean AOl(long j) {
        int i = this.A01;
        Iterator<DKD> it = this.A00.iterator();
        if (i == 2) {
            while (it.hasNext()) {
                if (it.next().AOl(j)) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (!it.next().AOl(j)) {
                return false;
            }
        }
        return true;
    }

    public DJr(int i) {
        this.A01 = i;
    }
}
