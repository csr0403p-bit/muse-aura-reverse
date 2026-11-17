package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.CIr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3385CIr {
    public final Set A00 = C60O.A13();

    public final synchronized void A00(Object obj) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((CIz) it.next()).onStateUpdate(obj);
        }
    }
}
