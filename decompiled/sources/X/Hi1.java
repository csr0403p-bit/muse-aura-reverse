package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class Hi1 {
    public final /* synthetic */ C8021FPx A00;

    public Hi1(C8021FPx c8021FPx) {
        this.A00 = c8021FPx;
    }

    public final void A00() {
        ArrayList arrayListA11;
        LinkedHashMap<Integer, Runnable> linkedHashMap = this.A00.A04;
        synchronized (linkedHashMap) {
            if (C8021FPx.skipIteratorCalls && linkedHashMap.isEmpty()) {
                arrayListA11 = null;
            } else {
                arrayListA11 = C60O.A11(linkedHashMap.size());
                Iterator itA0x = BV5.A0x(linkedHashMap);
                while (itA0x.hasNext()) {
                    arrayListA11.add((Runnable) itA0x.next());
                }
                linkedHashMap.clear();
            }
        }
        if (arrayListA11 != null) {
            Iterator it = arrayListA11.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }
}
