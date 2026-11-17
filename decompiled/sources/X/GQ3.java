package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GQ3 implements Iterable<C9934Glc> {
    public Map<C9338GEv, C9934Glc> A00;

    @Override // java.lang.Iterable
    public final Iterator<C9934Glc> iterator() {
        Map<C9338GEv, C9934Glc> map = this.A00;
        return map == null ? Collections.EMPTY_LIST.iterator() : BV5.A10(map);
    }
}
