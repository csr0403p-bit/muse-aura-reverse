package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class GYY {
    public final CopyOnWriteArrayList<GYZ> A00 = new CopyOnWriteArrayList<>();

    public final void A00(GYb gYb) {
        CopyOnWriteArrayList<GYZ> copyOnWriteArrayList = this.A00;
        Iterator<GYZ> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            GYZ next = it.next();
            if (next.A02 == gYb) {
                next.A00 = true;
                copyOnWriteArrayList.remove(next);
            }
        }
    }
}
