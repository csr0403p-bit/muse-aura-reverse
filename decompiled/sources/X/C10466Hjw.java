package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hjw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10466Hjw {
    public List<HAl> A01 = null;
    public int A00 = 0;

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        Iterator<HAl> it = this.A01.iterator();
        while (it.hasNext()) {
            sbA0w.append(it.next());
            sbA0w.append(' ');
        }
        sbA0w.append('[');
        sbA0w.append(this.A00);
        return BV5.A0o(sbA0w);
    }
}
