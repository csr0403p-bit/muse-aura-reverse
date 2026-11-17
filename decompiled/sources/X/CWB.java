package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CWB {
    public final Map A00 = BV4.A0u();

    public CWB(Set<CWO> set) {
        Iterator<CWO> it = set.iterator();
        while (it.hasNext()) {
            this.A00.put(AbstractC7480ExW.class, it.next().A00);
        }
    }
}
